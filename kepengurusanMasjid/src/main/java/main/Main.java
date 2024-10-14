/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import masjid.ManajemenPengurus;
import java.util.Scanner;

/**
 *
 * @author Asus
 */

public class Main {
    public static void main(String[] args) {
        ManajemenPengurus manajemen = new ManajemenPengurus();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Menu Manajemen Pengurus Masjid ===");
            System.out.println("1. Tambah pengurus");
            System.out.println("2. Lihat pengurus");
            System.out.println("3. Update pengurus");
            System.out.println("4. Hapus pengurus");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    manajemen.tambahPengurus();
                    break;
                case 2:
                    manajemen.lihatPengurus();
                    break;
                case 3:
                    manajemen.updatePengurus();
                    break;
                case 4:
                    manajemen.hapusPengurus();
                    break;
                case 5:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
