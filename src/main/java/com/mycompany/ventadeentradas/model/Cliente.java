package com.mycompany.ventadeentradas.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    private int puntos;
    private Tarjeta tarjeta;
    private List<Venta> ventas;

    public Cliente(String nombres, String apellidos, String dni, String password) {
        super(nombres, apellidos, dni, password);
        this.puntos = 0;
        this.ventas = new ArrayList<>();
    }

    private void ingresar(String usuario, String clave) {}
}
