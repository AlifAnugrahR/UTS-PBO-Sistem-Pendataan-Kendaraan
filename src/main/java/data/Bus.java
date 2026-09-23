package data;

public class Bus extends Kendaraan {

    private int kapasitasPenumpang;

    public Bus(int idKendaraan, String namaKendaraan, String merek, int tahun, String kondisi, int kapasitasPenumpang) {
        super(idKendaraan, namaKendaraan, merek, tahun, kondisi);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        super.cetakKategori();
        System.out.println(">> Jenis        : Bus");
        System.out.println(">> Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
    }
}