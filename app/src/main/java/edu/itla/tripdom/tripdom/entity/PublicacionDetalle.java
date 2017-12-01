package edu.itla.tripdom.tripdom.entity;

/**
 * Created by MICHAEL on 19/11/2017.
 */

public class PublicacionDetalle {

    private int id;
    private Publicacion publicacion;
    private String lugar;
    private String descripcion;

    public PublicacionDetalle(int id, Publicacion publicacion, String lugar, String descripcion) {
        this.id = id;
        this.publicacion = publicacion;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    public PublicacionDetalle() {

    }

    public int getId() {
        return id;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
