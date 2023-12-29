# README

## Deskripsi Proyek

Proyek ini merupakan aplikasi Java yang memiliki kelas utama. Saat proyek ini dibangun, IDE secara otomatis menyalin semua file JAR yang ada di classpath proyek ke folder dist/lib proyek. IDE juga menambahkan setiap file JAR ke elemen Class-Path dalam file manifest aplikasi JAR (MANIFEST.MF).

Untuk menjalankan proyek dari baris perintah, pergilah ke folder dist dan ketikkan perintah berikut:

```bash
java -jar "Hasbi.jar"
```

Untuk mendistribusikan proyek ini, zip folder dist (termasuk folder lib) dan distribusikan file ZIP tersebut.

## Catatan

- Jika dua file JAR di classpath proyek memiliki nama yang sama, hanya file JAR pertama yang disalin ke folder lib.
- Hanya file JAR yang disalin ke folder lib. Jika classpath mengandung jenis file atau folder lain, file (folder) tersebut tidak disalin.
- Jika sebuah pustaka di classpath proyek juga memiliki elemen Class-Path yang ditentukan dalam manifest, kontennya harus ada dalam jalur runtime proyek.
- Untuk menetapkan kelas utama dalam proyek Java standar, klik kanan pada node proyek di jendela Projects dan pilih Properties. Kemudian klik Run dan masukkan nama kelas di bidang Main Class. Atau, Anda dapat mengetik nama kelas secara manual dalam elemen Main-Class manifest.

## Cara Penggunaan

1. Unduh ZIP file proyek dari [releases](link_ke_releases).
2. Ekstrak ZIP file ke lokasi yang diinginkan.
3. Buka terminal atau command prompt.
4. Pindah ke folder dist dalam proyek.
5. Ketik perintah berikut untuk menjalankan aplikasi:

```bash
java -jar "Hasbi.jar"
```

## Kontribusi

Silakan merujuk ke [panduan kontribusi](CONTRIBUTING.md) jika Anda ingin berkontribusi pada proyek ini.

## Lisensi

Proyek ini dilisensikan di bawah [lisensi XYZ](LINK_LISENSI). Silakan lihat file [LISENSI.md](LISENSI.md) untuk informasi lebih lanjut.
