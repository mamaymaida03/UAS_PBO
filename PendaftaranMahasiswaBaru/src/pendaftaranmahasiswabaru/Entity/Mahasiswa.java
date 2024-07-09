/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendaftaranmahasiswabaru.Entity;

import java.util.Date;

/**
 *
 * @author SUMARWAN
 */
public class Mahasiswa {
    private String nim;
    private String nama_lengkap;
    private Pendaftaran pendaftaran;
    private String tempat_lahir;
    private Date tanggal_lahir;
    private String jenis_kelamin;
    private String alamat;
    private String no_telepon;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama_lengkap, Pendaftaran pendaftaran, String tempat_lahir, Date tanggal_lahir, String jenis_kelamin, String alamat, String no_telepon) {
        this.nim = nim;
        this.nama_lengkap = nama_lengkap;
        this.pendaftaran = pendaftaran;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.no_telepon = no_telepon;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public void setPendaftaran( Pendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama_lengkap=" + nama_lengkap + ", pendaftaran=" + pendaftaran + ", tempat_lahir=" + tempat_lahir + ", tanggal_lahir=" + tanggal_lahir + ", jenis_kelamin=" + jenis_kelamin + ", alamat=" + alamat + ", no_telepons=" + no_telepon + '}';
    }
     
}



