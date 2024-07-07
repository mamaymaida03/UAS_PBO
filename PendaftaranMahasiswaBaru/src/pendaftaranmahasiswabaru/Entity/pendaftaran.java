/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendaftaranmahasiswabaru.Entity;

import java.util.Date;

/**
 *
 * @author acer
 */
public class Pendaftaran {
    private Siswa siswa;
    private String id_pendaftaran;
    private Date tanggal_daftar;
    private String status_pendaftaran;
    private ProgramStudi prodi;

    public Pendaftaran() {
    }

    public Pendaftaran(Siswa siswa, String id_pendaftaran, String status_pendaftaran, ProgramStudi prodi) {
        this.siswa = siswa;
        this.id_pendaftaran = id_pendaftaran;
        this.tanggal_daftar = new Date();
        this.status_pendaftaran = status_pendaftaran;
        this.prodi = prodi;
    }

    public Siswa get_siswa() {
        return siswa;
    }

    public void set_siswa(Siswa siswa) {
        this.siswa = siswa;
    }

    public String getId_pendaftaran() {
        return id_pendaftaran;
    }

    public void setId_pendaftaran(String id_pendaftaran) {
        this.id_pendaftaran = id_pendaftaran;
    }

    public Date getTanggal_daftar() {
        return tanggal_daftar;
    }

    public void setTanggal_daftar(Date tanggal_daftar) {
        this.tanggal_daftar = tanggal_daftar;
    }

    public String getStatus_pendaftaran() {
        return status_pendaftaran;
    }

    public void setStatus_pendaftaran(String status_pendaftaran) {
        this.status_pendaftaran = status_pendaftaran;
    }

    public ProgramStudi getProdi() {
        return prodi;
    }

    public void setProdi(ProgramStudi prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "pendaftaran{" + "siswa=" + siswa + ", id_pendaftaran=" + id_pendaftaran + ", tanggal_daftar=" + tanggal_daftar + ", status_pendaftaran=" + status_pendaftaran + ", prodi=" + prodi + '}';
    }

   
    
    
    
}
