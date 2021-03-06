/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.penjualan.cd;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Alqi
 */
public class Faktur extends javax.swing.JFrame {
    private final Koneksi koneksi = new Koneksi();

    /**
     * Creates new form Faktur
     */
    public Faktur() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        initComponents();
        listed();
        initComponents();
    }
    
    public void listed()
    {
        
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Kode Pembeli");
        table.addColumn("Nama Pembeli");
        table.addColumn("Item");
        table.addColumn("Qty");
        table.addColumn("Harga");
        
        
        try{
            Koneksi koneksi = new Koneksi ();
            Connection koneksi2 = koneksi.getKoneksi();
            String sql = ("SELECT db_pembeli.kodePembeli, db_pembeli.nama, db_pembeli.Item, db_pembeli.Qty, db_pembeli.Harga FROM db_pembeli");
            Statement S = koneksi2.createStatement();
            ResultSet r = S.executeQuery(sql);
            
            
            
            while (r.next ())
            {
                
                table.addRow(new Object[]{
                        r.getString(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        r.getString(5)
                                
                });    
                
            }
            
            jTable1.setModel(table);
            
        } catch (SQLException ex) {
            System.out.println("ERROR"+ex.getMessage());
        }
    }                                          

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCetak = new javax.swing.JLabel();
        btnKembali = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Pembeli", "Nama", "Item", "Qty", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 130, 790, 330);

        btnCetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCetakMouseClicked(evt);
            }
        });
        jPanel1.add(btnCetak);
        btnCetak.setBounds(680, 510, 100, 30);

        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        jPanel1.add(btnKembali);
        btnKembali.setBounds(790, 510, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/faktur.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 930, 580);

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

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        new MenuUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnCetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakMouseClicked
        MessageFormat judul = new MessageFormat("PENJUALAN CD KELOMPOK 1\n");
        MessageFormat footer = new MessageFormat("Data Penjualan CD KELOMPOK 1");
        
        try{
            
            jTable1.print(JTable.PrintMode.FIT_WIDTH, judul, footer);
        } catch (PrinterException ex) {
            ex.printStackTrace();}
    }//GEN-LAST:event_btnCetakMouseClicked

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
            java.util.logging.Logger.getLogger(Faktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faktur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCetak;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
