package com.example.gestiondesetudiants;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class MySqlHandler extends SQLiteOpenHelper {

    static final String DB_NAME = "moyenne.db";

    static final String TABLE_NAME = "Module";

    static final String COL_CODE = "code";
    static final String COL_INTITULE = "intitulé";
    static final String COL_COEF = "coef";
    static final String COL_TD = "td";
    static final String COL_TP = "tp";
    static final String COL_EMD = "emd";
    static final String COL_MOY = "moy";
    static final String COL_ETUDE = "Etude";


    static final String RQT_CREATE = " create table " + TABLE_NAME + " ("
            + COL_CODE + " text ,"
            + COL_INTITULE + " text primary key ,"
            + COL_COEF + " integer ,"
            + COL_TD + " real ,"
            + COL_TP + " real ,"
            + COL_EMD + " real ,"
            + COL_MOY + " real ,"
            + COL_ETUDE + " text );";


    public MySqlHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(RQT_CREATE);
        insertModule(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" drop table if exists " + TABLE_NAME);
        onCreate(db);
    }



    private void insertModule(SQLiteDatabase db) {


        //L1 S1:
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F111','Analyse 1','4','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F112','Algèbre 1','2','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F113','Algo 1','4','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M111','Terminologie','1','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M112','Bureautique','1','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('D112','CRI','2','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('D114','Electronique','2','1MI1');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('T111','Anglais 1','1','1MI1');");

        //L1 S2:
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F211','Analyse 2','2','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F212','Algèbre 2','2','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F213','Proba Stat','1','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F221','Algo 2','3','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F222','STRM','2','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M211','TIC','2','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M213','POO','1','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('T211','Physique 2','2','1MI2');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('T212','Histoire','1','1MI2');");

        // L2 info S3:
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F311', 'Archi', '2', '2IN3' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F312', 'ASD', '3', '2IN3' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F313', 'LM', '2', '2IN3' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F321', 'POO 2', '3', '2IN3' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F322', 'SI', '3', '2IN3' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F323', 'THL', '2', '2IN3' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M311', 'Anglais 2', '1', '2IN3' ); ");

        // L2 info S4:
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F411', 'BDD', '2', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F412', 'SE1', '3', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F413', 'GL1', '2', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F421', 'THG', '2', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F422', 'Réseaux', '3', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F423', 'DAW', '2', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M411', 'AJEL', '1', '2IN4' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M412', 'Anglais 3', '1', '2IN4' ); ");

        //L2 MATH S3:
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F311','Algèbre 3','2','2MA3');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F312','Analyse 3','4','2MA3');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F313','Ttopologie','3','2MA3');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M311','Ana Num 1','2','2MA3');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M312','LM 2','2','2MA3');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M313','OP','1','2MA3');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('D311','Histoire M','1','2MA3');");

        //L2 MATH S4:
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F411','Algèbre 4','3','2MA4');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F412','Analyse 4','4','2MA4');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F413','Ana comp','3','2MA4');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M411','Ana num 2','2','2MA4');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M412','Proba','2','2MA4');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M413','Géométrie','2','2MA4');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('D41','App Math','1','2MA4');");

        // L3 SI S1:
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F511', 'SE2', '2', '3SI5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F512', 'Compil', '2', '3SI5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F513', 'Prolog', '2', '3SI5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F521', 'GL2', '2', '3SI5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F522', 'IHM', '2', '3SI5' );");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M511', 'paradigme', '2', '3SI5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M512', 'IA', '2', '3SI5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('T511', 'Anglais4', '2', '3SI5' ); ");

        // L3 ISIL S1:
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F511', 'OMSI', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F512', 'OM', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F513', 'SAID', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F521', 'ACOO', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('F522', 'GPL', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M511', 'BDA', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('M512', 'WEB', '2', '3IS5' ); ");
        db.execSQL("insert INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES ('T511', 'Anglais 4', '1', '3IS5' ); ");

        //L3 MATH S5:
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F511','Ana Hil','3','3ME5');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F512','M Int','4','3ME5');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F521','ED','4','3ME5');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('F522','EPM','2','3ME5');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('M511','OSC','2','3ME5');");
        db.execSQL("INSERT INTO " + TABLE_NAME + "(" + COL_CODE + "," + COL_INTITULE + "," + COL_COEF + "," + COL_ETUDE + ") VALUES('T511','IDM','1','3ME5');");

    }


    public ArrayList<Module> getAllData(String code) {
        ArrayList<Module> m = new ArrayList<>();
        Module mod;
        Log.d("handler", "before readbal");
        SQLiteDatabase db = this.getReadableDatabase();
        Log.d("handler", "after readbal");

        Cursor cr = db.rawQuery("SELECT " + COL_INTITULE + " , " + COL_COEF + " , " + COL_EMD + " , " + COL_TD + " , " + COL_TP + " , " + COL_MOY + " FROM " + TABLE_NAME + " WHERE (" + COL_ETUDE + " =?);", new String[]{code});
        Log.d("handler", "nombre d'item" + cr.getCount());

        if (cr.moveToFirst()) {
            do {
                mod = new Module();
                mod.setIntitulé(cr.getString(cr.getColumnIndex(COL_INTITULE)));
                mod.setCoef(cr.getInt(cr.getColumnIndex(COL_COEF)));
                mod.setEmd(cr.getFloat(cr.getColumnIndex(COL_EMD)));
                mod.setTd(cr.getFloat(cr.getColumnIndex(COL_TD)));
                mod.setTp(cr.getFloat(cr.getColumnIndex(COL_TP)));
                mod.setMoy(cr.getFloat(cr.getColumnIndex(COL_MOY)));


                m.add(mod);
            } while (cr.moveToNext());

            cr.moveToFirst();
            db.close();
        }
        return m;
    }
}


