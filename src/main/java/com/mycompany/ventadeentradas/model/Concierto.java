package com.mycompany.ventadeentradas.model;

import java.util.Date;

public class Concierto {

    private String nombre;
    private Date fecha;
    private Usuario usuario;

    public Concierto(String nombre, Date fecha, Usuario usuario) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public boolean agregarZona(String nombre) {return false;}
    public boolean eliminarZona(String nombre) {return false;}
}
