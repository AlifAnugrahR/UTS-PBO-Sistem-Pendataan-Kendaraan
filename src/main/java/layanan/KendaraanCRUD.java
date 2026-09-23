package layanan;

import data.Bus;
import data.Kendaraan;
import data.Mobil;
import data.Motor;
import java.util.ArrayList;
import java.util.Scanner;

public class KendaraanCRUD {

    private ArrayList<Kendaraan> daftarKendaraan;

    public KendaraanCRUD() {
        daftarKendaraan = new ArrayList<>();

        daftarKendaraan.add(new Mobil(
                1, "Avanza", "Toyota", 2022, "Baik", 5
        ));

        daftarKendaraan.add(new Motor(
                2, "Vario", "Honda", 2023, "Baik", 150
        ));
    }

    private boolean idSudahAda(int id) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getIdKendaraan() == id) {
                return true;
            }
        }
        return false;
    }

    public void tambahKendaraan(Scanner scan) {

        int id = KendaraanCek.cekAngka(scan, "Masukkan ID kendaraan: ");

        while (idSudahAda(id)) {
            System.out.println(">> ID sudah dipakai, gunakan ID lain!");
            id = KendaraanCek.cekAngka(scan, "Masukkan ID kendaraan: ");
        }

        String nama = KendaraanCek.cekTeks(scan, "Masukkan nama kendaraan: ");
        String merek = KendaraanCek.cekTeks(scan, "Masukkan merek: ");
        int tahun = KendaraanCek.cekAngka(scan, "Masukkan tahun kendaraan: ");
        String kondisi = KendaraanCek.cekTeks(scan, "Masukkan kondisi (Baik/Rusak): ");

        while (!kondisi.equalsIgnoreCase("Baik") && !kondisi.equalsIgnoreCase("Rusak")) {
            System.out.println(">> Kondisi harus Baik atau Rusak!");
            kondisi = KendaraanCek.cekTeks(scan, "Masukkan kondisi (Baik/Rusak): ");
        }

        String jenis = KendaraanCek.cekTeks(scan, "Masukkan jenis kendaraan (Mobil/Motor/Bus): ");

        while (!jenis.equalsIgnoreCase("Mobil")
                && !jenis.equalsIgnoreCase("Motor")
                && !jenis.equalsIgnoreCase("Bus")) {
            System.out.println(">> Jenis harus Mobil, Motor, atau Bus!");
            jenis = KendaraanCek.cekTeks(scan, "Masukkan jenis kendaraan (Mobil/Motor/Bus): ");
        }

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

        System.out.println(">> Data kendaraan berhasil ditambahkan!");
    }

    public void tampilkanKendaraan() {

        if (daftarKendaraan.isEmpty()) {
            System.out.println(">> Data kendaraan masih kosong!");
            return;
        }

        System.out.println("\n>> ===== DAFTAR KENDARAAN =====");

        for (Kendaraan k : daftarKendaraan) {
            k.tampilkanInfo();
            System.out.println(">> -------------------------");
        }
    }

    public void updateKendaraan(Scanner scan) {

        int id = KendaraanCek.cekAngka(scan, "Masukkan ID kendaraan yang diupdate: ");

        for (Kendaraan k : daftarKendaraan) {

            if (k.getIdKendaraan() == id) {

                String nama = KendaraanCek.cekTeks(scan, "Masukkan nama baru: ");
                String kondisi = KendaraanCek.cekTeks(scan, "Masukkan kondisi baru (Baik/Rusak): ");

                while (!kondisi.equalsIgnoreCase("Baik") && !kondisi.equalsIgnoreCase("Rusak")) {
                    System.out.println(">> Kondisi harus Baik atau Rusak!");
                    kondisi = KendaraanCek.cekTeks(scan, "Masukkan kondisi baru (Baik/Rusak): ");
                }

                k.setNamaKendaraan(nama);
                k.setKondisi(kondisi);

                System.out.println(">> Data kendaraan berhasil diupdate!");
                return;
            }
        }

        System.out.println(">> ID kendaraan tidak ditemukan!");
    }

    public void hapusKendaraan(Scanner scan) {

        int id = KendaraanCek.cekAngka(scan, "Masukkan ID kendaraan yang dihapus: ");

        for (int i = 0; i < daftarKendaraan.size(); i++) {

            if (daftarKendaraan.get(i).getIdKendaraan() == id) {

                daftarKendaraan.remove(i);

                System.out.println(">> Data kendaraan berhasil dihapus!");
                return;
            }
        }

        System.out.println(">> ID kendaraan tidak ditemukan!");
    }
}