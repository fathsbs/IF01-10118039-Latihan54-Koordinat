/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yg menampilkan nama dan posisi koordnat    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class WarnaKoordinat extends Koordinat {

    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }

}
