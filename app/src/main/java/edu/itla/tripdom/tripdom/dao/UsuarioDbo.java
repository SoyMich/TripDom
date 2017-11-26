package edu.itla.tripdom.tripdom.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.itla.tripdom.tripdom.entity.TipoUsuario;
import edu.itla.tripdom.tripdom.entity.Usuario;

/**
 * Created by MICHAEL on 26/11/2017.
 */

public class UsuarioDbo {

    private DBConnection connection;

    public UsuarioDbo(Context context){
        connection = new DBConnection(context);
    }

    public void crear(Usuario usuario){

        ContentValues cv = new ContentValues();
        cv.put("nombre", usuario.getNombre());
        cv.put("email", usuario.getEmail());
        cv.put("tipo_usuario", usuario.getTipousuario().toString());
        cv.put("telefono", usuario.getTelefono());

        SQLiteDatabase db = connection.getWritableDatabase();
        Long id = db.insert("usuario", null, cv);

        usuario.setId(id.intValue());

        db.close();
    }

    public List<Usuario> buscar(){

        //Lista donde se iran agregando los usuarios
        List<Usuario> usuarios = new ArrayList<>();

        //Columnas a buscar en la base de datos.
        String columnas[] = new String[]{"nombre", "email", "tipo_usuario", "telefono"};

        //Abrir conexion a la base de datos (SOLO LECTURA).
        SQLiteDatabase db = connection.getReadableDatabase();

        //Ejecutamos la consulta.
        Cursor cursor = db.query("usuario", columnas, null, null, null, null, null );


        cursor.moveToFirst();

        while(!cursor.isAfterLast()){

            Usuario u = new Usuario();

            u.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
            u.setTelefono(cursor.getString(cursor.getColumnIndex("telefono")));
            u.setTipousuario(TipoUsuario.valueOf(cursor.getString(cursor.getColumnIndex("tipo_usuario"))));
            cursor.moveToNext();
        }
        cursor.close();
        db.close();
        return usuarios;
    }

}
