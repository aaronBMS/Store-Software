/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.vista;

import java.awt.Color;

/**
 *
 * @author Aaron
 */
public class DetalleVVista extends javax.swing.JFrame {

    /**
     * Creates new form DetalleVVista
     */
    public DetalleVVista() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbProducto = new javax.swing.JComboBox<>();
        jlblProducto = new javax.swing.JLabel();
        jlblPrecio = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jlblCantidad = new javax.swing.JLabel();
        jtxtCantidad = new javax.swing.JTextField();
        jlblDescuento = new javax.swing.JLabel();
        jtxtDescuento = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        jlblCodigo = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jlblCodigo1 = new javax.swing.JLabel();
        jtxtCodigoVenta = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(69, 73, 75));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbProducto.setBackground(new java.awt.Color(69, 73, 75));
        jcbProducto.setForeground(new java.awt.Color(187, 187, 188));
        jcbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jcbProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, 30));

        jlblProducto.setForeground(new java.awt.Color(187, 187, 188));
        jlblProducto.setText("Producto:");
        getContentPane().add(jlblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 30));

        jlblPrecio.setForeground(new java.awt.Color(187, 187, 188));
        jlblPrecio.setText("Precio:");
        getContentPane().add(jlblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 30));

        jtxtPrecio.setBackground(new java.awt.Color(69, 73, 75));
        jtxtPrecio.setForeground(new java.awt.Color(187, 187, 188));
        jtxtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, 30));

        jlblCantidad.setForeground(new java.awt.Color(187, 187, 188));
        jlblCantidad.setText("Cantidad:");
        getContentPane().add(jlblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, 30));

        jtxtCantidad.setBackground(new java.awt.Color(69, 73, 75));
        jtxtCantidad.setForeground(new java.awt.Color(187, 187, 188));
        jtxtCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, 30));

        jlblDescuento.setForeground(new java.awt.Color(187, 187, 188));
        jlblDescuento.setText(" Descuento:");
        getContentPane().add(jlblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 80, 30));

        jtxtDescuento.setBackground(new java.awt.Color(69, 73, 75));
        jtxtDescuento.setForeground(new java.awt.Color(187, 187, 188));
        jtxtDescuento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 130, 30));

        jbtnAgregar.setBackground(new java.awt.Color(69, 73, 75));
        jbtnAgregar.setForeground(new java.awt.Color(187, 187, 188));
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 200, 30));

        jbtnSalir.setBackground(new java.awt.Color(69, 73, 75));
        jbtnSalir.setForeground(new java.awt.Color(187, 187, 188));
        jbtnSalir.setText("Salir");
        jbtnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 110, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 0, 0));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 10, 10));

        jbtnRegistrar.setBackground(new java.awt.Color(69, 73, 75));
        jbtnRegistrar.setForeground(new java.awt.Color(187, 187, 188));
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, 60));

        jlblCodigo.setForeground(new java.awt.Color(187, 187, 188));
        jlblCodigo.setText("Código:");
        getContentPane().add(jlblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 30));

        jtxtCodigo.setBackground(new java.awt.Color(69, 73, 75));
        jtxtCodigo.setForeground(new java.awt.Color(187, 187, 188));
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 30));

        jlblCodigo1.setForeground(new java.awt.Color(187, 187, 188));
        jlblCodigo1.setText("Código de Venta:");
        getContentPane().add(jlblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 30));

        jtxtCodigoVenta.setBackground(new java.awt.Color(69, 73, 75));
        jtxtCodigoVenta.setForeground(new java.awt.Color(187, 187, 188));
        jtxtCodigoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 30));

        jbtnLimpiar.setBackground(new java.awt.Color(69, 73, 75));
        jbtnLimpiar.setForeground(new java.awt.Color(187, 187, 188));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 110, 60));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalleVVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleVVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleVVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleVVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleVVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JButton jbtnAgregar;
    public javax.swing.JButton jbtnLimpiar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JButton jbtnSalir;
    public javax.swing.JComboBox<String> jcbProducto;
    private javax.swing.JLabel jlblCantidad;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblCodigo1;
    private javax.swing.JLabel jlblDescuento;
    private javax.swing.JLabel jlblPrecio;
    private javax.swing.JLabel jlblProducto;
    public javax.swing.JTextField jtxtCantidad;
    public javax.swing.JTextField jtxtCodigo;
    public javax.swing.JTextField jtxtCodigoVenta;
    public javax.swing.JTextField jtxtDescuento;
    public javax.swing.JTextField jtxtPrecio;
    // End of variables declaration//GEN-END:variables
}