package project.penjualan.cd;


import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class login extends javax.swing.JFrame {
private Connection conn = new Koneksi().getKoneksi();
    
/**
     * Creates new form login
     */
    public login() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        tombolLogin = new javax.swing.JLabel();
        tombolDaftar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        usernameField.setBorder(null);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameField);
        usernameField.setBounds(550, 240, 200, 14);

        passwordField.setBorder(null);
        jPanel1.add(passwordField);
        passwordField.setBounds(550, 300, 200, 30);

        tombolLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolLoginMouseClicked(evt);
            }
        });
        jPanel1.add(tombolLogin);
        tombolLogin.setBounds(470, 350, 250, 30);

        tombolDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolDaftarMouseClicked(evt);
            }
        });
        jPanel1.add(tombolDaftar);
        tombolDaftar.setBounds(550, 430, 100, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-01.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(800, 567));
        jLabel5.setMinimumSize(new java.awt.Dimension(800, 567));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 930, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void tombolLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolLoginMouseClicked
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet result=stat.executeQuery ("select * from tb_username where "
                + "username='" +usernameField.getText()+"'");
            if (result.next()) {
                if (passwordField.getText().equals(result.getString("password"))){
                    MenuUtama mn = new MenuUtama();
                    mn.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane,"Password Salah");
                    passwordField.setText("");
                    usernameField.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "User Tidak Ditemukan");
                usernameField.setText("");
                passwordField.setText("");
                usernameField.requestFocus();
            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_tombolLoginMouseClicked

    private void tombolDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolDaftarMouseClicked
        new Daftar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolDaftarMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel tombolDaftar;
    private javax.swing.JLabel tombolLogin;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
