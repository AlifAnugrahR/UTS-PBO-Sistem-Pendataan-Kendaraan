# UTS PBO – Sistem Pendataan Kendaraan

**Nama:** Alif Anugrah Ramadhan

**NIM:** 2509116019

**Program Studi:** Sistem Informasi

**Universitas:** Universitas Mulawarman

**Kelas:** A 2025

**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

## Deskripsi Proyek

Sistem Pendataan Kendaraan merupakan program berbasis Java yang dibuat untuk memenuhi tugas Ujian Tengah Semester (UTS) Pemrograman Berorientasi Objek (PBO).

Program ini digunakan untuk melakukan pendataan dan pengelolaan informasi kendaraan. Pengguna dapat menambahkan, menampilkan, mengubah, dan menghapus data kendaraan.

Program menerapkan konsep dasar Object-Oriented Programming (OOP), seperti class, object, constructor, encapsulation, inheritance, polymorphism, condition, looping, dan ArrayList.

Jenis kendaraan yang dapat didata terdiri dari Mobil, Motor, dan Bus. Setiap jenis kendaraan memiliki atribut khusus sesuai dengan jenisnya.

## Tujuan Program

Program ini dibuat untuk:

* Menerapkan konsep dasar Pemrograman Berorientasi Objek menggunakan Java.
* Mengimplementasikan inheritance dan polymorphism.
* Menggunakan condition dan looping dalam alur program.
* Mengelola data kendaraan menggunakan ArrayList.
* Membuat sistem CRUD sederhana melalui input pengguna.

## Struktur Program

Program terdiri dari beberapa class yang memiliki fungsi berbeda:

* PendataanKendaraan sebagai class utama untuk menjalankan program.
* Kendaraan sebagai superclass yang menyimpan data umum kendaraan.
* Mobil, Motor, dan Bus sebagai subclass dari Kendaraan.
* KendaraanCRUD untuk mengatur proses tambah, tampil, update, dan hapus data.
* KendaraanCek untuk melakukan validasi input.
* MenuUtama untuk menampilkan menu program.

### Struktur Package

<img width="312" height="250" alt="image" src="https://github.com/user-attachments/assets/2cd0dd78-9140-4c76-9a5e-72d2241a4c19" />


## Konsep OOP yang Digunakan

### 1. Class dan Object

Class digunakan sebagai rancangan untuk membuat objek kendaraan.

Kendaraan menjadi class utama yang menyimpan data umum seperti ID, nama, merek, tahun, dan kondisi.

Objek kemudian dibuat berdasarkan class tersebut, seperti objek Mobil, Motor, dan Bus.

### 2. Constructor

Constructor digunakan untuk memberikan nilai awal pada objek ketika objek kendaraan dibuat.

Contoh:

```java
public Mobil(int idKendaraan, String namaKendaraan, String merek,
        int tahun, String kondisi, int jumlahPintu) {

    super(idKendaraan, namaKendaraan, merek, tahun, kondisi);
    this.jumlahPintu = jumlahPintu;
}
```

Constructor pada subclass menggunakan super untuk memanggil constructor dari superclass Kendaraan.

### 3. Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class Kendaraan menggunakan access modifier private.

Data kemudian diakses atau diubah menggunakan getter dan setter.

Contoh:

```java
private final int idKendaraan;
private String namaKendaraan;
private String merek;
private int tahun;
private String kondisi;

public String getNamaKendaraan() {
    return namaKendaraan;
}

public void setNamaKendaraan(String namaKendaraan) {
    this.namaKendaraan = namaKendaraan;
}
```

### 4. Inheritance

Inheritance digunakan dengan menjadikan Kendaraan sebagai superclass dan Mobil, Motor, serta Bus sebagai subclass.

Dengan inheritance, subclass dapat menggunakan atribut dan method yang dimiliki oleh superclass.

Contoh:

```java
public class Mobil extends Kendaraan {

    private int jumlahPintu;

    public Mobil(int idKendaraan, String namaKendaraan, String merek,
            int tahun, String kondisi, int jumlahPintu) {

        super(idKendaraan, namaKendaraan, merek, tahun, kondisi);
        this.jumlahPintu = jumlahPintu;
    }
}
```

Program memiliki tiga subclass, yaitu Mobil, Motor, dan Bus.

### 5. Polymorphism

Polymorphism diterapkan menggunakan method overriding pada method tampilkanInfo().

Setiap subclass memiliki implementasi tampilkanInfo() yang berbeda sesuai dengan jenis kendaraannya.

Contoh pada Mobil:

```java
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    super.cetakKategori();
    System.out.println(">> Jenis        : Mobil");
    System.out.println(">> Jumlah Pintu : " + jumlahPintu);
}
```

Polymorphism juga digunakan ketika seluruh data kendaraan ditampilkan:

