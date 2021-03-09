/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.modelo;

/**
 *
 * @author Aaron
 */
public class Usuario {
    
    /**
     * Variables Privadas.
     */
    private int codigo,telefono;
    private String nombre,apellido,correo,usuario,contraseña,condicion;
    
    /**
     * Método Constructor.
     * @param codigo - Identificador por usuario.
     * @param nombre - Nombre.
     * @param apellido - Apellido.
     * @param telefono - Teléfono.
     * @param correo - Correo.
     * @param usuario - Usuario de ingreso.
     * @param contraseña - Contraseña de ingreso.
     * @param condicion  - Condición de empleado o administrador.
     */
    public Usuario(int codigo, String nombre, String apellido, int telefono, String correo, String usuario, 
            String contraseña, String condicion){
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.correo=correo;
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.condicion=condicion;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Usuario(){
    }

    /**
     * Métodos Get y Set.
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
   
}
