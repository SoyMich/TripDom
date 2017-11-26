package edu.itla.tripdom.tripdom.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by MICHAEL on 26/11/2017.
 */

public class DBConnection extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "TripDom.db";
    public static String LOG_T = "DBConnection";

    public DBConnection(Context context){

        super (context, DATABASE_NAME, null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.i(LOG_T, "Iniciando onCreate...");

        db.execSQL(SqlHelperSchema.USUARIO_TABLE);
        db.execSQL(SqlHelperSchema.PUBLICACION_TABLE);
        db.execSQL(SqlHelperSchema.PUBLICACION_DETALLE_TABLE);
        //TODO: PONER LAS SENTENCIAS E LAS ENTIDADES RESTANTES.

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }





}
