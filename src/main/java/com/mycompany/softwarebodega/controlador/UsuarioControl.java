/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.UsuarioCRUD;
import com.mycompany.softwarebodega.modelo.Usuario;
import com.mycompany.softwarebodega.vista.UsuarioVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author Aaron
 */
public class UsuarioControl implements ActionListener{
    
    UsuarioVista user;
    
    public UsuarioControl(UsuarioVista u){
        this.user=u;
        this.user.jbtnCrear.addActionListener(this);
        this.user.jbtnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==user.jbtnCrear){
           int codigo=(int)(Math.random()*1000000+1);
           String nombre=user.jtxtNombre.getText();
           String apellido=user.jtxtApellido.getText();
           int telefono=Integer.parseInt(user.jtxtTelefono.getText());
           String correo=user.jtxtCorreo.getText();
           String usuario=user.jtxtUsuario.getText();
           String contraseña=user.jpfContraseña.getText();
           String condicion=user.jcbCondicion.getSelectedItem().toString();
           Usuario u=new Usuario(codigo,nombre,apellido,telefono,correo,usuario,contraseña,condicion);
           UsuarioCRUD userCRUD=new UsuarioCRUD();
           userCRUD.Create(u);
           Limpiar();
       }
       if(e.getSource()==user.jbtnCancelar){
           Limpiar();
       }
       
    }
    
    public void Limpiar(){
        user.jtxtNombre.setText("");
        user.jtxtApellido.setText("");
        user.jtxtTelefono.setText("");
        user.jtxtCorreo.setText("");
        user.jtxtUsuario.setText("");
        user.jpfContraseña.setText("");
        user.jcbCondicion.setSelectedIndex(0);
        user.jtxtNombre.requestFocus();
    }
}
