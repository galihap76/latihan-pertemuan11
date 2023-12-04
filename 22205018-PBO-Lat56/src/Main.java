/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program tentang umur barang antik pada java.
*/

// Membuat kelas BarangAntik
class BarangAntik {
	
	// Buat property umur
    int umur;
    
    // Konstruktor untuk menginisialisasi objek BarangAntik dengan nilai umur
    public BarangAntik(int umur){
    	
    	// Tampung sebagai nilai sementara menggunakan this yang merujuk pada property umur
        this.umur = umur;  
    }
    
    // Method untuk menampilkan umur BarangAntik
    public void tampilUmur(){
        System.out.println("Umur Barang Antik ini adalah : " + umur + " tahun");
    }
}

// Membuat kelas Radio yang merupakan turunan dari BarangAntik
class Radio extends BarangAntik {
	
	// Buat property nama
    private String name;

    // Konstruktor untuk menginisialisasi objek Radio dengan nilai umur
    public Radio(int umur){
        super(umur);
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Setter untuk name
    public void setName(String name) {
        this.name = name;
    }    
}

// Buat kelas Main sebagai kelas utama
public class Main {

	// Jalankan method main sebagai method utama untuk menjalankan program
    public static void main(String[] args) {
        
        // Membuat objek Radio
        Radio rdo = new Radio(234);
        
        // Set nama radio
        rdo.setName("Radio AM");
        
        // Dan tampilkan nama barang antik dan method tampilUmur()
        System.out.println("Nama Barang Antik : " + rdo.getName());
        rdo.tampilUmur();
    }
}
