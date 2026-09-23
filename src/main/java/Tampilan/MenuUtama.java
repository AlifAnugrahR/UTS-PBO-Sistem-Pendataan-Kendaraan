package Tampilan;

import layanan.KendaraanCRUD;
import java.util.Scanner;

public class MenuUtama {

    public static void tampilkan() {

        System.out.println("\n=======================================");
        System.out.println("SISTEM PENDATAAN KENDARAAN");
        System.out.println("=======================================");
        System.out.println("1. Tambah Kendaraan");
        System.out.println("2. Tampilkan Kendaraan");
        System.out.println("3. Update Kendaraan");
        System.out.println("4. Hapus Kendaraan");
        System.out.println("5. Keluar");
        System.out.println("=======================================");
        System.out.print("Pilih menu: ");
    }

    public static void jalankan(Scanner scan, KendaraanCRUD layanan) {

        while (true) {

            tampilkan();

            String pilihan = scan.nextLine();

            switch (pilihan) {

                case "1":
                    layanan.tambahKendaraan(scan);
                    break;

                case "2":
                    layanan.tampilkanKendaraan();
                    break;

                case "3":
                    layanan.updateKendaraan(scan);
                    break;

                case "4":
                    layanan.hapusKendaraan(scan);
                    break;

                case "5":
                    System.out.println(">> Program selesai. Sampai jumpa!");
                    return;

                default:
                    System.out.println(">> Menu tidak tersedia! Pilih 1 sampai 5.");
            }
        }
    }
}