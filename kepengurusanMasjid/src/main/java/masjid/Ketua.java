/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid;

/**
 *
 * @author Asus
 */

public class Ketua extends Pengurus {

    public Ketua(String nama, String nomorHp) {
        super(nama, "Ketua", nomorHp);
    }

    @Override
    public void tugasKhusus() {
        System.out.println(getNama() + " bertugas sebagai Ketua untuk memimpin kepengurusan.");
    }
}

