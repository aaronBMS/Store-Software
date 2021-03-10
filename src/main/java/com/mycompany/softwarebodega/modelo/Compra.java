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
public class Compra {
    
    /**
     * Variables Privadas.
     */
    private int codigo,RUC;
    private String proveedor,responsable,observaciones;
    private Date fecha;
    static final double IGV=0.18;
    private double pagoTotal;
    
    /**
     * Método Constructor.
     * @param codigo - Identificador por compra.
     * @param RUC - Identificador por proveedor.
     * @param proveedor - Proveedor.
     * @param responsable - Responsable/Usuario.
     * @param fecha - Fecha actual.
     * @param observaciones - Observaciones.
     * @param pagoTotal - Pago total.
     */
    public Compra(int codigo, int RUC, String proveedor, String responsable, Date fecha, String observaciones, 
            double pagoTotal){
        this.codigo=codigo;
        this.RUC=RUC;
        this.proveedor=proveedor;
        this.responsable=responsable;
        this.fecha=fecha;
        this.observaciones=observaciones;
        this.pagoTotal=pagoTotal;
    }
    
    /**
     * Método Constructor Vacío.
     */
    public Compra(){  
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

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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
