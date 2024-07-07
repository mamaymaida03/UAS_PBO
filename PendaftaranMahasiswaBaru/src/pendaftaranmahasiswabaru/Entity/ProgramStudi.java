/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendaftaranmahasiswabaru.Entity;

/**
 *
 * @author acer
 */
public class ProgramStudi {
    private String id_prodi;
    private String nama_prodi;
    private String fakultas;
    private int kuota;

    public ProgramStudi() {
    }

    public ProgramStudi(String id_prodi, String nama_prodi, String fakultas, int kuota) {
        this.id_prodi = id_prodi;
        this.nama_prodi = nama_prodi;
        this.fakultas = fakultas;
        this.kuota = kuota;
    }

    public String getId_prodi() {
        return id_prodi;
    }

    public void setId_prodi(String id_prodi) {
        this.id_prodi = id_prodi;
    }

    public String getNama_prodi() {
        return nama_prodi;
    }

    public void setNama_prodi(String nama_prodi) {
        this.nama_prodi = nama_prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    @Override
    public String toString() {
        return "program_studi{" + "id_prodi=" + id_prodi + ", nama_prodi=" + nama_prodi + ", fakultas=" + fakultas + ", kuota=" + kuota + '}';
    }
    
    
}

