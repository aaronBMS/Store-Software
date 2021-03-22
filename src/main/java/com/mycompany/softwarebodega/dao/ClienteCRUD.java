/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.ClienteFormato;
import com.mycompany.softwarebodega.modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class ClienteCRUD implements ClienteFormato{
    
    Statement st;
    ResultSet rs;

    @Override
    public void Create(Cliente e) {
        try {
            st=Conexion.con.createStatement();
            int afect=st.executeUpdate("INSERT INTO CLIENTE VALUES ("+e.getCodigo()+",'"+e.getNombre()+"','"+e.getApellido()+"',"+e.getTelefono()+",'"+e.getCorreo()+"')");
            JOptionPane.showMessageDialog(null,"Cliente Registrado");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public void ComboBox() {
        try {
            st = Conexion.con.createStatement(); 
            rs=st.executeQuery("SELECT * FROM CLIENTE");
            while(rs.next()){
                com.mycompany.softwarebodega.Main.ventaVista.jcbCodigoDeCliente.addItem(rs.getString(1));
            }            
        } catch (Exception ex) {
            System.out.print(ex);      
        }
    }
    
}
