# HamdiProgramCouple (Simple RSA Encryption)

Program ini adalah alat enkripsi sederhana menggunakan algoritma RSA. Project ini dibuat sebagai pasangan (couple) dari repository [RSA Decryption Solver milik Hamdi](https://github.com/HamdiSALifi/RSA-Decryption-Solver).

##  Deskripsi Program

Program ini berfungsi mengubah teks biasa (Plaintext) menjadi sandi acak (Ciphertext). Sandi yang dihasilkan dirancang khusus untuk dipecahkan kembali oleh program milik Hamdi.

Alur Kerja:
1. Input: Menerima teks dari pengguna.
2. Filter: Menghapus simbol/spasi dan memastikan hanya huruf kapital (A-Z).
3. Proses: Mengubah huruf menjadi angka dan menghitung enkripsi dengan rumus C = M^7 mod 26.
4. Output: Menampilkan hasil enkripsi untuk digunakan pada tahap dekripsi.

##  Hubungan dengan Program Hamdi

Kedua program menggunakan parameter kunci yang sinkron (7), namun dengan fungsi yang berlawanan:

* Program Ini (Enkripsi): Bekerja maju untuk mengunci pesan asli menggunakan Public Key (e=7).
* Program Hamdi (Dekripsi): Bekerja mundur untuk membuka sandi kembali menjadi pesan asli menggunakan Private Key (d=7).

##  Cara Menjalankan

Langsung buka file HamdiProgramCouple.java di VSCode atau Eclipse, lalu tekan tombol Run.

##  Author

Abdul Karim
Mahasiswa Teknik Komputer
