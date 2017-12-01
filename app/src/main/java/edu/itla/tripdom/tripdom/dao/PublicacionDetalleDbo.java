package edu.itla.tripdom.tripdom.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.itla.tripdom.tripdom.entity.PublicacionDetalle;

/**
 * Created by MICHAEL on 30/11/2017.
 */

public class PublicacionDetalleDbo {

    private DBConnection connection;

    public PublicacionDetalleDbo(Context context){
        connection = new DBConnection(context);
    }

    public void crear(PublicacionDetalle publicacion){

        ContentValues cv = new ContentValues();
        cv.put("publicacion", String.valueOf(publicacion.getPublicacion()));
        cv.put("lugar", publicacion.getLugar());
        cv.put("descripcion", publicacion.getDescripcion());


        SQLiteDatabase db = connection.getWritableDatabase();
        Long id = db.insert("publicacion_detalle", null, cv);

        publicacion.setId(id.intValue());

        db.close();
    }

    public List<PublicacionDbo> buscar(){

        //Lista donde se iran agregando los usuarios
        List<PublicacionDbo> publicaones = new ArrayList<>();

        //Columnas a buscar en la base de datos.
        String columnas[] = new String[]{"publicacion", "lugar", "descripcion"};

        //Abrir conexion a la base de datos (SOLO LECTURA).
        SQLiteDatabase db = connection.getReadableDatabase();

        //Ejecutamos la consulta.
        Cursor cursor = db.query("publicacion_detalle", columnas, null, null, null, null, null );


        cursor.moveToFirst();

        while(!cursor.isAfterLast()){

            PublicacionDetalle u = new PublicacionDetalle();

            //u.setPublicacion(cursor.getString(cursor.getColumnIndex("fecha")));
            //u.setLugar(cursor.getInt(cursor.getColumnIndex("usuario_id")));
            //u.setDescripcion(cursor.getString(cursor.getColumnIndex("fecha_viaje")));

            cursor.moveToNext();
        }
        cursor.close();
        db.close();
        return publicaones;
    }

}
