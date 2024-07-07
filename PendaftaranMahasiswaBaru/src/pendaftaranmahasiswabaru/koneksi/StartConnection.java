/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendaftaranmahasiswabaru.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class StartConnection {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/pendaftaran_mahasiswa_baru";
    static String USER = "root";
    static String PASS = "";
 
    public static Connection getConn() { 
        Connection conn=null;
        try{
           Class.forName(JDBC_DRIVER);
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
    
        }return conn;
    }

}
