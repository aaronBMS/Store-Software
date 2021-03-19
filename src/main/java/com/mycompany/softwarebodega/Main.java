/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega;

import com.mycompany.softwarebodega.controlador.ClienteControl;
import com.mycompany.softwarebodega.controlador.DetalleVControl;
import com.mycompany.softwarebodega.controlador.LoginControl;
import com.mycompany.softwarebodega.controlador.MenuControl;
import com.mycompany.softwarebodega.controlador.ProductoControl;
import com.mycompany.softwarebodega.controlador.ProveedorControl;
import com.mycompany.softwarebodega.controlador.UsuarioControl;
import com.mycompany.softwarebodega.controlador.VentaControl;
import com.mycompany.softwarebodega.dao.Conexion;
import com.mycompany.softwarebodega.vista.AlmacenVista;
import com.mycompany.softwarebodega.vista.ClienteVista;
import com.mycompany.softwarebodega.vista.CompraVista;
import com.mycompany.softwarebodega.vista.ConfiguracionVista;
import com.mycompany.softwarebodega.vista.DetalleVVista;
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
    public static ProveedorControl proveedorControl;
    public static ProductoControl productoControl;
    public static ClienteControl clienteControl;
    public static VentaControl ventaControl;
    public static DetalleVVista detalleVVista;
    public static DetalleVControl detalleVcontrol;
    
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
        detalleVVista=new DetalleVVista();
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
        proveedorControl=new ProveedorControl(proveedorVista);
        productoControl=new ProductoControl(productoVista);
        clienteControl=new ClienteControl(clienteVista);
        ventaControl=new VentaControl(ventaVista);
        detalleVcontrol=new DetalleVControl(detalleVVista);
    }
}
