package edu.itla.tripdom.tripdom.dao;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;


import edu.itla.tripdom.tripdom.entity.Publicacion;


/**
 * Created by MICHAEL on 30/11/2017.
 */

public class PublicacionDbo {

    private DBConnection connection;

    public PublicacionDbo(Context context){
        connection = new DBConnection(context);
    }

    public void crear(Publicacion publicacion){

        ContentValues cv = new ContentValues();
        cv.put("fecha", String.valueOf(publicacion.getFecha()));
        cv.put("usuario_id", publicacion.getUsuario().toString());
        cv.put("fecha_viaje", publicacion.getFecha_Viaje().toString());
        cv.put("costo",publicacion.getCosto());
        cv.put("descripcion", publicacion.getDescripcion());
        cv.put("estado", publicacion.getEstado());
        cv.put("origen", publicacion.getOrigen());
        cv.put("cupo", publicacion.getCupo());

        SQLiteDatabase db = connection.getWritableDatabase();
        Long id = db.insert("publicacion", null, cv);

        publicacion.setId(id.intValue());

        db.close();
    }

    public List<PublicacionDbo> buscar(){

        //Lista donde se iran agregando los usuarios
        List<PublicacionDbo> publicaones = new ArrayList<>();

        //Columnas a buscar en la base de datos.
        String columnas[] = new String[]{"fecha", "usuario_id", "fecha_viaje", "costo","descripcion", "estado" , "origen", "cupo"};

        //Abrir conexion a la base de datos (SOLO LECTURA).
        SQLiteDatabase db = connection.getReadableDatabase();

        //Ejecutamos la consulta.
        Cursor cursor = db.query("publicacion", columnas, null, null, null, null, null );


        cursor.moveToFirst();

        while(!cursor.isAfterLast()){

            Publicacion u = new Publicacion();

           // u.setFecha(cursor.getString(cursor.getColumnIndex("fecha")));
           // u.setUsuario(cursor.getInt(cursor.getColumnIndex("usuario_id")));
           // u.setFecha_Viaje(cursor.getString(cursor.getColumnIndex("fecha_viaje")));
           // u.setCosto(cursor.getInt(cursor.getColumnIndex("costo")));
            // u.setFecha_Viaje(cursor.getString(cursor.getColumnIndex("descripcion")));
            // u.setFecha_Viaje(cursor.getString(cursor.getColumnIndex("estado")));
            //u.setFecha_Viaje(cursor.getString(cursor.getColumnIndex("origen")));
            //u.setFecha_Viaje(cursor.getString(cursor.getColumnIndex("costo")));
            cursor.moveToNext();
        }
        cursor.close();
        db.close();
        return publicaones;
    }
}
