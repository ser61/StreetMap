package edu.uagrm.sergio_w.mapsig;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;

import edu.uagrm.sergio_w.mapsig.interfaces.EMainActivity;
import edu.uagrm.sergio_w.mapsig.interfaces.IMainActivity;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private GoogleMap mMap;
    private static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1, STORAGE_PERMISSION_CODE = 23;
    static boolean status, bandera = false;
    private double miLatitude, miLongitude;
    static int p = 0;
    static Button btnKilometroje;
    static ProgressDialog locate;
    LocationManager locationManager;
    LocationService myService;
    private Alertar alertar;
    private Signs signs;
    private TextToSpeech talk;
    private ServiceConnection sc = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            LocationService.LocalBinder binder = (LocationService.LocalBinder) service;
            myService = binder.getService();
            myService.addEventListener(new IMainActivity() {
                @Override
                public void move(EMainActivity event) {
                    mMap.clear();
                    LatLng currentPosition = new LatLng(event.getLocation().getLatitude(),event.getLocation().getLongitude());
                    signs.draw();
                    miLatitude = event.getLocation().getLatitude();
                    miLongitude = event.getLocation().getLongitude();
                    mMap.addMarker(new MarkerOptions()
                            .position(currentPosition)
                            .snippet("Lat:" + miLatitude + " Lng:"+ miLongitude)
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                            .title("ME"));

                    CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(miLatitude,miLongitude)).zoom(19f).build();
                    mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                }
            });
            status = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            status = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        signs = new Signs(this);
        alertar = new Alertar();
        talk = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    Locale locSpanish = new Locale("es_ES");
                    talk.setLanguage(locSpanish);
                    alertar.setPause(true);
                    alertar.execute();
                } else {
                    Toast.makeText(getApplicationContext(), "ERROR...",Toast.LENGTH_LONG).show();
                }
            }
        });
        isAlowedReadPermission();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        this.btnKilometroje = (Button) findViewById(R.id.btnKilometroje);

        FloatingActionButton fabSpeedButton = (FloatingActionButton) findViewById(R.id.fabSpeedButton);
        fabSpeedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bandera) {
                    sayMessage("Navegacion Desactivada.");
                    btnKilometroje.setVisibility(View.GONE);
                    bandera = false;
                    alertar.setPause(true);
                    if (status == true)
                        unbindService();
                    p = 0;
                } else {
                    sayMessage("Navegacion Activada.");
                    btnKilometroje.setVisibility(View.VISIBLE);
                    bandera = true;
                    checkGps();
                    locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

                    if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                        return;
                    }

                    if (status == false)
                        //Here, the Location Service gets bound and the GPS Speedometer gets Active.
                        bindService();
                        locate = new ProgressDialog(MainActivity.this);
                        locate.setIndeterminate(true);
                        locate.setCancelable(false);
                        locate.setMessage("Obteniendo ubicacion...");
                        locate.show();
                        alertar.setPause(false);
                    }
                }
            }
        );
    }

    public void sayMessage(String msj) {
        talk.speak(msj, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    protected void onResume() {
        alertar.setPause(false);
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        alertar.setPause(true);
        alertar.cancel(true);
        if (status == true)unbindService();
    }

    @Override
    protected void onPause() {
        alertar.setPause(true);
        super.onPause();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng scz = new LatLng(-17.781886, -63.182335);
        addMyLocation(true);
        signs.setmMap(mMap);
        signs.draw();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(scz,14));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
    }

    private void addMyLocation(boolean b) {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(b);
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION:
                if (permissions.length == 1 &&
                        permissions[0] == android.Manifest.permission.ACCESS_FINE_LOCATION &&
                        grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    mMap.setMyLocationEnabled(true);
                } else {
                    Toast.makeText(getBaseContext(), "Permiso denegado...", Toast.LENGTH_LONG).show();
                }
                break;
            case STORAGE_PERMISSION_CODE:
                //If permission is granted
                if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                    //Displaying a toast
                    Toast.makeText(this,"Permission granted now you can read the storage",Toast.LENGTH_LONG).show();
                }else{
                    //Displaying another toast if permission is not granted
                    Toast.makeText(this,"Oops you just denied the permission",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void isAlowedReadPermission() {
        if(isReadStorageAllowed()){
            //If permission is already having then showing the toast
            Toast.makeText(MainActivity.this,"You already have the permission",Toast.LENGTH_LONG).show();
            //Existing the method with return
            return;
        }

        //If the app has not the permission then asking for the permission
        requestStoragePermission();
    }

    //We are calling this method to check the permission status
    private boolean isReadStorageAllowed() {
        //Getting the permission status
        int result = ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE);

        //If permission is granted returning true
        if (result == PackageManager.PERMISSION_GRANTED)
            return true;

        //If permission is not granted returning false
        return false;
    }

    //Requesting permission
    private void requestStoragePermission(){

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)){
            //If the user has denied the permission previously your code will come to this block
            //Here you can explain why you need this permission
            //Explain here why you need this permission
        }

        //And finally ask for the permission
        ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE},STORAGE_PERMISSION_CODE);
    }

    void bindService() {
        if (status == true)
            return;
        Intent i = new Intent(getApplicationContext(), LocationService.class);
        bindService(i, sc, BIND_AUTO_CREATE);
        status = true;
    }

    //This method leads you to the alert dialog box.
    void checkGps() {
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            showGPSDisabledAlertToUser();
        }
    }

    //This method configures the Alert Dialog box.
    private void showGPSDisabledAlertToUser() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Enable GPS to use application").setCancelable(false).setPositiveButton("Enable GPS",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent callGPSSettingIntent = new Intent(
                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(callGPSSettingIntent);
            }
        });
        alertDialogBuilder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    void unbindService() {
        if (status == false)
            return;
        Intent i = new Intent(getApplicationContext(), LocationService.class);
        unbindService(sc);
        status = false;
    }

    private class Alertar extends AsyncTask<Void, Void, Void>{

        private boolean pause;

        public Alertar() {
            this.pause = false;

        }

        public boolean isPause() {
            return pause;
        }

        public void setPause(boolean pause) {
            this.pause = pause;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            while (true) {
                if (pause) {

                } else {
                    try {
                        Thread.sleep(100);
                        publishProgress();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            Location miLocacion = new Location("");
            miLocacion.setLatitude(miLatitude);
            miLocacion.setLongitude(miLongitude);
            for (Signs.Coord coord : signs.getCoords()) {
                Location locSign = new Location("");
                locSign.setLatitude(coord.getLat());
                locSign.setLongitude(coord.getLog());
                float distanceInMeters = miLocacion.distanceTo(locSign);
                if (distanceInMeters < 25.00) {
                    if (!coord.isEstado()) {
                        sayMessage(coord.getAlarma());
                        coord.setEstado(true);
                    }
                } else {
                    coord.setEstado(false);
                }
            }
        }
    }
}