```java
for (Kendaraan k : daftarKendaraan) {
    k.tampilkanInfo();
}
```

Walaupun data disimpan menggunakan tipe Kendaraan, method tampilkanInfo() yang dijalankan menyesuaikan dengan objek sebenarnya.

### 6. Condition

Condition digunakan untuk menentukan proses berdasarkan input dari pengguna.

Contohnya adalah pemilihan jenis kendaraan:

```java
if (jenis.equalsIgnoreCase("Mobil")) {
    int pintu = KendaraanCek.cekAngka(scan, "Masukkan jumlah pintu: ");
    daftarKendaraan.add(new Mobil(id, nama, merek, tahun, kondisi, pintu));

} else if (jenis.equalsIgnoreCase("Motor")) {
    int cc = KendaraanCek.cekAngka(scan, "Masukkan kapasitas mesin (cc): ");
    daftarKendaraan.add(new Motor(id, nama, merek, tahun, kondisi, cc));

} else {
    int kapasitas = KendaraanCek.cekAngka(scan, "Masukkan kapasitas penumpang: ");
    daftarKendaraan.add(new Bus(id, nama, merek, tahun, kondisi, kapasitas));
}
```

Condition juga digunakan untuk melakukan validasi kondisi dan jenis kendaraan.

### 7. Looping

Looping digunakan agar proses tertentu dapat dilakukan secara berulang.

Program menggunakan while untuk validasi input dan menjalankan menu sampai pengguna memilih Keluar.

Program juga menggunakan for dan for-each untuk mencari serta menampilkan data kendaraan.

Contoh:

```java
for (Kendaraan k : daftarKendaraan) {
    k.tampilkanInfo();
}
```

### 8. ArrayList

ArrayList digunakan untuk menyimpan data kendaraan yang dimasukkan ke dalam program.

Contoh:

```java
private ArrayList<Kendaraan> daftarKendaraan;
```

Dengan ArrayList, data kendaraan dapat ditambahkan dan dihapus selama program berjalan.

## Fitur Program

Program memiliki beberapa fitur utama:

### 1. Tambah Kendaraan

Pengguna dapat menambahkan data kendaraan baru dengan memasukkan:

* ID kendaraan
* Nama kendaraan
* Merek
* Tahun
* Kondisi
* Jenis kendaraan
* Data khusus sesuai jenis kendaraan

Jenis kendaraan yang tersedia:

* Mobil
* Motor
* Bus

### 2. Tampilkan Kendaraan

Menampilkan seluruh data kendaraan yang tersimpan di dalam ArrayList.

Setiap jenis kendaraan akan menampilkan informasi tambahan sesuai dengan class masing-masing.

### 3. Update Kendaraan

Pengguna dapat mencari kendaraan berdasarkan ID kemudian mengubah nama dan kondisi kendaraan.

### 4. Hapus Kendaraan

Pengguna dapat menghapus data kendaraan berdasarkan ID.

### 5. Validasi Input

Program memiliki validasi input untuk mencegah data yang tidak sesuai.

Validasi yang digunakan antara lain:

* ID harus berupa angka.
* Angka harus lebih dari 0.
* ID tidak boleh sama.
* Input teks tidak boleh kosong.
* Kondisi hanya dapat diisi Baik atau Rusak.
* Jenis kendaraan hanya dapat diisi Mobil, Motor, atau Bus.

## Menu Program

Menu utama program terdiri dari:

```text
===== MENU UTAMA =====
1. Tambah Kendaraan
2. Tampilkan Kendaraan
3. Update Kendaraan
4. Hapus Kendaraan
5. Keluar
```

Program akan terus menampilkan menu sampai pengguna memilih menu Keluar.

## Data Awal

Program memiliki beberapa data kendaraan awal sebagai contoh:

```java
daftarKendaraan.add(new Mobil(1, "Avanza", "Toyota", 2022, "Baik", 5));
daftarKendaraan.add(new Motor(2, "Vario", "Honda", 2023, "Baik", 150));
```

Data awal digunakan untuk menunjukkan bahwa program sudah memiliki data ketika pertama kali dijalankan.

## Alur Program

1. Program dijalankan melalui class PendataanKendaraan.
2. Sistem menampilkan menu utama.
3. Pengguna memilih menu berdasarkan nomor.
4. Sistem menjalankan proses sesuai pilihan.
5. Input pengguna akan divalidasi sebelum diproses.
6. Data kendaraan disimpan dalam ArrayList.
7. Setelah proses selesai, sistem kembali ke menu utama.
8. Program terus berjalan menggunakan looping.
9. Program berhenti ketika pengguna memilih menu Keluar.

## Contoh Proses Program

### Tambah Kendaraan

