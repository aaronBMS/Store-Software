/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.ClienteCRUD;
import com.mycompany.softwarebodega.modelo.Cliente;
import com.mycompany.softwarebodega.vista.ClienteVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class ClienteControl implements ActionListener{
    
    ClienteVista cl;
    
    public ClienteControl(ClienteVista c){
        this.cl=c;
        this.cl.jbtnCrear.addActionListener(this);
        this.cl.jbtnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cl.jbtnCrear){
            int codigo=(int)(Math.random()*1000000+1);
            String nombre=cl.jtxtNombre.getText();
            String apellido=cl.jtxtApellido.getText();
            int telefono=Integer.parseInt(cl.jtxtTelefono.getText());
            String correo=cl.jtxtCorreo.getText();
            Cliente c=new Cliente(codigo,nombre,apellido,telefono,correo);
            ClienteCRUD cCRUD=new ClienteCRUD();
            cCRUD.Create(c);
            Limpiar();
        }
        if(e.getSource()==cl.jbtnCancelar){
            Limpiar();
        }
    }
    
    public void Limpiar(){
        cl.jtxtNombre.setText("");
        cl.jtxtApellido.setText("");
        cl.jtxtTelefono.setText("");
        cl.jtxtCorreo.setText("");
        cl.jtxtNombre.requestFocus();
    }
}
