/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini berisi tentang anggota akatsuki pada java.
*/

// Import library java array list
import java.util.ArrayList;
import java.util.List;

// Membuat kelas Akatsuki
class Akatsuki {
	
	// Membuat property pakaian
 private String pakaian;

 // Konstruktor untuk menginisialisasi informasi pakaian
 public Akatsuki(String pakaian) {
	 
	// Tampung nilai sementara menggunakan this yang merujuk pada property pakaian
     this.pakaian = pakaian;
 }

 // Getter untuk mendapatkan informasi pakaian
 public String getPakaian() {
     return pakaian;
 }

 // Metode untuk menampilkan informasi data Akatsuki
 public void tampilkanDataAkatsuki() {
     // Method kosong atau method dengan blok kosong
 }
}

//Menmbuat kelas Anggota yang merupakan turunan dari Akatsuki
class Anggota extends Akatsuki {
	
 // Membuat property nama, desa
 private String nama;
 private String desa;

 // Konstruktor untuk menginisialisasi informasi nama, pakaian, dan desa
 public Anggota(String nama, String pakaian, String desa) {
     super(pakaian); // Keyword super mengakses pada konstruktor kelas Akatsuki pada parameter pakaian
     
     // Tampung nilai sementara menggunakan this yang merujuk pada property nama, peran
     this.nama = nama;
     this.desa = desa;
 }

 // Getter untuk mendapatkan informasi nama
 public String getNama() {
     return nama;
 }

 // Getter untuk mendapatkan informasi desa
 public String getDesa() {
     return desa;
 }

 // Override metode tampilkanDataAkatsuki untuk memberikan implementasi khusus anggota Akatsuki
 @Override
 public void tampilkanDataAkatsuki() {
     System.out.println("Saya adalah anggota Akatsuki dengan nama " + getNama() +
             " menggunakan " + getPakaian() + " tinggal di desa " + getDesa() + ".");
 }
}

//Kelas Main sebagai kelas utama
public class Main {

	// Method main sebagai method utama untuk menjalankan program
 public static void main(String[] args) {
     
     // Membuat daftar anggota Akatsuki menggunakan ArrayList
     List<Anggota> dataAnggotaAkatsuki = new ArrayList<>();

     // Menambahkan anggota Akatsuki ke dalam daftar
     dataAnggotaAkatsuki.add(new Anggota("Itachi Uchiha", "pakaian hitam beserta corak awan merah", "Konohagakure"));
     dataAnggotaAkatsuki.add(new Anggota("Kisame Hoshigake", "pakaian hitam beserta corak awan merah", "Kirigakure"));
     dataAnggotaAkatsuki.add(new Anggota("Deidara", "pakaian hitam beserta corak awan merah", "Iwagakure"));
     dataAnggotaAkatsuki.add(new Anggota("Sasori", "pakaian hitam beserta corak awan merah", "Sunagakure"));
     dataAnggotaAkatsuki.add(new Anggota("Kakuzu", "pakaian hitam beserta corak awan merah", "Takigakure"));
     dataAnggotaAkatsuki.add(new Anggota("Hidan", "pakaian hitam beserta corak awan merah", "Yugakure"));
     dataAnggotaAkatsuki.add(new Anggota("Orochimaru", "pakaian hitam beserta corak awan merah", "Konohagakure"));

     // Menampilkan informasi setiap anggota Akatsuki dalam daftar
     for (Anggota anggota : dataAnggotaAkatsuki) {
         anggota.tampilkanDataAkatsuki();
         System.out.println("\n");
     }
 }
}
