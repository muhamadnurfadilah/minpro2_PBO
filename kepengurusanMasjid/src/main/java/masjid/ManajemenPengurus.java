/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */

// final untuk class ManajemenPengurus yang dimana  bahwa class tersebut tidak dapat menjadi superclass
public final class ManajemenPengurus implements CRUDPengurus {
    private ArrayList<Pengurus> listPengurus = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahPengurus() {
        System.out.print("Masukkan Nama pengurus: ");
        String nama = scanner.nextLine();

        System.out.println("Pilih Jabatan: ");
        System.out.println("1. Ketua");
        System.out.println("2. Bendahara");
        System.out.print("Masukkan pilihan jabatan (1.Ketua/2.Bendahara): ");
        int pilihanJabatan = scanner.nextInt();
        scanner.nextLine();

        Pengurus pengurusBaru;
        if (pilihanJabatan == 1) {
            pengurusBaru = new Ketua(nama, null);
        } else if (pilihanJabatan == 2) {
            pengurusBaru = new Bendahara(nama, null);
        } else {
            System.out.println("Pilihan jabatan tidak valid.");
            return;
        }

        System.out.print("Masukkan Nomor HP: ");
        String nomorHp = scanner.nextLine();
        pengurusBaru.setNomorHp(nomorHp);

        listPengurus.add(pengurusBaru);
        System.out.println("Pengurus berhasil ditambahkan!\n");
    }

    public void lihatPengurus() {
        if (listPengurus.isEmpty()) {
            System.out.println("Tidak ada pengurus terdaftar.\n");
        } else {
            System.out.println("=== Daftar Pengurus ===");
            for (Pengurus pengurus : listPengurus) {
                System.out.println("Nama: " + pengurus.getNama());
                System.out.println("Jabatan: " + pengurus.getJabatan());
                System.out.println("Nomor HP: " + pengurus.getNomorHp());
                pengurus.tugasKhusus();
                System.out.println();
            }
        }
    }

    public void updatePengurus() {
        System.out.print("Masukkan nama pengurus yang ingin diperbarui: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (Pengurus pengurus : listPengurus) {
            if (pengurus.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan Jabatan baru (1: Ketua, 2: Bendahara): ");
                int pilihanJabatan = scanner.nextInt();
                scanner.nextLine();

                String jabatanBaru = (pilihanJabatan == 1) ? "Ketua" : "Bendahara";
                System.out.print("Masukkan Nomor HP baru: ");
                String nomorHpBaru = scanner.nextLine();

                //pengurus.setJabatan(jabatanBaru);
                pengurus.setNomorHp(nomorHpBaru);
                System.out.println("Data pengurus berhasil diperbarui!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Pengurus dengan nama tersebut tidak ditemukan.\n");
        }
    }

    public void hapusPengurus() {
        System.out.print("Masukkan nama pengurus yang ingin dihapus: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (Pengurus pengurus : listPengurus) {
            if (pengurus.getNama().equalsIgnoreCase(nama)) {
                listPengurus.remove(pengurus);
                System.out.println("Pengurus berhasil dihapus!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Pengurus dengan nama tersebut tidak ditemukan.\n");
        }
    }
}

