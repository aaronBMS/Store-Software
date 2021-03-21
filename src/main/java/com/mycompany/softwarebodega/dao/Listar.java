/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.dao;

import com.mycompany.softwarebodega.formato.Encabezado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aaron
 */
public class Listar implements Encabezado{
    
    Statement st;
    ResultSet rs;
    
    public void tablaAlmacen(JTable tabla){
        DefaultTableModel mt=new DefaultTableModel(Data,tablaAlmacen){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setModel(mt);
        try{
            st=Conexion.con.createStatement();
            rs=st.executeQuery("SELECT * FROM PRODUCTO");
            while(rs.next()){
                Object[] rm=new Object[5];
                rm[0]=rs.getInt(1);
                rm[1]=rs.getString(2);
                rm[2]=rs.getString(3);
                rm[3]=rs.getString(4);
                rm[4]=rs.getInt(5);
                mt.addRow(rm);
            }
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }
    
    public void tablaVentas(JTable tabla, int codigo){
        DefaultTableModel mt=new DefaultTableModel(Data,tablaVenta){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setModel(mt);
        try{
            st=Conexion.con.createStatement();
            rs=st.executeQuery("SELECT * FROM DETALLE_VENTA WHERE CODIGO_VENTA=" +codigo);
            while(rs.next()){
                Object[] rm=new Object[6];
                rm[0]=rs.getInt(2);
                rm[1]=rs.getString(3);
                rm[2]=rs.getInt(4);
                rm[3]=rs.getDouble(5);
                rm[4]=rs.getDouble(6);
                rm[5]=rs.getDouble(7);
                mt.addRow(rm);
            }
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }
    
    public void tablaCompras(JTable tabla, int codigo){
        DefaultTableModel mt=new DefaultTableModel(Data,tablaVenta){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.setModel(mt);
        try{
            st=Conexion.con.createStatement();
            rs=st.executeQuery("SELECT * FROM DETALLE_COMPRA WHERE CODIGO_VENTA=" +codigo);
            while(rs.next()){
                Object[] rm=new Object[6];
                rm[0]=rs.getInt(2);
                rm[1]=rs.getString(3);
                rm[2]=rs.getInt(4);
                rm[3]=rs.getDouble(5);
                rm[4]=rs.getDouble(6);
                rm[5]=rs.getDouble(7);
                mt.addRow(rm);
            }
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
    }
}
