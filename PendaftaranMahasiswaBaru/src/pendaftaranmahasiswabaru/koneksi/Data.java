/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendaftaranmahasiswabaru.koneksi;
import java.util.ArrayList;
import pendaftaranmahasiswabaru.Entity.*;
import java.util.logging.Logger;
import java.util.logging.Level;

import java.sql.*;
import java.util.List;

/**
 *
 * @author acer
 */
public class Data {
    public static List<Siswa> getSiswa(){
        List<Siswa> ListSiswa = new ArrayList<>();
        try{
            Connection c = StartConnection.getConn();
            String sql="select * from siswa";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Siswa s = new Siswa(rs.getString("id_siswa"), rs.getString("nama_lengkap"), rs.getString("tempat_lahir"),rs.getDate("tanggal_lahir"), rs.getString("jenis_kelamin"), rs.getString("alamat"), rs.getString("asal_sekolah"), rs.getString("jurusan_sekolah"), rs.getFloat("nilai_un"), rs.getFloat("nilai_raport"));
            ListSiswa.add(s);
            }
            return ListSiswa;
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            return null;
        }
    }
}
