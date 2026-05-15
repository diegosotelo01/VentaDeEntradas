package com.mycompany.ventadeentradas.model;

public class Concierto {

    private String nombre;
    private String fecha;
    private Usuario usuario;

    public Concierto(String nombre, String fecha, Usuario usuario) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public boolean agregarZona(String nombre) {return false;}
    public boolean eliminarZona(String nombre) {return false;}
}
