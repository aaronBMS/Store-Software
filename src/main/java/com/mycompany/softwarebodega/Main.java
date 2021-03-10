/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega;

import com.mycompany.softwarebodega.vista.Login;

/**
 *
 * @author Aaron
 */
public class Main {
    
    public static Login login;
    
    public static void main(String[] args) {
        
        login=new Login();
        login.setVisible(true);
    }
}
