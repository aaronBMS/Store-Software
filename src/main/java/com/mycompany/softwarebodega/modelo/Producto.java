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
public class Producto {
    
    /**
     * Variables Privadas.
     */
    private int codigo,stockInicial,stockMinimo;
    private String nombre,categoria,marca;
    private double precioCosto,precioVenta,utilidad;
    private byte[] imagen;
        
    /**
     * Método Constructor.
     * @param codigo - Identificador por producto.
     * @param nombre - Nombre.
     * @param categoria - Categoría.
     * @param marca - Marca.
     * @param stockInicial - Stock Inicial.
     * @param stockMinimo - Stock Mínimo,
     * @param precioCosto - Precio de Costo.
     * @param precioVenta - Precio de Venta.
     * @param utilidad - Utilidad.
     * @param imagen - Imágen de producto.
     */
    public Producto(int codigo, String nombre, String categoria, String marca, int stockInicial, int stockMinimo, 
            double precioCosto, double precioVenta, double utilidad, byte[] imagen){
        this.codigo=codigo;
        this.nombre=nombre;
        this.categoria=categoria;
        this.marca=marca;
        this.stockInicial=stockInicial;
        this.stockMinimo=stockMinimo;
        this.precioCosto=precioCosto;
        this.precioVenta=precioVenta;
        this.utilidad=utilidad;
        this.imagen=imagen;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Producto(){    
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

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    
}
