package data;

public class Kendaraan {

    private final int idKendaraan;
    private String namaKendaraan;
    private String merek;
    private int tahun;
    private String kondisi;

    public Kendaraan(int idKendaraan, String namaKendaraan, String merek, int tahun, String kondisi) {
        this.idKendaraan = idKendaraan;
        setNamaKendaraan(namaKendaraan);
        setMerek(merek);
        setTahun(tahun);
        setKondisi(kondisi);
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getMerek() {
        return merek;
    }

    public int getTahun() {
        return tahun;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void tampilkanInfo() {
        System.out.println(">> ID Kendaraan : " + idKendaraan);
        System.out.println(">> Nama         : " + namaKendaraan);
        System.out.println(">> Merek        : " + merek);
        System.out.println(">> Tahun        : " + tahun);
        System.out.println(">> Kondisi      : " + kondisi);
    }

    public final void cetakKategori() {
        System.out.println(">> Kategori: Kendaraan Terdaftar");
    }
}
