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
        jlblContraseña = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtContraseña = new javax.swing.JPasswordField();
        jbtnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Bodega");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTitle.setBackground(new java.awt.Color(139, 184, 146));
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

        jlblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblContraseña.setForeground(new java.awt.Color(187, 187, 188));
        jlblContraseña.setText("Contraseña:");
        jpLogin.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        jtxtUsuario.setBackground(new java.awt.Color(69, 73, 75));
        jtxtUsuario.setForeground(new java.awt.Color(187, 187, 188));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLogin.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        jtxtContraseña.setBackground(new java.awt.Color(69, 73, 75));
        jtxtContraseña.setForeground(new java.awt.Color(187, 187, 188));
        jtxtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLogin.add(jtxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, 30));

        jbtnIngresar.setBackground(new java.awt.Color(69, 73, 75));
        jbtnIngresar.setForeground(new java.awt.Color(187, 187, 188));
        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpLogin.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 70));

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
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton jbtnIngresar;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpTitle;
    public javax.swing.JPasswordField jtxtContraseña;
    public javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
