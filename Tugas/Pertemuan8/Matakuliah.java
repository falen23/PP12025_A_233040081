package Pertemuan8;

public class Matakuliah {
    private String Kode;
    public String Nama;
    private int Sks;

    public Matakuliah(String Kode, String Nama, int Sks){
        super();
        this.Kode = Kode;
        this.Nama = Nama;
        this.Sks = Sks;
    }

    public String getKode() {
        return Kode;
    }
    public void setKode(String Kode) {
        this.Kode = Kode;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public int getSks() {
        return Sks;
    }
    public void setSks(int Sks) {
        this.Sks = Sks;
    }
}