Pengguna memilih menu Tambah Kendaraan kemudian memasukkan data kendaraan.

Jika pengguna memilih Mobil, sistem akan meminta jumlah pintu.

Jika memilih Motor, sistem akan meminta kapasitas mesin.

Jika memilih Bus, sistem akan meminta kapasitas penumpang.

### Tampilkan Kendaraan

Sistem menampilkan seluruh kendaraan yang tersimpan.

Setiap objek menjalankan method tampilkanInfo() sesuai dengan class masing-masing.

Hal tersebut menunjukkan penerapan polymorphism.

### Update Kendaraan

Pengguna memasukkan ID kendaraan.

Jika ID ditemukan, pengguna dapat memasukkan nama dan kondisi baru.

Jika ID tidak ditemukan, sistem menampilkan pesan bahwa data tidak ditemukan.

### Hapus Kendaraan

Pengguna memasukkan ID kendaraan yang ingin dihapus.

Jika ID ditemukan, data akan dihapus dari ArrayList.

Jika ID tidak ditemukan, sistem menampilkan pesan bahwa data tidak ditemukan.

## Penjelasan Gambar

### 1. Proses Tambah Kendaraan

**Gambar:** Screenshot saat menambahkan data kendaraan.

**Penjelasan:**
Pengguna memasukkan data kendaraan baru sesuai dengan informasi yang diminta oleh sistem.

**Screenshot:**

<img width="490" height="198" alt="image" src="https://github.com/user-attachments/assets/07ecb1a3-a0b5-4d91-9765-3aac6ff1040f" />


### 2. Tampilan Menu Utama

**Gambar:** Screenshot menu utama program.

**Penjelasan:**
Menampilkan pilihan menu yang dapat digunakan pengguna untuk mengelola data kendaraan.

**Screenshot:**

<img width="363" height="198" alt="image" src="https://github.com/user-attachments/assets/a6e4b25c-7db8-4d75-be76-8bf79074e232" />


### 3. Tampilan Data Awal

**Gambar:** Screenshot data kendaraan awal.

**Penjelasan:**
Menampilkan data kendaraan yang sudah tersedia ketika program pertama kali dijalankan.

**Screenshot:**

<img width="310" height="422" alt="image" src="https://github.com/user-attachments/assets/27060bc9-b815-4a8d-9bea-3eec829c372a" />


### 4. Proses Tampilkan Kendaraan

**Gambar:** Screenshot daftar kendaraan.

**Penjelasan:**
Menampilkan seluruh data kendaraan yang tersimpan di dalam ArrayList.

**Screenshot:**

<img width="446" height="637" alt="image" src="https://github.com/user-attachments/assets/96b8581b-9f0b-4b88-8422-de9148fd3492" />


### 5. Proses Update Kendaraan

**Gambar:** Screenshot proses update kendaraan.

**Penjelasan:**
Pengguna memasukkan ID kendaraan kemudian mengubah nama dan kondisi kendaraan.

**Screenshot:**

<img width="393" height="117" alt="image" src="https://github.com/user-attachments/assets/8acf9f6c-7c3d-4a2c-b5cd-a0c7a6791d68" />


### 6. Proses Hapus Kendaraan

**Gambar:** Screenshot proses hapus kendaraan.

**Penjelasan:**
Pengguna memasukkan ID kendaraan yang ingin dihapus dan sistem menghapus data tersebut dari ArrayList.

**Screenshot:**

<img width="386" height="257" alt="image" src="https://github.com/user-attachments/assets/258fb017-61bd-4182-81ea-f2e1565ee0cb" />


### 7. Validasi Input

**Gambar:** Screenshot ketika pengguna memasukkan input yang tidak sesuai.

**Penjelasan:**
Sistem memberikan pesan peringatan dan meminta pengguna memasukkan data yang sesuai dengan ketentuan.

**Screenshot:**

<img width="590" height="357" alt="image" src="https://github.com/user-attachments/assets/0672a921-107f-449f-880f-42a65dacc8b5" />


### 8. Penerapan Polymorphism

**Gambar:** Screenshot hasil tampilan Mobil, Motor, dan Bus.

**Penjelasan:**
Setiap objek kendaraan menjalankan method tampilkanInfo() sesuai dengan class masing-masing. Hal ini menunjukkan penerapan polymorphism melalui method overriding.

**Screenshot:**

<img width="663" height="145" alt="image" src="https://github.com/user-attachments/assets/fbadccea-3af1-48f1-9f0e-44e397cda778" />


<img width="632" height="153" alt="image" src="https://github.com/user-attachments/assets/a9e2d76c-6e16-4212-a902-e22a144c606a" />


<img width="766" height="153" alt="image" src="https://github.com/user-attachments/assets/114ad62d-a76c-428b-aeed-8c5d4139e023" />


