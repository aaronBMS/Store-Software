/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

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
}
