# PBO Manajemen Kepengurusan Masjid (Minpro 2)
Program ini di rancang bertujuan untuk mempermudah proses pengelolaan manajemen kepengurusan di sebuah masjid. Di dalam program ini terdapat operasi CRUD (Create, Read, Update, Delete) yang akan membantu pengelolaan data kepengurusan.
## Fitur Program
-  Tambah Pengurus: Menambahkan pengurus baru ke dalam kepengurusan masjid.
-  Lihat Pengurus: Menampilkan daftar kepengurusan masjid yang tersedia.
-  Update Pengurus: Mengubah nomor hp dari pengurus.
-  Keluar: Menyelesaikan/menghentikan program.
## Struktur Program
Pada program ini, terbagi menjadi dua package (masjid dan main) pada bagian package main terdapat satu class yaitu (main), kemudian pada bagian package masjid terdapat lima class yaitu (Ketua, Bendahara, Pengurus,ManajemenPengurus,CRUDpengurus), Berikut adalah struktur folder dari proyek ini:

-  main   > main.java

-  masjid > Ketua.java
  
          > Bendahara.java
   
          > Pengurus.java
   
          > ManajemenPengurus.java
   
          > CRUDpengurus.java
## Alur Program
1. Program akan menampilkan menu utama kepada pengguna, yang berisi pilihan untuk menambah, melihat, memperbarui, menghapus, atau keluar dari program.
2. Pengguna memilih salah satu opsi.
3. Berdasarkan pilihan pengguna:
`  Jika menambah pengurus, penggunaakan diminta untuk memasukkan nama, jabatan, dan nomor telepon pengurus.
`  Jika melihat daftar pengurus, program akan menampilkan daftar pengurus yang tersimpan di ArrayList.
`  Jika mengupdate pengurus, pengguna diminta memasukkan nama pengurus yang ingin diubah, lalu diminta data baru untuk diperbarui.
`  Jika menghapus pengurus, pengguna diminta memasukkan nama pengurus yang ingin dihapus. Setelah setiap operasi, program akan kembali ke menu utama hingga pengguna memilih untuk keluar.




  
