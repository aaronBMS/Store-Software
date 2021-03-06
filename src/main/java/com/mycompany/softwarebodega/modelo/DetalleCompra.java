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
public class DetalleCompra {
    
    /**
     * Variables Privadas.
     */
    private String nombre;
    private int cantidad,codigoCompra,codigoProducto;
    private double precio,descuento,total;
    
    /**
     * Método Constructor.
     * @param nombre - Nombre de producto.
     * @param cantidad - Cantidad.
     * @param precio - Precio.
     * @param descuento - Descuento.
     * @param total - Total a pagar.
     */
    public DetalleCompra(int codigoCompra, int codigoProducto, String nombre, int cantidad, double precio, double descuento, double total){
        this.codigoCompra=codigoCompra;
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
    public DetalleCompra(){
    }

     /**
     * Métodos Get y Set.
     * @return 
     */
    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
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
