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

    public Publicacion() {

    }


    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public void setFecha_Viaje(Date fecha_Viaje) {
        Fecha_Viaje = fecha_Viaje;
    }

    public void setCosto(int costo) {
        Costo = costo;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    public void setUsuario(edu.itla.tripdom.tripdom.entity.Usuario usuario) {
        Usuario = usuario;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public void setCupo(int cupo) {
        Cupo = cupo;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public Date getFecha_Viaje() {
        return Fecha_Viaje;
    }

    public int getCosto() {
        return Costo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public edu.itla.tripdom.tripdom.entity.Usuario getUsuario() {
        return Usuario;
    }

    public String getOrigen() {
        return Origen;
    }

    public int getCupo() {
        return Cupo;
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
