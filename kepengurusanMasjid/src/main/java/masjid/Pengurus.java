/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid;

/**
 *
 * @author Asus
 */

public abstract class Pengurus {
    private final String nama; //final dari properti nama yang tidak dapat diubah
    private final String jabatan; //final dari properti jabatan yang tidak dapat diubah
    private String nomorHp;

    public Pengurus(String nama, String jabatan, String nomorHp) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.nomorHp = nomorHp;
    }

    // Getter untuk final properti yaitu Nama dan Jabatan , yang tidak dapat di ubah
    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    // Getter dan setter untuk nomorHp yang dimana properti tersebut dapat diubah
    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    // Merupakan fungsi untuk memanggil tugas khusus dari masing masing class Ketua dan Bendahara   
    public abstract void tugasKhusus();
}
