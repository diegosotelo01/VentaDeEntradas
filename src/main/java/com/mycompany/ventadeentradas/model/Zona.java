package com.mycompany.ventadeentradas.model;

public class Zona {

    private String nombre;
    private int capacidad;
    private int precio;

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    private boolean generarEntradas() {return false;}
    public Entrada[] mostrarEntrada() {return null;}
    public Entrada[] venderEntrada(int numero) {return null;}
}
