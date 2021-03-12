/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega;

import com.mycompany.softwarebodega.controlador.LoginControl;
import com.mycompany.softwarebodega.dao.Conexion;
import com.mycompany.softwarebodega.vista.Login;
import com.mycompany.softwarebodega.vista.Menu;

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
    }
}
