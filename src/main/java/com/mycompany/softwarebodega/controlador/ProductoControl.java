/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.controlador;

import com.mycompany.softwarebodega.vista.ProductoVista;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Aaron
 */
public class ProductoControl implements ActionListener,MouseListener{
    
    ProductoVista prod;
    
    public ProductoControl(ProductoVista p){
        this.prod=p;
        this.prod.jbtnCrear.addActionListener(this);
        this.prod.jbtnCancelar.addActionListener(this);
        this.prod.jlblFoto.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prod.jbtnCrear){
            
        }
        if(e.getSource()==prod.jbtnCancelar){
            
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
                String file=jfc.getSelectedFile().getPath();
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
}
