/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.DVentaCRUD;
import com.mycompany.softwarebodega.dao.Listar;
import com.mycompany.softwarebodega.modelo.DetalleVenta;
import com.mycompany.softwarebodega.vista.DetalleVVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class DetalleVControl implements ActionListener{
    
    DetalleVVista dv;
    
    public DetalleVControl(DetalleVVista d){
        this.dv=d;
        this.dv.jbtnAgregar.addActionListener(this);
        this.dv.jbtnSalir.addActionListener(this);
        this.dv.jbtnRegistrar.addActionListener(this);
        this.dv.jbtnSalir.addActionListener(this);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==dv.jbtnRegistrar){
            int cventa=Integer.parseInt(dv.jtxtCodigoVenta.getText());
            int cproducto=Integer.parseInt(dv.jtxtCodigo.getText());
            String nombre=dv.jcbProducto.getSelectedItem().toString();
            int cantidad=Integer.parseInt(dv.jtxtCantidad.getText());
            double precio=Double.parseDouble(dv.jtxtPrecio.getText());
            double descuento=Double.parseDouble(dv.jtxtDescuento.getText());
            double total=precio*cantidad-descuento;
            DetalleVenta dev=new DetalleVenta(cventa,cproducto,nombre,cantidad,precio,descuento,total);
            DVentaCRUD dvCRUD=new DVentaCRUD();
            dvCRUD.Create(dev);
            Listar l=new Listar();
            l.tablaVentas(com.mycompany.softwarebodega.Main.ventaVista.jtVentas,Integer.parseInt(com.mycompany.softwarebodega.Main.detalleVVista.jtxtCodigoVenta.getText()));   
            com.mycompany.softwarebodega.Main.ventaVista.jtxtTotal.setText(Totalizar()+"");
            Limpiar();
        }
        if(e.getSource()==dv.jbtnSalir){
            com.mycompany.softwarebodega.Main.detalleVVista.dispose();
        }
        if(e.getSource()==dv.jbtnAgregar){
            DVentaCRUD dvCRUD=new DVentaCRUD();
            dvCRUD.Search(dv.jcbProducto.getSelectedItem().toString());
        }
    }
    
    public void Limpiar(){
        dv.jcbProducto.setSelectedIndex(0);
        dv.jtxtCodigo.setText("");
        dv.jtxtCantidad.setText("");
        dv.jtxtPrecio.setText("");
        dv.jtxtDescuento.setText("");
        dv.jtxtCantidad.requestFocus();
    }
    
    public double Totalizar(){
        double t=0;
        double p=0;
        if(com.mycompany.softwarebodega.Main.ventaVista.jtVentas.getRowCount()>0){
            for(int i=0;i<com.mycompany.softwarebodega.Main.ventaVista.jtVentas.getRowCount();i++){
                p=Double.parseDouble(com.mycompany.softwarebodega.Main.ventaVista.jtVentas.getValueAt(i, 5).toString());
                t+=p;
            }
        }
        return t;
    }
    
}
