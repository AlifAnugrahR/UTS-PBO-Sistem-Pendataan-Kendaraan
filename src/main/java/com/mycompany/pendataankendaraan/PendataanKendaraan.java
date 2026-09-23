package com.mycompany.pendataankendaraan;

import layanan.KendaraanCRUD;
import Tampilan.MenuUtama;
import java.util.Scanner;

public class PendataanKendaraan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        KendaraanCRUD layanan = new KendaraanCRUD();

        MenuUtama.jalankan(scan, layanan);

        scan.close();
    }
}