package edu.itla.tripdom.tripdom.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }





}
