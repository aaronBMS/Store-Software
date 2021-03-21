/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.CompraFormato;
import com.mycompany.softwarebodega.modelo.Compra;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class CompraCRUD implements CompraFormato{

    Statement st;
    
    @Override
    public void Create(Compra e) {
        try {
            st=Conexion.con.createStatement();
            int afect=st.executeUpdate("INSERT INTO COMPRA VALUES ("+e.getCodigo()+","+e.getRUC()+",'"+e.getProveedor()+"','"+e.getResponsable()+"','"+e.getFecha()+"','"+e.getObservaciones()+"',"+e.getPagoTotal()+")");
            JOptionPane.showMessageDialog(null,"Compra Registrada");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
}
