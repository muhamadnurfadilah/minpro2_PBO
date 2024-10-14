/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package masjid;

/**
 *
 * @author Asus
 */

//fungsi dari interface pada CRUDPengurus ialah untuk menjadi kontrak yang nanti akan di pakai di class lain
public interface CRUDPengurus {
    void tambahPengurus();
    void lihatPengurus();
    void updatePengurus();
    void hapusPengurus();
}

