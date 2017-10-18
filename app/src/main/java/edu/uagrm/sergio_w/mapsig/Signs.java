package edu.uagrm.sergio_w.mapsig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

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

    public static final int MAX20 = R.drawable.velocidad_20;            //1 , MAX20, context.getString(R.string.max_20)));
    public static final int MAX30 = R.drawable.velocidad_30;            //1
    public static final int MAX40 = R.drawable.velocidad_40;            //1
    public static final int MAX50 = R.drawable.velocidad_50;            //1
    public static final int MAX60 = R.drawable.velocidad_60;            //1
    public static final int MAX70 = R.drawable.velocidad_70;            //1
    public static final int MAX80 = R.drawable.velocidad_80;            //1
    public static final int MAX90 = R.drawable.velocidad_90;            //1
    public static final int MAX100 = R.drawable.velocidad_100;          //1
    public static final int ROMPE_MUELLE = R.drawable.rompemuelle;      //2 , ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
    public static final int ZONA_ESCUELA = R.drawable.zona_escolar;     //3 , ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
    public static final int NO_GIRAR_IZQ = R.drawable.no_girar_izq;     //4 , NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
    public static final int CEDA_PASO = R.drawable.ceda_paso;           //5 , CEDA_PASO, context.getString(R.string.ceda_paso)));
    public static final int PARE = R.drawable.pare;                     //6 , PARE, context.getString(R.string.pare)));
    public static final int ZONA_HOSPITAL = R.drawable.hospital;        //7 , CEDA_PASO, context.getString(R.string.ceda_paso)));
    public static final int NO_GIRAR_U = R.drawable.no_girar_u;         //8 , NO_GIRAR_U, context.getString(R.string.no_girar_u)));
    public static final int SEMAFORO = R.drawable.semaforo;             //9 , SEMAFORO, context.getString(R.string.semaforo)));
    public static final int NO_GIRAR_DER = R.drawable.no_girar_der;     //10

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
        //<editor-fold desc="GRUPO L">
        coords.add(new Coord(-17.78823000, -63.171288,PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.787653, -63.171377, NO_GIRAR_DER, context.getResources().getString(R.string.no_girar_der)));
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
        coords.add(new Coord(-17.786572, -63.171524, NO_GIRAR_DER, context.getResources().getString(R.string.no_girar_der)));
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
        //</editor-fold>
        //<editor-fold desc="GRUPO A">
        coords.add(new Coord(-17.7943300321610, -63.17450428, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7943799949685,	-63.17432582,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7946488581249,	-63.1664516,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7946893342367,	-63.16630231,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7935558183092, -63.16644676, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7983544999993,	-63.171818, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7981392999992,	-63.17306, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7977845999959,	-63.1747735,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7958539999975, -63.1741988, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7946423999974,	-63.1742247, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7979736999962, -63.1978213, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7983592799961,	-63.16864976,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7979617900032, -63.17400421, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7985071000043,	-63.1748279,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7977756499995,	-63.17476081, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7959986099975,	-63.17058281, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7974356299976,	-63.16830033, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7976171299995,	-63.16851928, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        //</editor-fold>
        //<editor-fold desc="GRUPO B">
        coords.add(new Coord(-17.7753519999972, -63.183315, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7757670000003, -63.184555, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7757939999973, -63.184619, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7765049999974, -63.186836, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7766779999967, -63.187058, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7773140000016, -63.187551, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7774829999989, -63.187668, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7783430000038, -63.188398, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783190000009, -63.18804, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7781749999987, -63.187035, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7764480000019, -63.183224, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7760849999988, -63.181872, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7778259999962, -63.184492, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7797709999962, -63.188459, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7788890000035, -63.184313, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7789129999978, -63.184311, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7780530000038, -63.183082, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7795970000037, -63.18191, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7797139999960, -63.181909, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7796639999970, -63.182905, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7796890000034, -63.183187, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7799899999988, -63.185195, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7802169999963, -63.18591, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7801760000037, -63.186091, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7806910000010, -63.188607, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7807929999957, -63.188726, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7812140000026, -63.188783, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7809580000040, -63.185973, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7808399999966, -63.185141, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7808000000029, -63.18179, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7807809999959, -63.182775, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7807110000001, -63.181828, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7817220000027, -63.181751, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7770100000008, -63.186003, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7770160000003, -63.186094, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7772050000013, -63.185965, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7774820000041, -63.186914, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7768709999972, -63.185402, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7785940000002, -63.18819, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7785989999965, -63.187891, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7788709999999, -63.187199, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7792770000002, -63.186152, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7789200000032, -63.185086, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7797709999968, -63.187521, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7801319999968, -63.185952, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7796459999999, -63.185359, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7807370000000, -63.186553, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7815720000037, -63.187338, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7829969999994, -63.187222, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7838859999978, -63.187107, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7832340000026, -63.187471, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7843880000035, -63.188232, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        //</editor-fold>
        //<editor-fold desc="GRUPO C">
        coords.add(new Coord(-17.7793380000035, -63.193413, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7800970000037, -63.188964, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783880000013, -63.188548, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7754790000019, -63.184629, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7751140000003, -63.183398, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7738799999979, -63.191646, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7799550000009, -63.190108, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7779860000034, -63.189585, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7767219999983, -63.187067, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7775010000009, -63.190742, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7771399999983, -63.190881, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7773450000040, -63.191514, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7770039999978, -63.187832, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7767000000041, -63.188312, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7765020000004, -63.187813, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7754240000027, -63.186715, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7736990000012, -63.191212, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7744469999995, -63.191904, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7777360000032, -63.188216, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7739879999979, -63.189093, NO_GIRAR_U, context.getString(R.string.no_girar_u)));
        //</editor-fold>
        //<editor-fold desc="GRUPO E">
        coords.add(new Coord(-17.7746669999973, -63.182267, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7746179999955, -63.18205, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7747639999990, -63.182045, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7749299999960, -63.182045, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7750959999964, -63.182168, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743810000012, -63.180787, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7745370000009, -63.180851, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7745190000042, -63.179888, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743729999974, -63.180001, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7746459999959, -63.179988, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7747659999988, -63.179881, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7746540000014, -63.178125, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7747949999958, -63.178002, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7744450000007, -63.177656, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7762949999984, -63.173856, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7778770000017, -63.173144, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7779610000043, -63.172814, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783189999959, -63.172964, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7782189999996, -63.173251, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7792849999985, -63.17297, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7793719999994, -63.172557, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7796529999964, -63.172527, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7807979999988, -63.172353, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7808339999971, -63.172672, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7809480000008, -63.172655, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7828330000009, -63.171965, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7829990000026, -63.172507, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7831600000019, -63.172019, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7823910000039, -63.174705, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7824220000041, -63.177247, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7823559999971, -63.17838, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7824889999965, -63.179509, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7826979999956, -63.181569, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7815650000027, -63.178431, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7813659999975, -63.177506, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7814580000038, -63.177383, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7804860000026, -63.178818, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7804760000012, -63.180017, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7806239999972, -63.18187, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7807379999982, -63.18174, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7796950000006, -63.181833, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7797150000005, -63.181965, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7791740000012, -63.179015, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7785079999977, -63.181781, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7760639999973, -63.181213, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7759109999959, -63.181173, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7761459999974, -63.181999, PARE, context.getString(R.string.pare)));
        //</editor-fold>
        //<editor-fold desc="GRUPO F">
        coords.add(new Coord(-17.7813769999993, -63.167896, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7805789999971, -63.168073, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7808359999965, -63.172392, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7808280000040, -63.172406, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7808320000004, -63.172424, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7808419999983, -63.172443, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7808909999974, -63.172436, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7814689999982, -63.172514, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7827619999963, -63.172432, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7829910000012, -63.172502, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7831310000043, -63.172389, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7831260000010, -63.172041, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7829550000011, -63.171968, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7826929999959, -63.17209, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7814340000007, -63.172359, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7794839999958, -63.172554, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7795830000037, -63.172838, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7807969999996, -63.172562, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7823650000004, -63.164691, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7822459999988, -63.164705, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7823589999982, -63.164586, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7823969999966, -63.164484, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7821049999968, -63.164705, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7821079999996, -63.164603, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7822569999985, -63.164489, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7820829999972, -63.164498, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783650000032, -63.164911, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783790000020, -63.165118, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783429999975, -63.165257, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7813250000028, -63.164805, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7812689999990, -63.165381, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7793880000035, -63.172574, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7792640000038, -63.172628, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7792890000015, -63.172935, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7794270000011, -63.172921, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7792369999992, -63.171232, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7788209999959, -63.168664, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7782470000002, -63.165287, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783419999980, -63.165251, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7781729999972, -63.164955, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7780550000001, -63.164981, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7781419999988, -63.165191, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7781780000026, -63.165282, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7782159999957, -63.165362, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743740000044, -63.165736, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743649999967, -63.165852, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7763159999998, -63.165585, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7774350000032, -63.165361, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7784119999954, -63.168308, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7778270000009, -63.168473, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7786760000021, -63.171601, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7783409999972, -63.172862, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7781049999968, -63.172803, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7783110000011, -63.173061, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7741930000025, -63.165966, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743109999956, -63.166092, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743449999975, -63.165759, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7780659999977, -63.172792, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7782610000011, -63.172934, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7782209999994, -63.173237, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7779070000041, -63.173152, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7715649999962, -63.168053, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7716030000015, -63.168278, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7715190000011, -63.168201, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7713810000024, -63.168067, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743870000037, -63.166358, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7768159999988, -63.170859, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7752290000016, -63.171994, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7742770000008, -63.170676, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7760290000029, -63.170819, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7780030000006, -63.172474, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7736289999986, -63.171604, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7753310000007, -63.172825, PARE, context.getString(R.string.pare)));
        //</editor-fold
        //<editor-fold desc="GRUPO G">
        coords.add(new Coord(-17.7828820000039, -63.171999,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7830850000041, -63.172057,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7831350000004, -63.172143,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7829909999974, -63.172472,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7827780000043, -63.172413,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7839780000008, -63.171932,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7840080000001, -63.17221,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7840699999973, -63.171907,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7841559999976, -63.171971, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7853350000015, -63.171714,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7853899999989, -63.172018,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7855119999981, -63.172047,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7892629999996, -63.171248,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7892530000014, -63.171514,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7903779999958, -63.172086,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7907069999970, -63.172539, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7907399999962, -63.172606,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7909080000005, -63.17291,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7909659999966, -63.173052,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7910600000035, -63.173522, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7910950000041, -63.173779, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7913300000035, -63.174834, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7915689999962, -63.176569,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7916480000015, -63.176554,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7915660000029, -63.176643,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7916639999983, -63.176639,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7916119999955, -63.176854, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7916500000037, -63.177605,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7916279999996, -63.177723,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7916399999959, -63.177789,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7917189999989, -63.177885,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7918639999998, -63.177852,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7918869999983, -63.177685,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7918550000032, -63.177593,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7920520000020, -63.179549,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7922209999972, -63.179531,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7920640000034, -63.179615,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7922300000012, -63.179591,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7921370000033, -63.179517, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7921510000025, -63.179614, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7921980000001, -63.180077, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7922129999999, -63.180208, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7906579999970, -63.180766, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7898660000021, -63.180836,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7898600000020, -63.180778,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7899179999972, -63.180826,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7896709999996, -63.179832,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7897110000016, -63.17983,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7896569999974, -63.17978,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7892119999986, -63.178193,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7892330000036, -63.178247,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7892820000005, -63.178185,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7889920000038, -63.177167,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7890519999975, -63.177145,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7890670000001, -63.177215,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7879130000037, -63.17741, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7881629999975, -63.178433, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7863390000022, -63.174595, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7863309999977, -63.1747, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7869379999967, -63.177605,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7869990000005, -63.177606,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7870130000001, -63.177654,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7871699999975, -63.17866,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7871820000030, -63.17872,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7873780000003, -63.181061, ZONA_HOSPITAL, context.getString(R.string.zona_hospital)));
        coords.add(new Coord(-17.7868000000000, -63.181235,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7868479999984, -63.18123,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7864310000023, -63.178869,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7864929999982, -63.178856,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7864170000030, -63.17879,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7860020000037, -63.176905,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7860699999959, -63.176889,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7859899999981, -63.176847,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7857769999967, -63.181354,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7857469999957, -63.18128,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7857600000040, -63.181262,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7858560000003, -63.181262,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7856459999979, -63.180143,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7857360000005, -63.18013,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7857540000014, -63.180137,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7857600000009, -63.180221,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7854569999999, -63.178994,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7855230000025, -63.178983,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7855260000008, -63.178996,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7855290000018, -63.179044,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7853679999983, -63.177974,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7854110000030, -63.177964,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7854150000026, -63.177965,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7854169999958, -63.178013,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7847580000022, -63.181471,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7847649999990, -63.181378,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7846609999962, -63.180266, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7845219999990, -63.179271,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7845150000015, -63.179266,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7845099999993, -63.179191,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7845919999986, -63.179257,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7845320000018, -63.17817,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7845790000003, -63.178161,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7845760000038, -63.178115,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7835599999991, -63.179211, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7835000000037, -63.178203,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7835650000038, -63.178214,SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7835670000023, -63.178258,SEMAFORO, context.getString(R.string.semaforo)));
        //</editor-fold>
        //<editor-fold desc="GRUPO H">
        coords.add(new Coord(-17.7904827086772, -63.19429276, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7963301712708, -63.19319006, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7901109999970, -63.194573, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7972770000014, -63.19357, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7901169999969, -63.194659, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7900077300145, -63.19389451, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7901921918342, -63.19462538, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7906442706019, -63.19435623, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7900773034876, -63.1943458, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7977447384586, -63.19298824, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7900284060352, -63.1945033, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7902631278176, -63.19449188, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7931254250289, -63.18717054, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7903169765368, -63.19465154, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7900463284341, -63.19458852, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7900702794833, -63.19474639, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7979040172352, -63.19294356, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7900654892172, -63.19468274, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7903744901625, -63.19476724, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7899955827167, -63.19434607, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7902120338917, -63.19433798, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7977900321709, -63.19252688, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7902375054884, -63.19441583, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7979359049244, -63.19298824, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7977979987389, -63.19264258, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7887890638303, -63.18790382, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7971308051952, -63.19327888, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7963356356151, -63.19396562, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7962839055876, -63.1938509, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        //</editor-fold>
        //<editor-fold desc="GRUPO J">
        coords.add(new Coord(-17.7706600000015, -63.182682, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7711100000041, -63.182399, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7711959999973, -63.182483, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7712570000017, -63.182497, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7717099999961, -63.182401, NO_GIRAR_U, context.getString(R.string.no_girar_u)));
        coords.add(new Coord(-17.7736609999976, -63.182338, NO_GIRAR_U, context.getString(R.string.no_girar_u)));
        coords.add(new Coord(-17.7725940000017, -63.180933, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7707109999983, -63.18143, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7706299999982, -63.17907, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7724569999963, -63.179861, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7743859999993, -63.17989, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7704389270282, -63.17178497, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7708278180774, -63.17156274, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7718556078499, -63.17261834, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7726334035357, -63.17325725, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7753834371761, -63.17559069, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7755778846520, -63.17497955, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7755501102424, -63.1747851, SEMAFORO, context.getString(R.string.semaforo)));
        //</editor-fold>
        //<editor-fold desc="GRUPO K">
        coords.add(new Coord(-17.7790961682328, -63.19388099, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7794428434794, -63.19397123, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7795744986564, -63.19363731, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7799460028251, -63.193774, MAX50, context.getString(R.string.max_50)));
        coords.add(new Coord(-17.7805524563636, -63.19429887, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7811951003872, -63.19449577, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7846138648068, -63.19513003, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7848949543445, -63.1952831, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7851119618945, -63.19494335, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7802524731292, -63.18901003, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7798914135207, -63.19011673, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7793656593943, -63.19366246, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7792259451292, -63.19361827, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7792892619249, -63.19332548, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7803134757499, -63.1936456, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7821925553576, -63.19429914, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7829614608289, -63.19451565, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7833529590476, -63.19474223, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7840315131180, -63.19490324, MAX50, context.getString(R.string.max_50)));
        coords.add(new Coord(-17.7797061653430, -63.19247434, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7821648614209, -63.18928693, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7841134690461, -63.1888793, SEMAFORO, context.getString(R.string.semaforo)));
        //</editor-fold>
        //<editor-fold desc="GRUPO M">
        coords.add(new Coord(-17.7936700000016, -63.1660227, MAX50, context.getString(R.string.max_50)));
        coords.add(new Coord(-17.7930530000001, -63.166168, CEDA_PASO, context.getString(R.string.ceda_paso)));
        coords.add(new Coord(-17.7931000000017, -63.166204, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7917690000022, -63.173227, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7914349999971, -63.168059, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7913379999998, -63.168633, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7910149999957, -63.169259, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7919990000006, -63.17033, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7911539999964, -63.172701, MAX40, context.getString(R.string.max_40)));
        coords.add(new Coord(-17.7893510000020, -63.17138, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7903029999966, -63.1696652, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7901009999957, -63.169027, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7904059999970, -63.169175, MAX20, context.getString(R.string.max_20)));
        //</editor-fold>
        //<editor-fold desc="GRUPO N">
        coords.add(new Coord(-17.7857752618773, -63.18909403, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7869225019344, -63.1950915, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7874113942003, -63.19450815, PARE, context.getString(R.string.pare)));
        coords.add(new Coord(-17.7897114278458, -63.19452204, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7901892116232, -63.19464704, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7901614378983, -63.19450815, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7905781126016, -63.19475816, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7904669987413, -63.19475816, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7904669987413, -63.19475816, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7902169931599, -63.19434147, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7902447704940, -63.19478594, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7902169903117, -63.19450815, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7903281074865, -63.19431369, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7903280979868, -63.19434147, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7890086437257, -63.19135801, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7888391907361, -63.19136079, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7885753040276, -63.19136913, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7885114152906, -63.19101078, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7884697415285, -63.19069132, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7869058347938, -63.18919681, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7870169419094, -63.18954961, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7885586335298, -63.1915108, ROMPE_MUELLE, context.getString(R.string.rompe_muelle)));
        coords.add(new Coord(-17.7882308496745, -63.19155802, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7879502917366, -63.19158858, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7891725327528, -63.19225527, ZONA_ESCUELA, context.getString(R.string.zona_escolar)));
        coords.add(new Coord(-17.7884669695650, -63.1924525, MAX20, context.getString(R.string.max_20)));
        coords.add(new Coord(-17.7902725504277, -63.1940359, NO_GIRAR_IZQ, context.getString(R.string.no_girar_izq)));
        coords.add(new Coord(-17.7851891404333, -63.19481088, SEMAFORO, context.getString(R.string.semaforo)));
        coords.add(new Coord(-17.7847724649523, -63.18917459, SEMAFORO, context.getString(R.string.semaforo)));
        //</editor-fold>
    }

    public void draw() {
        for (Coord coord : coords) {
            LatLng locate = new LatLng(coord.getLat(), coord.getLog());
            Bitmap smallMarker = smallerMarker(50, 50, coord.getSign());
            mMap.addMarker(new MarkerOptions().position(locate).icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
        }
    }

    private Bitmap smallerMarker(int width, int height, int sign) {
        BitmapDrawable bitmapdraw=(BitmapDrawable)context.getResources().getDrawable(sign);
        Bitmap b = bitmapdraw.getBitmap();
        return Bitmap.createScaledBitmap(b, width, height, false);
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

        public String getAlarma() {
            return alarma;
        }

        public void setAlarma(String alarma) {
            this.alarma = alarma;
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
