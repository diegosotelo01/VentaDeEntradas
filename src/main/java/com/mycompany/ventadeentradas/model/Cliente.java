package com.mycompany.ventadeentradas.model;

public class Cliente extends Persona {

    private int puntos;

    public Cliente(String nombres, String apellidos, String dni, String password) {
        super(nombres, apellidos, dni, password);
        this.puntos = 0;
    }

    private void ingresar(String usuario, String clave) {
    }
}
