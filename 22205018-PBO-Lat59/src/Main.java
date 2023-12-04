/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini berisi tentang detektif conan pada java.
*/

// Import library array list
import java.util.ArrayList;
import java.util.List;

// Membuat kelas Karakter
class Karakter {
	
 // Membuat property nama
 private String nama;

 // Konstruktor untuk menginisialisasi nama karakter
 public Karakter(String nama) {
	 
	 // Tampung nilai sementara menggunakan this yang merujuk pada property nama
     this.nama = nama;
 }

 // Getter untuk mendapatkan nama karakter
 public String getNama() {
     return nama;
 }

 // Metode untuk menampilkan karakter
 public void tampilkanKarakter() {
     // Method kosong atau method dengan blok kosong
 }
 
}

// Membuat kelas KarakterUtama yang merupakan turunan dari Karakter
class KarakterUtama extends Karakter {
	
 // Membuat property peran
 private String peran;

 // Konstruktor untuk menginisialisasi nama karakter utama dan perannya
 public KarakterUtama(String nama, String peran) {
     super(nama); // Keyword super mengakses pada konstruktor kelas Karakter pada parameter nama
     
    // Tampung nilai sementara menggunakan this yang merujuk pada property peran
     this.peran = peran;
 }

 // Getter untuk mendapatkan peran karakter utama
 public String getPeran() {
     return peran;
 }

 // Override metode tampilkanKarakter untuk memberikan implementasi khusus karakter utama
 @Override
 public void tampilkanKarakter() {
     System.out.println("Saya adalah karakter utama dengan nama " + getNama() + " dan peran " + peran + ".");
 }
 
}

//Membuat kelas KarakterPendukung yang merupakan turunan dari Karakter
class KarakterPendukung extends Karakter {
	
 // Membuat property peran
 private String peran;

 // Konstruktor untuk menginisialisasi nama karakter pendukung dan perannya
 public KarakterPendukung(String nama, String peran) {
     super(nama); // Keyword super mengakses pada konstruktor kelas Karakter pada parameter nama
     
  // Tampung nilai sementara menggunakan this yang merujuk pada property peran
     this.peran = peran;
 }

 // Getter untuk mendapatkan peran karakter pendukung
 public String getPeran() {
     return peran;
 }

 // Override metode tampilkanKarakter untuk memberikan implementasi khusus karakter pendukung
 @Override
 public void tampilkanKarakter() {
     System.out.println("Saya adalah karakter pendukung dengan nama " + getNama() + " dan peran " + peran + ".");
 }
}

// Kelas Main sebagai kelas utama
public class Main {

 // Buat method main sebagai method utama untuk menjalankan program
 public static void main(String[] args) {
	 
     // Membuat objek KarakterUtama untuk karakter utama cerita
     KarakterUtama MyMainChar = new KarakterUtama("Conan Edogawa", "Detektif");

     // Menampilkan informasi karakter utama
     MyMainChar.tampilkanKarakter();
     System.out.println("\n");

     // Membuat daftar karakter pendukung menggunakan ArrayList
     List<KarakterPendukung> karakterPendukungList = new ArrayList<>();

     // Menambahkan karakter pendukung ke dalam daftar
     karakterPendukungList.add(new KarakterPendukung("Ran Mouri", "Ahli Beladiri Karate"));
     karakterPendukungList.add(new KarakterPendukung("Kogoro Mouri", "Detektif Swasta"));
     karakterPendukungList.add(new KarakterPendukung("Eri Kisaki", "Pengacara"));
     karakterPendukungList.add(new KarakterPendukung("Sonoko Suzuki", "Siswi SMA"));
     karakterPendukungList.add(new KarakterPendukung("Heiji Hattori", "Detektif SMA"));
     karakterPendukungList.add(new KarakterPendukung("Kazuha Tayoma", "Ahli Aikido"));
     karakterPendukungList.add(new KarakterPendukung("Hiroshi Agasa", "Profesor"));
     karakterPendukungList.add(new KarakterPendukung("Ai Haibara", "Peneliti"));

     // Menampilkan informasi setiap karakter pendukung dalam daftar
     for (KarakterPendukung karakterPendukung : karakterPendukungList) {
         karakterPendukung.tampilkanKarakter();
         System.out.println("\n");
     }
 }
 
}
