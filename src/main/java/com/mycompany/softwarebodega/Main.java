/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega;

import com.mycompany.softwarebodega.controlador.LoginControl;
import com.mycompany.softwarebodega.controlador.MenuControl;
import com.mycompany.softwarebodega.controlador.UsuarioControl;
import com.mycompany.softwarebodega.dao.Conexion;
import com.mycompany.softwarebodega.vista.AlmacenVista;
import com.mycompany.softwarebodega.vista.ClienteVista;
import com.mycompany.softwarebodega.vista.CompraVista;
import com.mycompany.softwarebodega.vista.ConfiguracionVista;
import com.mycompany.softwarebodega.vista.Login;
import com.mycompany.softwarebodega.vista.Menu;
import com.mycompany.softwarebodega.vista.ProductoVista;
import com.mycompany.softwarebodega.vista.ProveedorVista;
import com.mycompany.softwarebodega.vista.UsuarioVista;
import com.mycompany.softwarebodega.vista.VentaVista;

/**
 *
 * @author Aaron
 */
public class Main {
    
    /**
     * Variables por Clase.
     */
    public static Login login;
    public static Menu menu;
    public static Conexion conexion;
    public static LoginControl loginControl;
    public static UsuarioVista usuarioVista;
    public static VentaVista ventaVista;
    public static CompraVista compraVista;
    public static ClienteVista clienteVista;
    public static ProductoVista productoVista;
    public static AlmacenVista almacenVista;
    public static ProveedorVista proveedorVista;
    public static ConfiguracionVista configuracionVista;
    public static MenuControl menuControl;
    public static UsuarioControl usuarioControl;
    
    /**
     * Método Main.
     * @param args 
     */
    public static void main(String[] args) {
        conexion=new Conexion();
        conexion.getConecction();
        login=new Login();
        login.setVisible(true);
        loginControl=new LoginControl(login);
        menu=new Menu();
        usuarioVista=new UsuarioVista();
        ventaVista=new VentaVista();
        compraVista=new CompraVista();
        clienteVista=new ClienteVista();
        productoVista=new ProductoVista();
        almacenVista=new AlmacenVista();
        proveedorVista=new ProveedorVista();
        configuracionVista=new ConfiguracionVista();
        menuControl=new MenuControl(menu);
        usuarioControl=new UsuarioControl(usuarioVista);
    }
}
