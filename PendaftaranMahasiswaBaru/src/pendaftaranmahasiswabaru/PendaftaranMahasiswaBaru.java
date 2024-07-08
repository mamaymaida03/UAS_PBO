/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pendaftaranmahasiswabaru;

import java.awt.EventQueue;
import java.util.ArrayList;
import pendaftaranmahasiswabaru.Entity.Siswa;
import pendaftaranmahasiswabaru.koneksi.Data;
import java.util.List;
import pendaftaranmahasiswabaru.UI.Menu;
/**
 *
 * @author acer
 */
public class PendaftaranMahasiswaBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu window = new Menu();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        List<Siswa> s = new ArrayList<Siswa>();
        s = Data.getSiswa();
        s.forEach(e-> System.out.println(e.toString()));
    }
    
}
