/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega;

import com.mycompany.softwarebodega.dao.Conexion;
import com.mycompany.softwarebodega.vista.Login;

/**
 *
 * @author Aaron
 */
public class Main {
    
    public static Login login;
    public static Conexion conexion;
    
    public static void main(String[] args) {
        
        conexion=new Conexion();
        conexion.getConecction();
        login=new Login();
        login.setVisible(true);
    }
}
