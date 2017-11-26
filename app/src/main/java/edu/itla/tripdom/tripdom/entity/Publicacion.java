package edu.itla.tripdom.tripdom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by MICHAEL on 19/11/2017.
 */

public class Publicacion {

    private int Id;
    private Date Fecha;
    private Date Fecha_Viaje;
    private int Costo;
    private String Descripcion;
    private int Estado;
    private Usuario Usuario;
    private String Origen;
    private int Cupo;

    public Publicacion(int id, Date fecha, Date fecha_Viaje, int costo, String descripcion, int estado, edu.itla.tripdom.tripdom.entity.Usuario usuario, String origen, int cupo) {
        Id = id;
        Fecha = fecha;
        Fecha_Viaje = fecha_Viaje;
        Costo = costo;
        Descripcion = descripcion;
        Estado = estado;
        Usuario = usuario;
        Origen = origen;
        Cupo = cupo;
    }

    List<PublicacionDetalle> detalle;

    public List<PublicacionDetalle> getDetalle() {
        return detalle;
    }

    public void addDetalle (PublicacionDetalle pd){

        if (detalle==null){

            detalle= new ArrayList<>();
        }
        pd.setPublicacion(this);

        detalle.add(pd);
    }
}
