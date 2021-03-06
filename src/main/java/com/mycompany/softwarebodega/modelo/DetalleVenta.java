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
public class DetalleVenta {
    
    /**
     * Variables Privadas.
     */
    private String nombre;
    private int cantidad,codigoVenta,codigoProducto;
    private double precio,descuento,total;
    
    /**
     * Método Constructor.
     * @param nombre - Nombre de producto.
     * @param cantidad - Cantidad.
     * @param precio - Precio.
     * @param descuento - Descuento.
     * @param total - Total a pagar.
     */
    public DetalleVenta(int codigoVenta, int codigoProducto, String nombre, int cantidad, double precio, double descuento, double total){
        this.codigoVenta=codigoVenta;
        this.codigoProducto=codigoProducto;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
        this.descuento=descuento;
        this.total=total;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public DetalleVenta(){
    }


    /**
     * Métodos Get y Set.
     * @return 
     */
    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
