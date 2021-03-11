/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aaron
 */
public class Conexion {
    
    /**
     * Variables de Conexión.
     */
    public static String DRIVER="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/BODEGA"; 
    public static String USER="root";
    public static String PASSWORD="";
    
    public static Connection con;
    
    public Connection getConecction(){
        try{
            Class.forName(DRIVER);
            con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.print("Conectado");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        return con;
    }
}
