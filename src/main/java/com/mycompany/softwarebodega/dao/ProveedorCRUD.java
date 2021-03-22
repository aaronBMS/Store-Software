/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.ProveedorFormato;
import com.mycompany.softwarebodega.modelo.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class ProveedorCRUD implements ProveedorFormato{
    
    Statement st;
    ResultSet rs;

    @Override
    public void Create(Proveedor e) {
        try{
            st=Conexion.con.createStatement();
            int afect=st.executeUpdate("INSERT INTO PROVEEDOR VALUES ("+e.getRUC()+",'"+e.getNombre()+"','"+e.getDireccion()+"','"+e.getCiudad()+"','"+e.getCorreo()+"',"+e.getTelefono()+",'"+e.getObservaciones()+"')");
            JOptionPane.showMessageDialog(null,"Proveedor Registrado");
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }
}
