/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.ProductoFormato;
import com.mycompany.softwarebodega.modelo.Producto;
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
public class ProductoCRUD implements ProductoFormato{
    
    Statement st;
    ResultSet rs;

    @Override
    public void Search() {
        
    }

    @Override
    public void Create(Producto e) {
        try {
            st=Conexion.con.createStatement();
            int afect=st.executeUpdate("INSERT INTO PRODUCTO VALUES ("+e.getCodigo()+",'"+e.getNombre()+"','"
                    +e.getCategoria()+"','"+e.getMarca()+"',"+e.getStockInicial()+","+e.getStockMinimo()+","
                    +e.getPrecioCosto()+","+e.getPrecioVenta()+","+e.getUtilidad()+",'"+e.getImagen()+"')");
            JOptionPane.showMessageDialog(null,"Producto Registrado");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
       
    }

    @Override
    public void Update(Producto e) {
        
    }

    @Override
    public void Delete(int code) {
        
    }
    
}
