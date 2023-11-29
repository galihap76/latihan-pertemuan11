/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini berisi tentang menampilkan nama dan profesi
 *                     sebagai dosen dan mahasiswa.
*/

// Definisikan kelas 'Manusia' 
class Manusia {
	
	// Set property nama, umur ke protected
    protected String nama;
    protected int umur;

    // Method setter setNama() untuk mengatur property 'nama'
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method getter getNama() untuk mengembalikan property 'nama'
    public String getNama() {
        return nama;
    }
    
    // Method setter setUmur() untuk mengatur nilai 'umur'
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method getter getUmur() untuk mengembalikan property 'umur'
    public int getUmur() {
        return umur;
    }
    
    // Method untuk menampilkan informasi bahwa objek adalah manusia
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
}

// Definisikan kelas turunan 'Dosen' dari kelas 'Manusia'
class Dosen extends Manusia {
	
	// Set property nip, mataKuliah ke private
    private String nip;
    private String mataKuliah;
    
    // Method setter setNip() untuk mengatur nilai 'nip'
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Method getter getNip() untuk mengembalikan nilai 'nip'
    public String getNip() {
        return nip;
    }
    
    // Method setter setMataKuliah() untuk mengatur nilai 'mataKuliah'
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    // Method getter getMataKuliah() untuk mengembalikan nilai 'mataKuliah'
    public String getMataKuliah() {
        return mataKuliah;
    }
    
    // Method mengajarApa() pada class dosen pada extends manusia di gunakan untuk menampilkan nama dosen
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO.");
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
        
    }
}

// Definisikan kelas turunan 'Mahasiswa' dari kelas 'Manusia'
class Mahasiswa extends Manusia{
	
	// Set property nim, kelas ke private
    private String nim;
    private String kelas;

    // Method setter setNim() untuk mengatur nilai 'nim'
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    // Method getter getNim() untuk mengembalikan nilai 'nim'
    public String getNim() {
        return nim;
    }

    // Method setter setKelas() untuk mengatur nilai 'kelas'
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    // Method getter getKelas() untuk mengembalikan nilai 'kelas'
    public String getKelas() {
        return kelas;
    }
    
    // Method mengajarApa() pada class mahasiswa pada extends manusia di gunakan untuk menampilkan nama mahasiswa
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar dikelas PBO2.");  
    } 
  
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}

// Kelas utama 'Main'
public class Main {

	// Metode utama
    public static void main(String[] args) {
        
    	// Membuat objek Dosen
        Dosen dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        
        // Memanggil metode siapaKamu dan mengajarApa untuk objek dosen
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("\n");
        
        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 10110269");
        
        // Memanggil metode siapaKamu dan mengajarApa untuk objek mahasiswa
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}