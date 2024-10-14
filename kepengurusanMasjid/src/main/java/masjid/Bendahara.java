/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid;

/**
 *
 * @author Asus
 */

public class Bendahara extends Pengurus {

    public Bendahara(String nama, String nomorHp) {
        super(nama, "Bendahara", nomorHp);
    }
    
    @Override //fungsi Override ini sebagai pemberitahu bahwa metode digunakan kembali di class lain (tugasKhusus)
    public void tugasKhusus() {
        System.out.println(getNama() + " bertugas sebagai Bendahara untuk mengelola keuangan.");
    }
}
