package layanan;

import java.util.Scanner;

public class KendaraanCek {

    public static int cekAngka(Scanner scan, String pesan) {
        while (true) {
            try {
                System.out.print(">> " + pesan);
                int angka = Integer.parseInt(scan.nextLine());

                if (angka > 0) {
                    return angka;
                }

                System.out.println(">> Angka harus lebih dari 0!");
            } catch (NumberFormatException e) {
                System.out.println(">> Input harus berupa angka!");
            }
        }
    }

    public static String cekTeks(Scanner scan, String pesan) {
        while (true) {
            System.out.print(">> " + pesan);
            String data = scan.nextLine().trim();

            if (!data.isEmpty()) {
                return data;
            }

            System.out.println(">> Input tidak boleh kosong!");
        }
    }
}