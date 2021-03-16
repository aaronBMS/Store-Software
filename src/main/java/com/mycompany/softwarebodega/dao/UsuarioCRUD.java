/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.UsuarioFormato;
import com.mycompany.softwarebodega.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class UsuarioCRUD implements UsuarioFormato {
 
    Statement st;
    ResultSet rs;
    
    @Override
    public void Search() {
         
    }

    @Override
    public void Create(Usuario e) {
        try {
            st = Conexion.con.createStatement();
            int afect = st.executeUpdate("INSERT INTO USUARIO VALUES ("+e.getCodigo()+",'"+e.getNombre()+"','"+e.getApellido()+"',"+e.getTelefono()+",'"+e.getCorreo()+"','"+e.getUsuario()+"','"+e.getContraseña()+"','"+e.getCondicion()+"')");
            JOptionPane.showMessageDialog(null,"Usuario Creado");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public void Update(Usuario e) {
       
    }

    @Override
    public void Delete(int code) {
        
    }

    /**
     * Método para validar si el usuario existe en la base de datos.
     */
    @Override
    public void Validate() {
        int res = 0;
        try {
            Statement st = Conexion.con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM USUARIO WHERE USUARIO='" + com.mycompany.softwarebodega.Main.login.jtxtUsuario.getText() + "'AND CONTRASEÑA='" + com.mycompany.softwarebodega.Main.login.jtxtContraseña.getText() + "'");
            if (rs.next()) {
                res = 1;
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    com.mycompany.softwarebodega.Main.menu.setVisible(true);
                    com.mycompany.softwarebodega.Main.login.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrectos");
            }
            com.mycompany.softwarebodega.Main.login.jtxtUsuario.setText("");
            com.mycompany.softwarebodega.Main.login.jtxtContraseña.setText("");
            com.mycompany.softwarebodega.Main.login.jtxtUsuario.requestFocus();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public void ValidatePriority(String user) {
        
    }

}
