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
public class Proveedor {
    
    /**
     * Variables Privadas.
     */
    private int RUC,telefono;
    private String nombre,direccion,ciudad,correo,observaciones;
    
    /**
     * Método Constructor.
     * @param RUC - Identificador por empresa.
     * @param nombre - Nombre.
     * @param direccion - Dirección.
     * @param ciudad - Ciudad.
     * @param correo - Correo.
     * @param telefono - Teléfono.
     * @param observaciones  - Observaciones.
     */
    public Proveedor(int RUC, String nombre, String direccion, String ciudad, String correo, int telefono, 
            String observaciones){
        this.RUC=RUC;
        this.nombre=nombre;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.correo=correo;
        this.telefono=telefono;
        this.observaciones=observaciones;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Proveedor(){
    }

    /**
     * Métodos Get y Set.
     * @return 
     */
    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
