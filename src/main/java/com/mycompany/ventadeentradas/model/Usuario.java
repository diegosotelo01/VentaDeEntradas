package com.mycompany.ventadeentradas.model;

public class Usuario extends Persona {

    private boolean estado;

    public Usuario(String nombres, String apellidos, String dni, String password) {
        super(nombres, apellidos, dni, password);
        this.estado = true;
    }
    public void registrarZonas() {}
    public boolean isEstado() {return estado;}
    public void setEstado(boolean estado) {this.estado = estado;}
}
