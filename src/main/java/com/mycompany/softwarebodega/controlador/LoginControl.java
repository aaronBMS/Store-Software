/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.UsuarioCRUD;
import com.mycompany.softwarebodega.vista.Login;
import com.mycompany.softwarebodega.vista.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class LoginControl implements ActionListener{
    
    Login login;
    
    public LoginControl(Login log){
        this.login=log;
        this.login.jbtnIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login.jbtnIngresar){
            UsuarioCRUD userCRUD=new UsuarioCRUD();
            userCRUD.Validate();
        }
    }
}
