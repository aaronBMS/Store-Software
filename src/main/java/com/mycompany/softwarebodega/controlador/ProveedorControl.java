/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.ProveedorCRUD;
import com.mycompany.softwarebodega.modelo.Proveedor;
import com.mycompany.softwarebodega.vista.ProveedorVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class ProveedorControl implements ActionListener{
    
    ProveedorVista prov;
    
    public ProveedorControl(ProveedorVista p){
        this.prov=p;
        this.prov.jbtnCrear.addActionListener(this);
        this.prov.jbtnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prov.jbtnCrear){
            int ruc=Integer.parseInt(prov.jtxtRUC.getText());
            String nombre=prov.jtxtNombre.getText();
            String direccion=prov.jtxtDireccion.getText();
            String ciudad=prov.jtxtCiudad.getText();
            String correo=prov.jtxtCorreo.getText();
            int telefono=Integer.parseInt(prov.jtxtTelefono.getText());
            String observaciones=prov.jtaObservaciones.getText();
            Proveedor p=new Proveedor(ruc,nombre,direccion,ciudad,correo,telefono,observaciones);
            ProveedorCRUD pCRUD=new ProveedorCRUD();
            pCRUD.Create(p);
            Limpiar();
        }
        if(e.getSource()==prov.jbtnCancelar){
            Limpiar();
        }
    }
    
    public void Limpiar(){
        prov.jtxtRUC.setText("");
        prov.jtxtNombre.setText("");
        prov.jtxtDireccion.setText("");
        prov.jtxtCiudad.setText("");
        prov.jtxtCorreo.setText("");
        prov.jtxtTelefono.setText("");
        prov.jtaObservaciones.setText("");
        prov.jtxtRUC.requestFocus();
    }
}
