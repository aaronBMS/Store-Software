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
public class Cliente {
    
    /**
     * Variables Privadas.
     */
    private int codigo,telefono;
    private String nombre,apellido,correo;
    
    /**
     * Método Constructor.
     * @param codigo - Identificador por cliente.
     * @param nombre - Nombre.
     * @param apellido - Apellido.
     * @param telefono - Teléfono.
     * @param correo - Correo.
     */
    public Cliente(int codigo, String nombre, String apellido, int telefono, String correo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.correo=correo;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Cliente(){
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
    
    
}
