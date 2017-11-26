package edu.itla.tripdom.tripdom.dao;

/**
 * Created by MICHAEL on 26/11/2017.
 */

public class SqlHelperSchema {

    public static final String USUARIO_TABLE = "CREATE TABLE `usuario` nombre TEXT NOT NULL,tipo_usuario TEXT NOT NULL, email TEXT NOT NULL, telefono TEXT, idusuario INTEGER PRIMARY KEY AUTOINCREMENT)";

    public static final String PUBLICACION_TABLE = "CREATE TABLE `publicacion_detalle` id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, publicacion TEXT NOT NULL, lugar TEXT NOT NULL, descripcion TEXT NOT NULL)";

    public static final String PUBLICACION_DETALLE_TABLE= "CREATE TABLE `publicacion` id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, fecha TEXT NOT NULL, usuario_id TEXT NOT NULL, fecha_viaje TEXT, costo INTEGER NOT NULL, descripcion TEXT, estado TEXT, origen TEXT, cupo TEXT)";

    //crear las restantes entidades... (TAREA).
}
