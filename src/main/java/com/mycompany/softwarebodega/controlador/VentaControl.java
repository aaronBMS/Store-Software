/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.VentaCRUD;
import com.mycompany.softwarebodega.modelo.Venta;
import com.mycompany.softwarebodega.vista.VentaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class VentaControl implements ActionListener{
    
    VentaVista venta;
    
    public VentaControl(VentaVista v){
        this.venta=v;
        this.venta.jbtnCrear.addActionListener(this);
        this.venta.jbtnCancelar.addActionListener(this);
        this.venta.jbtnEscogerProducto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==venta.jbtnCrear){
            try {
                int codigo=Integer.parseInt(venta.jtxtNombre.getText());
                int ccliente=Integer.parseInt(venta.jcbCodigoDeCliente.getSelectedItem().toString());
                String cliente=venta.jtxtNombre.getText();
                String responsable=venta.jcbResponsable.getSelectedItem().toString();
                Date date=new SimpleDateFormat("dd/MM/yyyy").parse(getFechaActual());
                long d=date.getTime();
                java.sql.Date fecha=new java.sql.Date(d);
                String observaciones=venta.jtaObservaciones.getText();
                double total=Double.parseDouble(venta.jtxtTotal.getText());
                Venta v=new Venta(codigo,ccliente,cliente,responsable,fecha,observaciones,total);
                VentaCRUD ventaCRUD=new VentaCRUD();
                ventaCRUD.Create(v);
            } catch (ParseException ex) {
                System.out.print(ex.getMessage());
            }
        }
        if(e.getSource()==venta.jbtnCancelar){
            
        }
        if(e.getSource()==venta.jbtnEscogerProducto){
            
        }
    }
    
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
}
