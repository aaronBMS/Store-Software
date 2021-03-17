/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.modelo;

import java.util.Date;

/**
 *
 * @author Aaron
 */
public class Venta {
    
    /**
     * Variables Privadas.
     */
    private int codigo,codigoCliente;
    private String cliente,responsable,observaciones;
    private Date fecha;
    static final double IGV=0.18;
    private double pagoTotal;
    
    /**
     * Método Constructor.
     * @param codigo - Identificador por venta.
     * @param codigoCliente - Identificador por cliente.
     * @param cliente - Nombre.
     * @param responsable - Responsable/Usuario.
     * @param fecha - Fecha actual.
     * @param observaciones - Observaciones.
     * @param pagoTotal - Pago total.
     */
    public Venta(int codigo, int codigoCliente, String cliente, String responsable, Date fecha, String observaciones, 
            double pagoTotal){
        this.codigo=codigo;
        this.codigoCliente=codigoCliente;
        this.cliente=cliente;
        this.responsable=responsable;
        this.fecha=fecha;
        this.observaciones=observaciones;
        this.pagoTotal=pagoTotal;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Venta(){
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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
    
}
