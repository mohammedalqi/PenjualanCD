/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.penjualan.cd;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Alqi
 */
public class Koneksi {
    public static Connection connect;
    
    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/dbpenjualan";
    private String username = "root";
    private String password = "";
    
    
    public Connection getKoneksi(){
        if (connect == null){
            try {
                Class.forName(driverName);
                System.out.println("Class driver ditemukan");
                
                connect = DriverManager.getConnection(url,username,password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return connect;
    }
    
    public static void main (String []args){
        Koneksi koneksi = new Koneksi ();
        
        koneksi.getKoneksi();
    }

    


}
