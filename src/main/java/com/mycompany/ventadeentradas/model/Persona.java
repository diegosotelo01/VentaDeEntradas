
package com.mycompany.ventadeentradas.model;

public class Persona{
    private String nombres;
    private String apellidos;
    private String dni;
    private String password;
    
    
    public Persona(String nombres, String apellidos,String dni,String password){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
    }
    public boolean registrarTarjeta(){return false;}
    public boolean eliminarTarjeta(){return false;}
    public boolean anularVenta(){return false;}
    public boolean comprar(){return false;}
    
    public String getNombres(){return nombres;}
    public void setNombres(String nombres){this.nombres = nombres;}
    
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    public String getContraseña() {return password;}
    public void setContraseña(String password) {this.password = password;}
}