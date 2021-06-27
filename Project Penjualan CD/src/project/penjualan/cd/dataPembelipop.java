package project.penjualan.cd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Percobaan Proyek Kelompok1
 */
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.UUID;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;


    public class dataPembelipop extends javax.swing.JFrame {
    private boolean databaru;
    private final Koneksi koneksi = new Koneksi();
    private DefaultTableModel tabmode;
    
    String item;
    int qty;
    String harga;
    
    
    public dataPembelipop(String item,int qty, String harga){
    initComponents();
    pop1.setText (item);
    qty1.setText(String.valueOf(qty));
    harga1.setText (harga);
    getData();
    databaru = true; 
}

    
    private dataPembelipop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    dataPembelipop(String item) {
         //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tombolSimpan = new javax.swing.JLabel();
        tombolEdit = new javax.swing.JLabel();
        tombolReset = new javax.swing.JLabel();
        tombolHapus1 = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtPekerjaan = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelData = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        pop1 = new javax.swing.JLabel();
        harga1 = new javax.swing.JLabel();
        qty1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        txtCari.setBackground(new java.awt.Color(11, 11, 37));
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
        txtCari.setBorder(null);
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });
        jPanel2.add(txtCari);
        txtCari.setBounds(510, 270, 350, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah       :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(500, 170, 100, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Item :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(500, 140, 100, 14);

        tombolSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolSimpanMouseClicked(evt);
            }
        });
        jPanel2.add(tombolSimpan);
        tombolSimpan.setBounds(50, 520, 100, 30);

        tombolEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolEditMouseClicked(evt);
            }
        });
        jPanel2.add(tombolEdit);
        tombolEdit.setBounds(160, 520, 100, 30);

        tombolReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolResetMouseClicked(evt);
            }
        });
        jPanel2.add(tombolReset);
        tombolReset.setBounds(370, 520, 100, 30);

        tombolHapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolHapus1MouseClicked(evt);
            }
        });
        jPanel2.add(tombolHapus1);
        tombolHapus1.setBounds(270, 520, 90, 30);

        tombolKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKembaliMouseClicked(evt);
            }
        });
        jPanel2.add(tombolKembali);
        tombolKembali.setBounds(770, 520, 100, 30);

        jLabel7.setText("Alamat");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(78, 410, 116, 14);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("PEMBELI POP");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(157, 26, 244, 47);

        txtNama.setBackground(new java.awt.Color(13, 34, 55));
        txtNama.setForeground(new java.awt.Color(255, 255, 255));
        txtNama.setBorder(null);
        jPanel2.add(txtNama);
        txtNama.setBounds(60, 210, 310, 20);

        txtPekerjaan.setBackground(new java.awt.Color(13, 34, 55));
        txtPekerjaan.setForeground(new java.awt.Color(255, 255, 255));
        txtPekerjaan.setBorder(null);
        jPanel2.add(txtPekerjaan);
        txtPekerjaan.setBounds(60, 270, 310, 20);

        txtKode.setBackground(new java.awt.Color(13, 34, 55));
        txtKode.setForeground(new java.awt.Color(255, 255, 255));
        txtKode.setBorder(null);
        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        jPanel2.add(txtKode);
        txtKode.setBounds(60, 150, 310, 20);

        txtNoTelp.setBackground(new java.awt.Color(13, 34, 55));
        txtNoTelp.setForeground(new java.awt.Color(255, 255, 255));
        txtNoTelp.setBorder(null);
        jPanel2.add(txtNoTelp);
        txtNoTelp.setBounds(60, 420, 310, 30);

        TabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Pembeli", "Nama", "Pekerjaan", "Alamat", "No. Telepon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelData);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(470, 310, 400, 190);

        jLabel8.setText("No. Telepon");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(78, 450, 116, 14);

        txtAlamat.setBackground(new java.awt.Color(13, 34, 55));
        txtAlamat.setColumns(20);
        txtAlamat.setForeground(new java.awt.Color(255, 255, 255));
        txtAlamat.setRows(5);
        txtAlamat.setBorder(null);
        jScrollPane2.setViewportView(txtAlamat);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(50, 326, 330, 70);

        pop1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pop1.setForeground(new java.awt.Color(240, 240, 240));
        pop1.setText("METAL");
        jPanel2.add(pop1);
        pop1.setBounds(580, 140, 290, 14);

        harga1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        harga1.setForeground(new java.awt.Color(255, 255, 255));
        harga1.setText("HARGA");
        jPanel2.add(harga1);
        harga1.setBounds(760, 217, 215, 17);

        qty1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qty1.setForeground(new java.awt.Color(240, 240, 240));
        qty1.setText("JUMLAH");
        jPanel2.add(qty1);
        qty1.setBounds(580, 170, 280, 17);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuPembeli.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 930, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataMouseClicked
        //Untuk Edit Data
        
        try{
            databaru = false;
            int row = TabelData.getSelectedRow();
            String kodePembeli = TabelData.getModel().getValueAt(row,0).toString();
            
            
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("SELECT * FROM db_pembeli WHERE kodePembeli='" + kodePembeli + "'");
            
            if (sql.next()){
                txtKode.setText(sql.getString("kodePembeli"));
                txtNama.setText(sql.getString("nama"));
                txtPekerjaan.setText(sql.getString("pekerjaan"));
                txtAlamat.setText(sql.getString("alamat"));
                txtNoTelp.setText(sql.getString("noTelepon"));
            
            }
        } catch (SQLException ex){
            Logger.getLogger(dataPembelipop.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_TabelDataMouseClicked

    
    private void getData(){
        try {
            Connection conn =koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("SELECT * FROM db_pembeli");
            
            DefaultTableModel model = (DefaultTableModel) TabelData.getModel();
            
            model.setRowCount (0); //reset data table
            
            while (result.next()){
                String kode = result.getString ("kodePembeli");
                String nama = result.getString ("nama");
                String pekerjaan = result.getString ("pekerjaan");
                String alamat = result.getString ("alamat");
                String no = result.getString ("noTelepon");
                
               model.addRow(new Object []{kode, nama, pekerjaan, alamat, no});
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPembeli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed

    }//GEN-LAST:event_txtKodeActionPerformed

    private void tombolKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKembaliMouseClicked
        new MenuUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolKembaliMouseClicked

    private void tombolResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolResetMouseClicked
         //Tombol Reset
        
        databaru = true;
        txtKode.setText("");
        txtNama.setText("");
        txtPekerjaan.setText("");
        txtAlamat.setText("");
        txtNoTelp.setText("");
    }//GEN-LAST:event_tombolResetMouseClicked

    private void tombolEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolEditMouseClicked
          try {
                databaru = true;
                String sql = "UPDATE db_pembeli SET nama = '%s', pekerjaan = '%s', alamat = '%s', noTelepon = '%s' WHERE kodePembeli = '%s'";
                
                sql = String.format(
                        sql,
                        txtNama.getText(),
                        txtPekerjaan.getText(),
                        txtAlamat.getText(),
                        txtNoTelp.getText(), 
                        txtKode.getText()
                );
                
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement (sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Diubah");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Diubah" + ex);
            }
            getData();
            
    }//GEN-LAST:event_tombolEditMouseClicked

    private void tombolHapus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolHapus1MouseClicked
       try {
            String sql  = "DELETE FROM db_pembeli WHERE kodePembeli='" + txtKode.getText() + "'";
            
            Connection conn = koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            tombolResetMouseClicked(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Dihapus" + ex);
        }
        
        getData();
    }//GEN-LAST:event_tombolHapus1MouseClicked

    private void tombolSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolSimpanMouseClicked
         //Tombol Simpan
        
        
            try {
                databaru = true;
                String sql = "INSERT INTO db_pembeli VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";
                
                sql = String.format(
                        sql,
                        txtKode.getText(),
                        txtNama.getText(),
                        txtPekerjaan.getText(),
                        txtAlamat.getText(),
                        txtNoTelp.getText(),
                        pop1.getText(),
                        qty1.getText(),
                        harga1.getText()
                        
                );
                
                
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement (sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Disimpan" + ex);
            }
        getData ();
    }//GEN-LAST:event_tombolSimpanMouseClicked

    public void dataTable() {
        Object[] Baris = {"Kode Pembeli", "Nama", "Pekerjaan", "Alamat", "No Telepon"};
        tabmode = new DefaultTableModel(null, Baris);
        TabelData.setModel(tabmode);
        String sql = "select * from db_pembeli order by kodePembeli asc";
        try {
            Connection conn = koneksi.getKoneksi();
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String kodePembeli = hasil.getString("kodePembeli");
                String nama = hasil.getString("nama");
                String pekerjaan = hasil.getString("pekerjaan");
                String alamat = hasil.getString("alamat");
                String noTelepon = hasil.getString("noTelepon");
                String[] data = {kodePembeli, nama, pekerjaan, alamat, noTelepon};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }
    
    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
         String sqlPencarian = "select * from db_pembeli where kodePembeli like '%" + txtCari.getText() + "%' or "
        + "nama like '%" + txtCari.getText() + "%' or "
        + "pekerjaan like '%" + txtCari.getText() + "%' or "
        + "alamat like '%" + txtCari.getText() + "%' or "
        + "noTelepon like '%" + txtCari.getText() + "%'";
        pencarian(sqlPencarian);
    }//GEN-LAST:event_txtCariKeyTyped
    
    public void pencarian(String sql) {
        Object[] Baris = {"Kode Pembeli", "Nama", "Pekerjaan", "Alamat", "No Telepon"};
        tabmode = new DefaultTableModel(null, Baris);
        TabelData.setModel(tabmode);
        int brs = TabelData.getRowCount();
        for (int i = 0; 1 < brs; i++) {
            tabmode.removeRow(1);
        }
        try {
            Connection conn = koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            ResultSet hasil = stm.executeQuery(sql);
            while (hasil.next()) {
                String kodePembeli = hasil.getString("kodePembeli");
                String nama = hasil.getString("nama");
                String pekerjaan = hasil.getString("pekerjaan");
                String alamat = hasil.getString("alamat");
                String noTelepon = hasil.getString("noTelepon");
                String[] data = {kodePembeli, nama, pekerjaan, alamat, noTelepon};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
        
        
    }
    
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
            java.util.logging.Logger.getLogger(dataPembelipop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataPembelipop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataPembelipop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataPembelipop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataPembelipop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelData;
    private javax.swing.JLabel harga1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pop1;
    private javax.swing.JLabel qty1;
    private javax.swing.JLabel tombolEdit;
    private javax.swing.JLabel tombolHapus1;
    private javax.swing.JLabel tombolKembali;
    private javax.swing.JLabel tombolReset;
    private javax.swing.JLabel tombolSimpan;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JTextField txtPekerjaan;
    // End of variables declaration//GEN-END:variables

 
    }
