package data;

public class Mobil extends Kendaraan {

    private int jumlahPintu;

    public Mobil(int idKendaraan, String namaKendaraan, String merek, int tahun, String kondisi, int jumlahPintu) {
        super(idKendaraan, namaKendaraan, merek, tahun, kondisi);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        super.cetakKategori();
        System.out.println(">> Jenis        : Mobil");
        System.out.println(">> Jumlah Pintu : " + jumlahPintu);
    }
}