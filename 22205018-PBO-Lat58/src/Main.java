/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program tentang tambah kurang pada java.
*/

// Membuat kelas Bilangan
class Bilangan {
	
	// Buat property x, y 
   private int x;
   private int y;
   
   // Konstruktor untuk menginisialisasi nilai x dan y
   public Bilangan(){
	   
	   // Tampung nilai menggunakan this yang merujuk pada property x menjadi 3, dan y menjadi 4
       this.x = 3;
       this.y = 4;
   }

    // Getter untuk nilai x
    public int getX() {
        return x;
    }

    // Getter untuk nilai y
    public int getY() {
        return y;
    }
}

// Membuat kelas JumlahBilangan yang merupakan turunan dari Bilangan
class JumlahBilangan extends Bilangan{
	
    // Metode untuk menampilkan hasil penjumlahan x dan y
    public void tampilHasilJumlah(){
        System.out.println("Hasil Perjumlahan = " + (getX() + getY()));
    }
}

// Membuat kelas SelisihBilangan yang merupakan turunan dari Bilangan
class SelisihBilangan extends Bilangan {
	
    // Metode untuk menampilkan hasil selisih x dan y
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}

// Kelas Main sebagai kelas utama
public class Main {

	// Method main sebagai method utama untuk menjalankan program
    public static void main(String[] args) {
        
        // Membuat objek JumlahBilangan
        JumlahBilangan bil = new JumlahBilangan();
        
        // Menampilkan hasil penjumlahan
        bil.tampilHasilJumlah();
        
        // Membuat objek SelisihBilangan
        SelisihBilangan blg = new SelisihBilangan();
        
        // Menampilkan hasil selisih
        blg.tampilSelisih();
    }
}
