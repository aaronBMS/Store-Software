/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.DCompraFormato;
import com.mycompany.softwarebodega.modelo.DetalleCompra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class DCompraCRUD implements DCompraFormato {

    Statement st;
    ResultSet rs;

    @Override
    public void Create(DetalleCompra e) {
        try {
            st=Conexion.con.createStatement();
            int afect=st.executeUpdate("INSERT INTO DETALLE_COMPRA VALUES ("+e.getCodigoCompra()+","+e.getCodigoProducto()+",'"+e.getNombre()+"',"+e.getCantidad()+","+e.getPrecio()+","+e.getDescuento()+","+e.getTotal()+")");
            JOptionPane.showMessageDialog(null,"Compra Agregada");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public void Search(String n) {
        try {
            st = Conexion.con.createStatement();
            rs = st.executeQuery("SELECT * FROM PRODUCTO WHERE NOMBRE='"+n+"'");
            while (rs.next()) {
                com.mycompany.softwarebodega.Main.detalleCVista.jtxtCodigo.setText(rs.getString(1));
                com.mycompany.softwarebodega.Main.detalleCVista.jtxtPrecio.setText(rs.getDouble(8) + "");
            }
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public void ComboBox() {
        try {
            st = Conexion.con.createStatement(); 
            rs=st.executeQuery("SELECT * FROM PRODUCTO");
            while(rs.next()){
                com.mycompany.softwarebodega.Main.detalleCVista.jcbProducto.addItem(rs.getString(2));
            }            
        } catch (Exception ex) {
            System.out.print(ex);      
        }
    }

}
