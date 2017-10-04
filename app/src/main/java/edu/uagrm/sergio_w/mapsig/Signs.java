package edu.uagrm.sergio_w.mapsig;

import android.content.Context;

import com.google.android.gms.drive.internal.StringListResponse;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by Sergio_W on 04/10/2017.
 */

public class Signs {

    GoogleMap mMap;
    ArrayList<Coord> coords;
    Context context;

    public static final int MAX20 = R.drawable.velocidad_20;            //1
    public static final int MAX30 = R.drawable.velocidad_30;            //1
    public static final int MAX40 = R.drawable.velocidad_40;            //1
    public static final int MAX50 = R.drawable.velocidad_50;            //1
    public static final int MAX60 = R.drawable.velocidad_60;            //1
    public static final int MAX70 = R.drawable.velocidad_70;            //1
    public static final int MAX80 = R.drawable.velocidad_80;            //1
    public static final int MAX90 = R.drawable.velocidad_90;            //1
    public static final int MAX100 = R.drawable.velocidad_100;          //1
    public static final int ROMPE_MUELLE = R.drawable.rompemuelle;      //2
    public static final int ZONA_ESCUELA = R.drawable.zona_escolar;     //3
    public static final int NO_GIRAR_IZQ = R.drawable.no_girar_izq;     //4
    public static final int CEDA_PASO = R.drawable.ceda_paso;           //5
    public static final int PARE = R.drawable.pare;                     //6
    public static final int ZONA_HOSPITAL = R.drawable.hospital;        //7
    public static final int NO_GIRAR_U = R.drawable.no_girar_u;         //8
    public static final int SEMAFORO = R.drawable.semaforo;             //9

    public Signs(GoogleMap mMap) {
        this.mMap = mMap;
        coords = new ArrayList<>();
        Init();
    }

    public Signs(Context context) {
        coords = new ArrayList<>();
        this.context = context;
        Init();
    }

    public GoogleMap getmMap() {
        return mMap;
    }

    public void setmMap(GoogleMap mMap) {
        this.mMap = mMap;
    }

    public ArrayList<Coord> getCoords() {
        return coords;
    }

    public void setCoords(ArrayList<Coord> coords) {
        this.coords = coords;
    }

    private void Init() {
        coords.add(new Coord(-17.78823000, -63.171288,PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.787653, -63.171377, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));//der
        coords.add(new Coord(-17.788515, -63.169704, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.788577, -63.169426, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.788618, -63.168681, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.788774, -63.167662, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.788814, -63.167460, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.788764, -63.167969, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.787971, -63.167606, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.788454, -63.167597, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));

        coords.add(new Coord(-17.785307, -63.171789, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.785350, -63.171717, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.785540, -63.171623, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.785742, -63.171720, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.786502, -63.171535, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.786572, -63.171524, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));//der
        coords.add(new Coord(-17.787580, -63.171375, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.786274, -63.167646, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.786324, -63.167662, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.786386, -63.167730, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.786436, -63.167757, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78802, -63.164484,  MAX50, context.getString(R.string.max_50)));
        coords.add(new Coord(-17.787574, -63.164385, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.787476, -63.164351, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.787161, -63.164469, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.787082, -63.164705, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.787141, -63.164480, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78706, -63.164477, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.786595, -63.164340, MAX50, context.getString(R.string.max_50)));

        coords.add(new Coord(-17.78714408, -63.18093687, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78722742, -63.1811313, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78728297, -63.18104797, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78733852, -63.18107575, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.78778296, -63.18118685, MAX50, context.getString(R.string.max_50)));
        coords.add(new Coord(-17.78288711, -63.1719718, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78219612, -63.16585005, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.78205113, -63.16564706, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.78204613, -63.16491109, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.78202313, -63.1647641, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78216812, -63.1647241, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78189413, -63.1647051, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78193613, -63.16457311, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78209112, -63.16458611, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.78217912, -63.16457311, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78233612, -63.16453811, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.78252212, -63.16453111, NO_GIRAR_U, context.getString(R.string.no_girar_u)));
        coords.add(new Coord(-17.78237112, -63.16446911, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78202813, -63.16440111, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78186313, -63.16438911, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78313611, -63.16457411, MAX50, context.getString(R.string.max_50)));
        coords.add(new Coord(-17.7837521, -63.1718368, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7839361, -63.1719718, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7838651, -63.1719078, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7840131, -63.1719878, NO_GIRAR_IZQ, context.getResources().getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7837591, -63.17210579, SEMAFORO,context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.78445509, -63.16435812, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.78478008, -63.16444411, CEDA_PASO, context.getString(R.string.ceda_paso)));

    }

    public void draw() {
        for (Coord coord : coords) {
            LatLng locate = new LatLng(coord.getLat(), coord.getLog());
            mMap.addMarker(new MarkerOptions().position(locate).icon(BitmapDescriptorFactory.fromResource(coord.getSign())));
        }
    }

    public class Coord{
        public double lat, log;
        public int sign;
        public boolean estado;
        public String alarma;

        public Coord(double lat, double log, int sign, String alarma) {
            this.lat = lat;
            this.log = log;
            this.sign = sign;
            this.alarma = alarma;
            this.estado = false;
        }

        public boolean isEstado() {
            return estado;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLog() {
            return log;
        }

        public void setLog(double log) {
            this.log = log;
        }

        public int getSign() {
            return sign;
        }

        public void setSign(int sign) {
            this.sign = sign;
        }
    }
}
