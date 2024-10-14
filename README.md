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
    -  Jika menambah pengurus, penggunaakan diminta untuk memasukkan nama, jabatan, dan nomor telepon pengurus.
    -  Jika melihat daftar pengurus, program akan menampilkan daftar pengurus yang tersimpan di ArrayList.
    -  Jika mengupdate pengurus, pengguna diminta memasukkan nama pengurus yang ingin diubah, lalu diminta data baru untuk diperbarui.
    -  Jika menghapus pengurus, pengguna diminta memasukkan nama pengurus yang ingin dihapus. Setelah setiap operasi, program akan kembali ke menu utama hingga pengguna memilih untuk keluar.
## Algoritma dari output program

![image](https://github.com/user-attachments/assets/e208e498-1e05-4d4f-aa01-22e16d9dfc4b)

Pada gambar diatas ini merupakan tampilan awal menu program

![image](https://github.com/user-attachments/assets/cbfa0966-b391-4ef1-a9b0-225ecccde51a)

Pada gambar diatas ini merupakan tampilan ketika memilih opsi (1.Tambah pengurus) pada menu, akan menginputkan dan memilih properti yaitu (Nama, Jabatan, Nomor HP)

![image](https://github.com/user-attachments/assets/36690c4d-4ba5-4a35-a22b-cded2a908b83)

Pada gambar diatas ini merupakan tampilan ketika memilih opsi (2.Lihat pengurus) pada menu, akan menampilkan daftar kepengurusan yang berisikan properti kepengurusan dan juga akan menjelaskan tugas dari dari pengurus tersebut.

![image](https://github.com/user-attachments/assets/894b49e9-ecb2-4db0-bc69-9094c76b3089)

Pada gambar diatas ini merupakan tampilan ketika memilih opsi (3.Update Pengurus) pada menu, akan mengubah data kepengurusan, tetapi dikarenakan disini properti (Nama, Jabatan) sudah di atur menjadi final properti , maka Nama dan Jabatan dari properti tersebut tidak berubah, yang berubah hanya Nomor HP dari pengurus tersebut seperti contoh di bawah ini :

Sebelum dirubah
![image](https://github.com/user-attachments/assets/7121828d-701e-435e-9321-545ffb8a8e5c)

Sesudah dirubah
![image](https://github.com/user-attachments/assets/d3c72f1f-9891-4410-85ac-c14aac0f7301)

![image](https://github.com/user-attachments/assets/671a6c0e-df4f-4c08-ba46-9b353347244d)

Pada Gambar di atas merupakan tampilan ketika memilih opsi (4.Hapus pengurus) pada menu, akan menghapus data kepengurusan.

![image](https://github.com/user-attachments/assets/f0415d80-d2bd-4484-87a2-031f7692b70d)

Pada Gambar di atas merupakan tampilan ketika memilih opsi (5.Keluar) pada menu, program akan selesai/keluar dari sistem.














  
