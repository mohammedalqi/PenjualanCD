package project.penjualan.cd;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
    }

    public void daftarAkun(){
        if("".equals(usernameField.getText())||"".equals(passwordField.getText())){
                JOptionPane.showMessageDialog(this, "DATA IS NOT VALID","Error",JOptionPane.WARNING_MESSAGE);
            }
        else{
            
                if(!"".equals(usernameField.getText())&&!"".equals(passwordField.getText())){
                    String aSQL = "INSERT INTO tb_username (username,password)VALUES('"+usernameField.getText()+"','"+passwordField.getText()+"');";
                    try {
                        Koneksi conn = new Koneksi();
            
                        Statement S = conn.getKoneksi().createStatement();
                        int R = S.executeUpdate(aSQL);
                        System.out.println(aSQL);
                    } catch (SQLException ex) {
                        
                    }
                    System.out.println(aSQL);
                    
                    System.out.println("sukses");
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
                    new login().setVisible(true);
                    this.dispose();
                }
                else
                {
                    System.out.println("gagal");
                }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tombolLogin = new javax.swing.JLabel();
        tombolDaftar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        tombolLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolLoginMouseClicked(evt);
            }
        });
        jPanel1.add(tombolLogin);
        tombolLogin.setBounds(580, 430, 120, 30);

        tombolDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolDaftarMouseClicked(evt);
            }
        });
        jPanel1.add(tombolDaftar);
        tombolDaftar.setBounds(510, 350, 250, 30);

        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 130, 48, 14);

        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 100, 46, 14);

        usernameField.setBorder(null);
        jPanel1.add(usernameField);
        usernameField.setBounds(550, 230, 200, 30);

        passwordField.setBorder(null);
        jPanel1.add(passwordField);
        passwordField.setBounds(550, 300, 200, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/halamandaftar.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 930, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombolDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolDaftarMouseClicked
        daftarAkun();
    }//GEN-LAST:event_tombolDaftarMouseClicked

    private void tombolLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolLoginMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel tombolDaftar;
    private javax.swing.JLabel tombolLogin;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
