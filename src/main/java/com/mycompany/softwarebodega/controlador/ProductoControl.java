/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.dao.ProductoCRUD;
import com.mycompany.softwarebodega.modelo.Producto;
import com.mycompany.softwarebodega.vista.ProductoVista;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Aaron
 */
public class ProductoControl implements ActionListener,MouseListener{
    
    ProductoVista prod;
    FileInputStream archivoBytes;
    String file;
    
    public ProductoControl(ProductoVista p){
        this.prod=p;
        this.prod.jbtnCrear.addActionListener(this);
        this.prod.jbtnCancelar.addActionListener(this);
        this.prod.jlblFoto.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prod.jbtnCrear){
            int codigo=(int)(Math.random()*1000000+1);
            String nombre=prod.jtxtNombre.getText();
            String categoria=prod.jtxtCategoria.getText();
            String marca=prod.jtxtMarca.getText();
            int stocki=Integer.parseInt(prod.jtxtStockInicial.getText());
            int stockm=Integer.parseInt(prod.jtxtStockMinimo.getText());
            double precioc=Double.parseDouble(prod.jtxtPrecioCosto.getText());
            double preciov=Double.parseDouble(prod.jtxtPrecioVenta.getText());
            double utilidad=Double.parseDouble(prod.jtxtUtilidad.getText());
            byte[] bytes=file.getBytes();
            Producto p=new Producto(codigo,nombre,categoria,marca,stocki,stockm,precioc,preciov,utilidad,bytes);
            ProductoCRUD pCRUD=new ProductoCRUD();
            pCRUD.Create(p);
            Limpiar();
        }
        if(e.getSource()==prod.jbtnCancelar){
            Limpiar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==prod.jlblFoto){
            JFileChooser jfc=new JFileChooser();
            int option=jfc.showOpenDialog(prod);
            if(option==JFileChooser.APPROVE_OPTION){
                file=jfc.getSelectedFile().getPath();
                ImageIcon icon=new ImageIcon(file);
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(140, 180, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newImg);
                prod.jlblFoto.setIcon(newIcon);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public void Limpiar(){
        prod.jtxtNombre.setText("");
        prod.jtxtCategoria.setText("");
        prod.jtxtMarca.setText("");
        prod.jtxtUtilidad.setText("");
        prod.jtxtStockInicial.setText("");
        prod.jtxtStockMinimo.setText("");
        prod.jtxtPrecioCosto.setText("");
        prod.jtxtPrecioVenta.setText("");
        prod.jlblFoto.setIcon(null);
        prod.jtxtNombre.requestFocus();
    }
}
