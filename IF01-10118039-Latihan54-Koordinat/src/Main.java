/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yg menampilkan nama dan posisi koordnat  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.printf("Warna Koordinat : %s%n", wk.namaWarna);
        System.out.printf("Koordinat sumbu x : %d, y : %d%n", wk.getX(), wk.getY());

    }

}
