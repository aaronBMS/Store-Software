/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.DCompraCRUD;
import com.mycompany.softwarebodega.dao.Listar;
import com.mycompany.softwarebodega.modelo.DetalleCompra;
import com.mycompany.softwarebodega.vista.DetalleCVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class DetalleCControl implements ActionListener{
    
    DetalleCVista det;
    
    public DetalleCControl(DetalleCVista d){
        this.det=d;
        this.det.jbtnAgregar.addActionListener(this);
        this.det.jbtnLimpiar.addActionListener(this);
        this.det.jbtnSalir.addActionListener(this);
        this.det.jbtnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==det.jbtnRegistrar){
            int cventa=Integer.parseInt(det.jtxtCodigoCompra.getText());
            int cproducto=Integer.parseInt(det.jtxtCodigo.getText());
            String nombre=det.jcbProducto.getSelectedItem().toString();
            int cantidad=Integer.parseInt(det.jtxtCantidad.getText());
            double precio=Double.parseDouble(det.jtxtPrecio.getText());
            double descuento=Double.parseDouble(det.jtxtDescuento.getText());
            double total=precio*cantidad-descuento;
            DetalleCompra dev=new DetalleCompra(cventa,cproducto,nombre,cantidad,precio,descuento,total);
            DCompraCRUD dvCRUD=new DCompraCRUD();
            dvCRUD.Create(dev);
            Listar la=new Listar();
            la.tablaVentas(com.mycompany.softwarebodega.Main.compraVista.jtCompra,Integer.parseInt(com.mycompany.softwarebodega.Main.detalleVVista.jtxtCodigoVenta.getText()));   
            com.mycompany.softwarebodega.Main.ventaVista.jtxtTotal.setText(Totalizar()+"");
            Limpiar();
        }
        if(e.getSource()==det.jbtnSalir){
            com.mycompany.softwarebodega.Main.detalleVVista.dispose();
        }
        if(e.getSource()==det.jbtnAgregar){
            DCompraCRUD dcCRUD=new DCompraCRUD();
            dcCRUD.Search(det.jcbProducto.getSelectedItem().toString());
        }
        if(e.getSource()==det.jbtnLimpiar){
            Limpiar();
        }
    }
    
    public void Limpiar(){
        det.jcbProducto.setSelectedIndex(0);
        det.jtxtCodigo.setText("");
        det.jtxtCantidad.setText("");
        det.jtxtPrecio.setText("");
        det.jtxtDescuento.setText("");
        det.jtxtCantidad.requestFocus();
    }
    
    public double Totalizar(){
        double t=0;
        double p=0;
        if(com.mycompany.softwarebodega.Main.compraVista.jtCompra.getRowCount()>0){
            for(int i=0;i<com.mycompany.softwarebodega.Main.compraVista.jtCompra.getRowCount();i++){
                p=Double.parseDouble(com.mycompany.softwarebodega.Main.compraVista.jtCompra.getValueAt(i, 5).toString());
                t+=p;
            }
        }
        return t;
    }
}
