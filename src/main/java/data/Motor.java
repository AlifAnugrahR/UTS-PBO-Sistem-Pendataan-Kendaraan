package data;

public class Motor extends Kendaraan {

    private int kapasitasMesin;

    public Motor(int idKendaraan, String namaKendaraan, String merek, int tahun, String kondisi, int kapasitasMesin) {
        super(idKendaraan, namaKendaraan, merek, tahun, kondisi);
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        super.cetakKategori();
        System.out.println(">> Jenis        : Motor");
        System.out.println(">> Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}