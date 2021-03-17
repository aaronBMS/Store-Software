/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.VentaFormato;
import com.mycompany.softwarebodega.modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class VentaCRUD implements VentaFormato{

    Statement st;
    ResultSet rs;
    
    @Override
    public void Search() {
       
    }

    @Override
    public void Create(Venta e) {
        try {
            st=Conexion.con.createStatement();
            int afect=st.executeUpdate("INSERT INTO VENTA VALUES ("+e.getCodigo()+","+e.getCodigoCliente()+",'"+e.getCliente()+"','"+e.getResponsable()+"','"+e.getFecha()+"','"+e.getObservaciones()+"',"+e.getPagoTotal()+"");
            JOptionPane.showMessageDialog(null,"Venta Registrada");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
}
