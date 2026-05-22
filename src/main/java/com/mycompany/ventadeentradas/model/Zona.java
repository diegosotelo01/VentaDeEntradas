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
    public Entrada[] venderEntrada(int numero) throws CantidadInvalidaException {
        if(numero<1 || numero >4) throw new CantidadInvalidaException("Solo se puede comprar entre 1 y 4 entradas");
        return null;
    }
}
