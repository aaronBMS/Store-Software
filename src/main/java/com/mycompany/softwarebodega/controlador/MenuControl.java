/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.vista.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class MenuControl implements ActionListener{
    
    Menu menu;
    
    public MenuControl(Menu m){
        this.menu=m;
        this.menu.jbtnVentas.addActionListener(this);
        this.menu.jbtnCompras.addActionListener(this);
        this.menu.jbtnClientes.addActionListener(this);
        this.menu.jbtnProductos.addActionListener(this);
        this.menu.jbtnUsuarios.addActionListener(this);
        this.menu.jbtnAlmacen.addActionListener(this);
        this.menu.jbtnProveedores.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu.jbtnUsuarios){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.usuarioVista);
            com.mycompany.softwarebodega.Main.usuarioVista.setVisible(true);
            com.mycompany.softwarebodega.Main.usuarioVista.jtxtNombre.requestFocus();
        }
        if(e.getSource()==menu.jbtnVentas){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.ventaVista);
            com.mycompany.softwarebodega.Main.ventaVista.setVisible(true);
        }
        if(e.getSource()==menu.jbtnCompras){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.compraVista);
            com.mycompany.softwarebodega.Main.compraVista.setVisible(true);
        }
        if(e.getSource()==menu.jbtnClientes){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.clienteVista);
            com.mycompany.softwarebodega.Main.clienteVista.setVisible(true);
        }
        if(e.getSource()==menu.jbtnProductos){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.productoVista);
            com.mycompany.softwarebodega.Main.productoVista.setVisible(true);
        }
        if(e.getSource()==menu.jbtnAlmacen){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.almacenVista);
            com.mycompany.softwarebodega.Main.almacenVista.setVisible(true);
        }
        if(e.getSource()==menu.jbtnProveedores){
            CerrarVentanas();
            menu.jdpContenerdor.add(com.mycompany.softwarebodega.Main.proveedorVista);
            com.mycompany.softwarebodega.Main.proveedorVista.setVisible(true);
        }
    }
    
    public void CerrarVentanas(){
        com.mycompany.softwarebodega.Main.ventaVista.doDefaultCloseAction();
        com.mycompany.softwarebodega.Main.compraVista.doDefaultCloseAction();
        com.mycompany.softwarebodega.Main.clienteVista.doDefaultCloseAction();
        com.mycompany.softwarebodega.Main.usuarioVista.doDefaultCloseAction();
        com.mycompany.softwarebodega.Main.productoVista.doDefaultCloseAction();
        com.mycompany.softwarebodega.Main.almacenVista.doDefaultCloseAction();
        com.mycompany.softwarebodega.Main.proveedorVista.doDefaultCloseAction();
    }
}
