/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini membuat koordinat sederhana pada java.
*/

// Mendefinisikan kelas Koordinat
class Koordinat {
	
	// Set property x, y ke protected
    protected int x;
    protected int y;
    
    // Konstruktor untuk inisialisasi objek Koordinat dengan nilai x dan y
    public Koordinat(int x, int y){
        
    }

    // Getter untuk nilai x
    public int getX() {
        return x;
    }

    // Setter untuk nilai x
    public void setX(int x) {
        this.x = x;
    }

    // Getter untuk nilai y
    public int getY() {
        return y;
    }

    // Setter untuk nilai y
    public void setY(int y) {
        this.y = y;
    }
}

// Mendefinisikan kelas WarnaKoordinat yang merupakan turunan dari Koordinat
class WarnaKoordinat extends Koordinat {
	
    // Set property string ke public
    public String namaWarna;

    // Konstruktor untuk inisialisasi objek WarnaKoordinat dengan nilai x, y, dan namaWarna
    public WarnaKoordinat(int x, int y, String namaWarna){
        // Memanggil konstruktor kelas induk (Koordinat)
        super(x, y);
    }

    // Getter untuk namaWarna
    public String getNamaWarna() {
        return namaWarna;
    }

    // Setter untuk namaWarna
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}

// Buat kelas Main
public class Main {

    // Buat method utama untuk menjalankan program
    public static void main(String[] args) {
        
        // Instansiasi objek WarnaKoordinat
        WarnaKoordinat wk = new WarnaKoordinat(0,0,"");
        
        // Mengatur namaWarna
        wk.setNamaWarna("Jingga");
        
        // Mengatur nilai x dan y
        wk.setX(10);
        wk.setY(4);
        
        // Menampilkan informasi Warna Koordinat
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " + wk.getY());

    }
}
