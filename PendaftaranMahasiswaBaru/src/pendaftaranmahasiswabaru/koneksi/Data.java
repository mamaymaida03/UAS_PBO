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
import java.util.Date;

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
    
    
    public static void addSiswa( String nisn,String nama, String tempat_lahir, java.sql.Date tanggal_lahir, String jenis_kelamin, String alamat, String asal_sekolah, String jurusan_sekolah, float nilai_un, float nilai_raport){
        try{
            Connection c = StartConnection.getConn();
            String sql="INSERT INTO `siswa`(`id_siswa`, `nama_lengkap`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `alamat`, `asal_sekolah`, `jurusan_sekolah`, `nilai_un`, `nilai_raport`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nisn);
            ps.setString(2, nama);
            ps.setString(3, tempat_lahir);
            ps.setDate(4, tanggal_lahir);
            ps.setString(5, jenis_kelamin);
            ps.setString(6, alamat);
            ps.setString(7, asal_sekolah);
            ps.setString(8, jurusan_sekolah);
            ps.setFloat(9, nilai_un);
            ps.setFloat(10, nilai_raport);
            ps.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    public static void addProdi( String id_prodi,String nama_prodi, String fakultas,int kuota){
        try{
            Connection c = StartConnection.getConn();
            String sql="INSERT INTO `program_studi`(`id_prodi`, `nama_prodi`, `fakultas`, `kuota`) VALUES (?,?,?,?) ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, id_prodi);
            ps.setString(2, nama_prodi);
            ps.setString(3, fakultas);
            ps.setInt(4, kuota);
            ps.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    public static void addPendaftarn( String nisn,String id_prodi, String id_pendaftaran){
        try{
            long waktudlmmilisec = System.currentTimeMillis();
            Date now = new Date(waktudlmmilisec);
            java.sql.Date sqlnow = new java.sql.Date(now.getTime());
            Connection c = StartConnection.getConn();
            String sql="INSERT INTO `pendaftaran`(`id_pendaftaran`, `id_siswa`, `tanggal_daftar`, `status_pendaftaran`, `id_prodi`) VALUES (?,?,?,?,?) ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, id_pendaftaran);
            ps.setString(2, nisn);
            ps.setDate(3, sqlnow);
            ps.setString(4, "Terdaftar");
            ps.setString(5, id_prodi);
            ps.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    public static void UpdatePendaftaran( String status, String id_pendaftaran){
        try{
            Connection c = StartConnection.getConn();
            String sql="UPDATE `pendaftaran` SET `status_pendaftaran`= ? WHERE id_pendaftaran  = ? ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, status);
            ps.setString(2, id_pendaftaran);
            ps.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    public static void addMahasiswa(String id_pendaftaran){
        try{
            Connection c = StartConnection.getConn();
            String sqlpen="select * from pendaftaran where id_pendaftaran = ?";
            PreparedStatement psgetdata = c.prepareStatement(sqlpen);
            psgetdata.setString(1, id_pendaftaran);
            ResultSet rs = psgetdata.executeQuery();
            
            String sqlsis="select * from siswa where id_siswa = ?";
            PreparedStatement psgetsis = c.prepareStatement(sqlsis);
            String id_siswa = "";
            String id_prodi = "";
            while(rs.next()){
                id_siswa = rs.getString("id_siswa");
                id_prodi = rs.getString("id_prodi");
            }
            psgetsis.setString(1, id_siswa);
            ResultSet rssis = psgetsis.executeQuery();
            
            String sqlprod="select * from program_studi where id_prodi = ?";
            PreparedStatement psgetprod = c.prepareStatement(sqlprod);
            psgetprod.setString(1, id_prodi);
            ResultSet rsprod = psgetprod.executeQuery();
            
            String sql="INSERT INTO `mahasiswa`(`nim`, `nama_lengkap`, `id_pendaftaran`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `alamat`) VALUES (?,?,?,?,?,?,?) ";
            PreparedStatement ps = c.prepareStatement(sql);
            String NIM = id_prodi+"."+id_siswa;
            String Nama = "";
            String Tempat_lahir = "";
            java.sql.Date Tanggal_Lahir = new java.sql.Date(0);
            String Jenis_Kelamin = "";
            String Alamat = "";
            ps.setString(1, NIM);
            while(rssis.next()){
                Nama = rssis.getString("nama_lengkap");
                Tempat_lahir = rssis.getString("tempat_lahir");
                Tanggal_Lahir = rssis.getDate("tanggal_lahir");
                Jenis_Kelamin = rssis.getString("jenis_kelamin");
                Alamat = rssis.getString("alamat");
            }
            ps.setString(2, Nama);
            ps.setString(3, id_pendaftaran);
            ps.setString(4, Tempat_lahir);
            ps.setDate(5, Tanggal_Lahir);
            ps.setString(6, Jenis_Kelamin);
            ps.setString(7, Alamat);
            ps.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    public static void UpdateMahasiswa( String NIM,String Nama, String ID_Pendaftaran, String Tempat_Lahir, java.sql.Date Tanggal_Lahir, String Jenis_Kelamin, String Alamat, String No_Telepon){
        try{
//            long waktudlmmilisec = System.currentTimeMillis();
//            Date now = new Date(waktudlmmilisec);
//            java.sql.Date sqlnow = new java.sql.Date(now.getTime());
            Connection c = StartConnection.getConn();
            String sql="UPDATE `mahasiswa` SET `nama_lengkap`=?,`id_pendaftaran`=?,`tempat_lahir`=?,`tanggal_lahir`=?,`jenis_kelamin`=?,`alamat`=?,`no_telepon`=? WHERE nim = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Nama);
            ps.setString(2, ID_Pendaftaran);
            ps.setString(3, Tempat_Lahir);
            ps.setDate(4, Tanggal_Lahir);
            ps.setString(5, Jenis_Kelamin);
            ps.setString(6, Alamat);
            ps.setString(7, No_Telepon);
            ps.setString(8, NIM);
            ps.executeUpdate();
            }catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }
    
    
}
