package com.mycompany.ventadeentradas.model;

public class Entrada {

    private int numero;
    private String estado;

    public Entrada(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public boolean vender() throws EntradaNoDisponibleException{
        if(estado.equals("vendido")) throw new EntradaNoDisponibleException("La entrada ya ha sido vendida");
        return false;
    }
    public boolean liberar() {return false;}
}
