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
    public static List<ProgramStudi> getProgramStudi(){
        List<ProgramStudi> ListProgramStudi = new ArrayList<>();
        try{
            Connection c = StartConnection.getConn();
            String sql="select * from program_studi";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            ProgramStudi s = new ProgramStudi(rs.getString("id_prodi"),rs.getString("nama_prodi"),rs.getString("fakultas"),rs.getInt("kuota"));
            ListProgramStudi.add(s);
            }
            return ListProgramStudi;
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            return null;
        }
    }
    public static List<Pendaftaran> getPendaftaran(){
        List<Pendaftaran> ListPendaftaran = new ArrayList<>();
        try{
            Connection c = StartConnection.getConn();
            String sql="select * from pendaftaran as pen left join program_studi as pro on pen.id_prodi=pro.id_prodi left join siswa as sis on sis.id_siswa = pen.id_siswa";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Siswa sis = new Siswa(rs.getString("id_siswa"), rs.getString("nama_lengkap"), rs.getString("tempat_lahir"),rs.getDate("tanggal_lahir"), rs.getString("jenis_kelamin"), rs.getString("alamat"), rs.getString("asal_sekolah"), rs.getString("jurusan_sekolah"), rs.getFloat("nilai_un"), rs.getFloat("nilai_raport"));
            ProgramStudi p = new ProgramStudi(rs.getString("id_prodi"),rs.getString("nama_prodi"),rs.getString("fakultas"),rs.getInt("kuota"));
            Pendaftaran s = new Pendaftaran(sis,rs.getString("id_pendaftaran"),rs.getDate("tanggal_daftar"),rs.getString("status_pendaftaran"),p);
            ListPendaftaran.add(s);
            }
            return ListPendaftaran;
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            return null;
        }
    }
    
    public static List<Mahasiswa> getMahasiswa(){
        List<Mahasiswa> ListMahasiswa = new ArrayList<>();
        try{
            Connection c = StartConnection.getConn();
            String sql="select * from mahasiswa as mhs left join pendaftaran as pen on mhs.id_pendaftaran=pen.id_pendaftaran";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Pendaftaran p = new Pendaftaran();
            p.setId_pendaftaran(rs.getString("id_pendaftaran"));
            p.setStatus_pendaftaran(rs.getString("status_pendaftaran"));
            p.setTanggal_daftar(rs.getDate("tanggal_daftar"));
            Mahasiswa s = new Mahasiswa(rs.getString("nim"),rs.getString("nama_lengkap"),p,rs.getString("tempat_lahir"),rs.getDate("tanggal_lahir"),rs.getString("jenis_kelamin"),rs.getString("alamat"),rs.getString("no_telepon"));
            ListMahasiswa.add(s);
            }
            return ListMahasiswa;
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            return null;
        }
    }
}
