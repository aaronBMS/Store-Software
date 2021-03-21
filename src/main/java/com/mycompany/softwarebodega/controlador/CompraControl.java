/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.CompraCRUD;
import com.mycompany.softwarebodega.dao.DCompraCRUD;
import com.mycompany.softwarebodega.modelo.Compra;
import com.mycompany.softwarebodega.vista.CompraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaron
 */
public class CompraControl implements ActionListener{
    
    CompraVista co;
    
    public CompraControl(CompraVista c){
        this.co=c;
        this.co.jbtnCancelar.addActionListener(this);
        this.co.jbtnCrear.addActionListener(this);
        this.co.jbtnEscogerProducto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == co.jbtnCrear) {
            int codigo = Integer.parseInt(co.jtxtCodigo.getText());
            int ccliente = Integer.parseInt(co.jcbRUC.getSelectedItem().toString());
            String cliente = co.jtxtNombre.getText();
            String responsable = co.jcbResponsable.getSelectedItem().toString();
            String fecha = getFechaActual();
            String observaciones = co.jtaObservaciones.getText();
            double total = Double.parseDouble(co.jtxtTotal.getText());
            Compra v = new Compra(codigo, ccliente, cliente, responsable, fecha, observaciones, total);
            CompraCRUD compraCRUD = new CompraCRUD();
            compraCRUD.Create(v);
            Limpiar();
        }
        if (e.getSource() == co.jbtnCancelar) {
            Limpiar();
        }
        if (e.getSource() == co.jbtnEscogerProducto) {
            DCompraCRUD dvCRUD = new DCompraCRUD();
            com.mycompany.softwarebodega.Main.detalleCVista.jcbProducto.removeAllItems();
            dvCRUD.ComboBox();
            com.mycompany.softwarebodega.Main.detalleVVista.jtxtCodigoVenta.setText(co.jtxtCodigo.getText());
            com.mycompany.softwarebodega.Main.detalleVVista.jtxtCodigoVenta.enable(false);
            com.mycompany.softwarebodega.Main.detalleVVista.jtxtCodigo.enable(false);
            com.mycompany.softwarebodega.Main.detalleVVista.jtxtPrecio.enable(false);
            com.mycompany.softwarebodega.Main.detalleVVista.setVisible(true);
        }
    }
    
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    public void Limpiar() {
        int code = (int) (Math.random() * 1000000 + 1);
        co.jtxtCodigo.setText(code + "");
        co.jcbRUC.setSelectedIndex(0);
        co.jtxtNombre.setText("");
        co.jcbResponsable.setSelectedIndex(0);
        co.jtaObservaciones.setText("");
        co.jtxtTotal.setText("");
        Borrar();
    }

    public void Borrar() {
        DefaultTableModel modelo = (DefaultTableModel) co.jtCompra.getModel();
        for (int i = 0; i < co.jtCompra.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
}
