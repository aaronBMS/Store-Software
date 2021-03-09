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
public class Almacen {
    
    /**
     * Variables Privadas.
     */
    private int codigo,stock;
    private String nombre,categoria,marca;
    
    /**
     * Método Constructor.
     * @param codigo - Identificador por producto.
     * @param nombre - Nombre.
     * @param categoria - Categoría.
     * @param marca - Marca.
     * @param stock - Cantidad del producto.
     */
    public Almacen(int codigo, String nombre, String categoria, String marca, int stock){
        this.codigo=codigo;
        this.nombre=nombre;
        this.categoria=categoria;
        this.marca=marca;
        this.stock=stock;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Almacen(){
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
    
    
}
