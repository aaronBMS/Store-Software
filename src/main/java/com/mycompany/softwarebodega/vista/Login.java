/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softwarebodega.vista;

/**
 *
 * @author Aaron
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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

        jpTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpLogin = new javax.swing.JPanel();
        jlblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Bodega");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitle.setBackground(new java.awt.Color(141, 230, 238));
        jpTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 67, 68));
        jLabel1.setText(" SISTEMA - BODEGA");
        jpTitle.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 180, 30));

        getContentPane().add(jpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        jpLogin.setBackground(new java.awt.Color(66, 67, 68));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(187, 187, 188));
        jlblUsuario.setText(" Usuario:");
        jpLogin.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 187, 188));
        jLabel2.setText("Contraseña:");
        jpLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        jTextField1.setBackground(new java.awt.Color(69, 73, 75));
        jTextField1.setForeground(new java.awt.Color(187, 187, 188));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLogin.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        jPasswordField1.setBackground(new java.awt.Color(69, 73, 75));
        jPasswordField1.setForeground(new java.awt.Color(187, 187, 188));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLogin.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, 30));

        jButton1.setBackground(new java.awt.Color(69, 73, 75));
        jButton1.setForeground(new java.awt.Color(187, 187, 188));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 70));

        getContentPane().add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpTitle;
    // End of variables declaration//GEN-END:variables
}
