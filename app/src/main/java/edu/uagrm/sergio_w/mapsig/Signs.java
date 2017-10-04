package edu.uagrm.sergio_w.mapsig;

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

    public static final int MAX20 = R.drawable.velocidad_20;            public static final String S_MAX20 = "Maxima velecidad de 20 kilometros hora.";     //1
    public static final int MAX30 = R.drawable.velocidad_30;            public static final String S_MAX30 = "Maxima velecidad de 30 kilometros hora.";     //1
    public static final int MAX40 = R.drawable.velocidad_40;            public static final String S_MAX40 = "Maxima velecidad de 40 kilometros hora.";     //1
    public static final int MAX50 = R.drawable.velocidad_50;            public static final String S_MAX50 = "Maxima velecidad de 50 kilometros hora.";     //1
    public static final int MAX60 = R.drawable.velocidad_60;            public static final String S_MAX60 = "Maxima velecidad de 60 kilometros hora.";     //1
    public static final int MAX70 = R.drawable.velocidad_70;            public static final String S_MAX70 = "Maxima velecidad de 70 kilometros hora.";     //1
    public static final int MAX80 = R.drawable.velocidad_80;            public static final String S_MAX80 = "Maxima velecidad de 80 kilometros hora.";     //1
    public static final int MAX90 = R.drawable.velocidad_90;            public static final String S_MAX90 = "Maxima velecidad de 90 kilometros hora.";     //1
    public static final int MAX100 = R.drawable.velocidad_100;          public static final String S_MAX100 = "Maxima velecidad de 100 kilometros hora.";   //1
    public static final int ROMPE_MUELLE = R.drawable.rompemuelle;      public static final String S_ROMPE_MUELLE = "Se aproxima un Rompe Muello.";         //2
    public static final int ZONA_ESCUELA = R.drawable.zona_escolar;     public static final String S_ZONA_ESCUELA = "Zona Escolar.";                        //3
    public static final int NO_GIRAR_IZQ = R.drawable.no_girar_izq;     public static final String S_NO_GIRAR_IZQ = "No Girar a la Izquierda.";             //4
    public static final int CEDA_PASO = R.drawable.ceda_paso;           public static final String S_CEDA_PASO = "Debe Ceder el Paso";                      //5
    public static final int PARE = R.drawable.pare;                     //6
    public static final int ZONA_HOSPITAL = R.drawable.hospital;        //7
    public static final int NO_GIRAR_U = R.drawable.no_girar_u;         //8
    public static final int SEMAFORO = R.drawable.semaforo;             //9

    public Signs(GoogleMap mMap) {
        this.mMap = mMap;
        coords = new ArrayList<>();
        Init();
    }

    public Signs() {
        coords = new ArrayList<>();
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
        coords.add(new Coord(-17.7873663,-63.17129838,PARE));
        coords.add(new Coord(-17.78744963,-63.17135393,NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78828295, - 63.16974845, ZONA_HOSPITAL));
        coords.add(new Coord(-17.78839406, -63.16940957, MAX20));
        coords.add(new Coord(-17.78839406, -63.16868738, ROMPE_MUELLE));
        coords.add(new Coord(-17.78853295, -63.16765964, ROMPE_MUELLE));
        coords.add(new Coord(-17.78858851, -63.1674651, ROMPE_MUELLE));
        coords.add(new Coord(-17.7882274, -63.16763187, ZONA_ESCUELA));
        coords.add(new Coord(-17.78786629, -63.16768742, MAX20));
        coords.add(new Coord(-17.78858851, -63.16807629, ZONA_ESCUELA));
        coords.add(new Coord(-17.78508856, -63.17179836, SEMAFORO));
        coords.add(new Coord(-17.78511633, -63.17168725, SEMAFORO));
        coords.add(new Coord(-17.78511633, -63.17160392, SEMAFORO));
        coords.add(new Coord(-17.785533, -63.17174281, SEMAFORO));
        coords.add(new Coord(-17.78628298, -63.17152059, PARE));
        coords.add(new Coord(-17.78636632, -63.17152059, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78728297, -63.17132616, PARE));
        coords.add(new Coord(-17.78625521, -63.16777075, SEMAFORO));
        coords.add(new Coord(-17.78617187, -63.1677152, SEMAFORO));
        coords.add(new Coord(-17.78611632, -63.16765964, SEMAFORO));
        coords.add(new Coord(-17.78600521, -63.16765964, SEMAFORO));
        coords.add(new Coord(-17.78494967, -63.18115908, CEDA_PASO));
        coords.add(new Coord(-17.78636632, -63.18099242, MAX50));
        coords.add(new Coord(-17.78683853, -63.18135351, CEDA_PASO));
        coords.add(new Coord(-17.78683853, -63.18110353, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78692186, -63.18110353, SEMAFORO));
        coords.add(new Coord(-17.78697742, -63.18135351, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78697742, -63.18127018, SEMAFORO));
        coords.add(new Coord(-17.78708853, -63.18129796, SEMAFORO));
        coords.add(new Coord(-17.78714408, -63.18093687, SEMAFORO));
        coords.add(new Coord(-17.78722742, -63.1811313, SEMAFORO));
        coords.add(new Coord(-17.78728297, -63.18104797, SEMAFORO));
        coords.add(new Coord(-17.78733852, -63.18107575, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78778296, -63.18118685, MAX50));
        coords.add(new Coord(-17.78288711, -63.1719718, SEMAFORO));
        coords.add(new Coord(-17.78219612, -63.16585005, PARE));
        coords.add(new Coord(-17.78205113, -63.16564706, MAX40));
        coords.add(new Coord(-17.78204613, -63.16491109, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78202313, -63.1647641, SEMAFORO));
        coords.add(new Coord(-17.78216812, -63.1647241, SEMAFORO));
        coords.add(new Coord(-17.78189413, -63.1647051, SEMAFORO));
        coords.add(new Coord(-17.78193613, -63.16457311, SEMAFORO));
        coords.add(new Coord(-17.78209112, -63.16458611, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78217912, -63.16457311, SEMAFORO));
        coords.add(new Coord(-17.78233612, -63.16453811, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.78252212, -63.16453111, NO_GIRAR_U));
        coords.add(new Coord(-17.78237112, -63.16446911, SEMAFORO));
        coords.add(new Coord(-17.78202813, -63.16440111, SEMAFORO));
        coords.add(new Coord(-17.78186313, -63.16438911, SEMAFORO));
        coords.add(new Coord(-17.78313611, -63.16457411, MAX50));
        coords.add(new Coord(-17.7837521, -63.1718368, SEMAFORO));
        coords.add(new Coord(-17.7838651, -63.1719078, SEMAFORO));
        coords.add(new Coord(-17.7839361, -63.1719718, SEMAFORO));
        coords.add(new Coord(-17.7840131, -63.1719878, NO_GIRAR_IZQ));
        coords.add(new Coord(-17.7837591, -63.17210579, SEMAFORO));
        coords.add(new Coord(-17.78445509, -63.16435812, CEDA_PASO));
        coords.add(new Coord(-17.78478008, -63.16444411, CEDA_PASO));

    }

    public void draw() {
        for (Coord coord : coords) {
            LatLng locate = new LatLng(coord.getLat(), coord.getLog());
            mMap.addMarker(new MarkerOptions().position(locate).icon(BitmapDescriptorFactory.fromResource(coord.getSign())));
        }
    }

    private class Coord{
        public double lat, log;
        public int sign;

        public Coord(double lat, double log, int sign) {
            this.lat = lat;
            this.log = log;
            this.sign = sign;
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
