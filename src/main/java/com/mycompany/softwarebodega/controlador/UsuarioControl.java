/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.vista.UsuarioVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class UsuarioControl implements ActionListener{
    
    UsuarioVista user;
    
    public UsuarioControl(UsuarioVista u){
        this.user=u;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
