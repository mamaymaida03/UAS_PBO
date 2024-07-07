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
public class Siswa {
    private String id_Siswa;
    private String nama_Lengkap;
    private String tempat_Lahir;
    private Date tanggal_Lahir;
    private String jenis_Kelamin;
    private String alamat;
    private String asal_Sekolah;
    private String jurusan_Sekolah;
    private float nilai_UN;
    private float nilai_Raport;

    public Siswa() {
    }

    public Siswa(String id_Siswa, String nama_Lengkap, String tempat_Lahir, Date tanggal_Lahir, String jenis_Kelamin, String alamat, String asal_Sekolah, String jurusan_Sekolah, float nilai_UN, float nilai_Raport) {
        this.id_Siswa = id_Siswa;
        this.nama_Lengkap = nama_Lengkap;
        this.tempat_Lahir = tempat_Lahir;
        this.tanggal_Lahir = tanggal_Lahir;
        this.jenis_Kelamin = jenis_Kelamin;
        this.alamat = alamat;
        this.asal_Sekolah = asal_Sekolah;
        this.jurusan_Sekolah = jurusan_Sekolah;
        this.nilai_UN = nilai_UN;
        this.nilai_Raport = nilai_Raport;
    }

    public String getId_Siswa() {
        return id_Siswa;
    }

    public void setId_Siswa(String id_Siswa) {
        this.id_Siswa = id_Siswa;
    }

    public String getNama_Lengkap() {
        return nama_Lengkap;
    }

    public void setNama_Lengkap(String nama_Lengkap) {
        this.nama_Lengkap = nama_Lengkap;
    }

    public String getTempat_Lahir() {
        return tempat_Lahir;
    }

    public void setTempat_Lahir(String tempat_Lahir) {
        this.tempat_Lahir = tempat_Lahir;
    }

    public Date getTanggal_Lahir() {
        return tanggal_Lahir;
    }

    public void setTanggal_Lahir(Date tanggal_Lahir) {
        this.tanggal_Lahir = tanggal_Lahir;
    }

    public String getJenis_Kelamin() {
        return jenis_Kelamin;
    }

    public void setJenis_Kelamin(String jenis_Kelamin) {
        this.jenis_Kelamin = jenis_Kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsal_Sekolah() {
        return asal_Sekolah;
    }

    public void setAsal_Sekolah(String asal_Sekolah) {
        this.asal_Sekolah = asal_Sekolah;
    }

    public String getJurusan_Sekolah() {
        return jurusan_Sekolah;
    }

    public void setJurusan_Sekolah(String jurusan_Sekolah) {
        this.jurusan_Sekolah = jurusan_Sekolah;
    }

    public float getNilai_UN() {
        return nilai_UN;
    }

    public void setNilai_UN(float nilai_UN) {
        this.nilai_UN = nilai_UN;
    }

    public float getNilai_Raport() {
        return nilai_Raport;
    }

    public void setNilai_Raport(float nilai_Raport) {
        this.nilai_Raport = nilai_Raport;
    }
    
}
