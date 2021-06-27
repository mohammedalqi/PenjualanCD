package project.penjualan.cd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

public class hiphop extends javax.swing.JFrame {
    
    String itemHiphop;
    int qtyHiphop;
    String hargaHiphop;
   
    public final Koneksi koneksi = new Koneksi();
    private boolean databaru;

    public hiphop() {
        initComponents();
        databaru = true;

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tombolKembali = new javax.swing.JLabel();
        tombolBeli = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JSpinner();
        lblGenre = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        tombolKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKembaliMouseClicked(evt);
            }
        });
        jPanel1.add(tombolKembali);
        tombolKembali.setBounds(810, 310, 100, 30);

        tombolBeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolBeliMouseClicked(evt);
            }
        });
        jPanel1.add(tombolBeli);
        tombolBeli.setBounds(650, 510, 100, 30);

        txtJumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtJumlah.setModel(new javax.swing.SpinnerNumberModel(1, 0, 5, 1));
        txtJumlah.setBorder(null);
        txtJumlah.setMaximumSize(new java.awt.Dimension(10, 18));
        txtJumlah.setMinimumSize(new java.awt.Dimension(10, 18));
        txtJumlah.setPreferredSize(new java.awt.Dimension(10, 18));
        txtJumlah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtJumlahStateChanged(evt);
            }
        });
        jPanel1.add(txtJumlah);
        txtJumlah.setBounds(380, 444, 170, 34);

        lblGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGenre.setText("HIPHOP BUNDLE");
        jPanel1.add(lblGenre);
        lblGenre.setBounds(190, 450, 150, 20);

        lblHarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHarga.setText("17000");
        jPanel1.add(lblHarga);
        lblHarga.setBounds(590, 447, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/beliMusik.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 930, 590);

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

    private void txtJumlahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtJumlahStateChanged
        //total harga 
        int spinner = 17000;
        Integer spinner2 = (Integer) txtJumlah.getValue();
        int hasil = spinner * spinner2;
        lblHarga.setText(String.valueOf(hasil));
        
    }//GEN-LAST:event_txtJumlahStateChanged

    private void tombolBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolBeliMouseClicked
        itemHiphop = lblGenre.getText();
        qtyHiphop = (Integer) txtJumlah.getValue();
        hargaHiphop = lblHarga.getText();
        dataPembelipop dp = new dataPembelipop(itemHiphop, qtyHiphop, hargaHiphop);
        
        
        dp.setVisible(true);
        dispose();
    }//GEN-LAST:event_tombolBeliMouseClicked

    private void tombolKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKembaliMouseClicked
        new MenuUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliMouseClicked

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
            java.util.logging.Logger.getLogger(hiphop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hiphop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hiphop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hiphop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hiphop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel tombolBeli;
    private javax.swing.JLabel tombolKembali;
    private javax.swing.JSpinner txtJumlah;
    // End of variables declaration//GEN-END:variables
}
