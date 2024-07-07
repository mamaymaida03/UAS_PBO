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
    private String nama_lengkap;
    private String tempat_lahir;
    private Date tanggal_lahir;
    private String jenis_kelamin;
    private String alamat;
    private String asal_sekolah;
    private String jurusan_sekolah;
    private float nilai_un;
    private float nilai_raport;

    public Siswa() {
    }

    public Siswa(String id_Siswa, String nama_lengkap, String tempat_lahir, Date tanggal_lahir, String jenis_kelamin, String alamat, String asal_sekolah, String jurusan_sekolah, float nilai_un, float nilai_raport) {
        this.id_Siswa = id_Siswa;
        this.nama_lengkap = nama_lengkap;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.asal_sekolah = asal_sekolah;
        this.jurusan_sekolah = jurusan_sekolah;
        this.nilai_un = nilai_un;
        this.nilai_raport = nilai_raport;
    }

    public String getId_Siswa() {
        return id_Siswa;
    }

    public void setId_Siswa(String id_Siswa) {
        this.id_Siswa = id_Siswa;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
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

    public String getAsal_sekolah() {
        return asal_sekolah;
    }

    public void setAsal_sekolah(String asal_sekolah) {
        this.asal_sekolah = asal_sekolah;
    }

    public String getJurusan_sekolah() {
        return jurusan_sekolah;
    }

    public void setJurusan_sekolah(String jurusan_sekolah) {
        this.jurusan_sekolah = jurusan_sekolah;
    }

    public float getNilai_un() {
        return nilai_un;
    }

    public void setNilai_un(float nilai_un) {
        this.nilai_un = nilai_un;
    }

    public float getNilai_raport() {
        return nilai_raport;
    }

    public void setNilai_raport(float nilai_raport) {
        this.nilai_raport = nilai_raport;
    }

    @Override
    public String toString() {
        return "Siswa{" + "id_Siswa=" + id_Siswa + ", nama_lengkap=" + nama_lengkap + ", tempat_lahir=" + tempat_lahir + ", tanggal_lahir=" + tanggal_lahir + ", jenis_kelamin=" + jenis_kelamin + ", alamat=" + alamat + ", asal_sekolah=" + asal_sekolah + ", jurusan_sekolah=" + jurusan_sekolah + ", nilai_un=" + nilai_un + ", nilai_raport=" + nilai_raport + '}';
    }

    
}
