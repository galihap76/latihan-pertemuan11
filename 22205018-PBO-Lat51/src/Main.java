/* 
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini berisi tentang menghitung gaji karyawan sesuai
 *                     jabatan.
*/

// Import kelas Scanner untuk mengambil input dari pengguna
import java.util.Scanner;

// Definisikan kelas dasar 'Karyawan'
class Karyawan {

    // Variabel anggota (nik, nama, jabatan, golongan) dienkapsulasi dan diakses melalui metode get dan set
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    // Metode getter untuk mendapatkan nilai 'nik'
    public String getNik() {
        return nik;
    }

    // Metode getter untuk mendapatkan nilai 'nama'
    public String getNama() {
        return nama;
    }

    // Metode getter untuk mendapatkan nilai 'jabatan'
    public String getJabatan() {
        return jabatan;
    }

    // Metode getter untuk mendapatkan nilai 'golongan'
    public int getGolongan() {
        return golongan;
    }

    // Metode setter untuk mengatur nilai 'nik'
    public void setNik(String nik) {
        this.nik = nik;
    }

    // Metode setter untuk mengatur nilai 'nama'
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode setter untuk mengatur nilai 'jabatan'
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Metode setter untuk mengatur nilai 'golongan'
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}

// Definisikan kelas turunan 'Manager' dari kelas 'Karyawan'
class Manager extends Karyawan {

    // Variabel tambahan untuk kelas 'Manager'
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    // Metode getter untuk mendapatkan nilai 'kehadiran'
    public int getKehadiran() {
        return kehadiran;
    }

    // Metode setter untuk mengatur nilai 'kehadiran'
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    // Metode untuk menghitung tunjangan kehadiran
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = kehadiran * 10000;
        return tunjanganKehadiran;
    }

    // Metode untuk menghitung tunjangan jabatan
    public float tunjanganJabatan(String jabatan) {
    	
    	// Cek jika jabatan nya adalah manager
        if (jabatan.equals("Manager")) {
        	
        	// Beri nilai tunjangan jabatan sebesar 2000000
            tunjanganJabatan = 2000000;
            
        // Cek jika jabatan nya adalah kabag
        } else if (jabatan.equals("Kabag")) {
        	
        	// Beri nilai tunjangan jabatan sebesar 1000000
            tunjanganJabatan = 1000000;
            
        // Di luar itu
        } else {
        	
        	// Beri nilai tunjangan jabatan 0
            tunjanganJabatan = 0;
        }
        
        // Kembalikan nilai tunjangan jabatan
        return tunjanganJabatan;
    }

    // Metode untuk menghitung tunjangan golongan
    public float tunjanganGolongan(int golongan) {
    	
    	// Cek jika golongan nya adalah 1
        if (golongan == 1) {
        	
        	// Beri nilai tunjangan jabatan sebesar 500000
            tunjanganGolongan = 500000;
            
         // Cek jika golongan nya adalah 2
        } else if (golongan == 2) {
        	
        	// Beri nilai tunjangan jabatan sebesar 1000000
            tunjanganGolongan = 1000000;
            
         // Cek jika golongan nya adalah 3
        } else if (golongan == 3) {
        	
        	// Beri nilai tunjangan jabatan sebesar 1500000
            tunjanganGolongan = 1500000;
        }
        
        // Kembalikan nilai tunjangan golongan
        return tunjanganGolongan;
    }

    // Metode untuk menghitung total gaji
    public float totalGaji() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}

// Kelas utama 'Main'
public class Main {

    // Metode utama
    public static void main(String[] args) {

        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Membuat objek Manager
        Manager Obj = new Manager();

        // Menampilkan judul program
        System.out.println("=== Program Perhitungan Gaji Karyawan===");

        // Meminta untuk memasukkan nilai untuk setiap atribut karyawan
        System.out.print("Masukkan Nik : ");
        Obj.setNik(input.nextLine());

        System.out.print("Masukkan Nama : ");
        Obj.setNama(input.nextLine());

        System.out.print("Masukkan Golongan (1/2/3) : ");
        Obj.setGolongan(input.nextInt());

        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        Obj.setJabatan(input.next());

        System.out.print("Masukkan Jumlah Kehadiran : ");
        Obj.setKehadiran(input.nextInt());
        System.out.println("\n");

        // Menampilkan hasil perhitungan gaji
        System.out.println("===Hasil Perhitungan===");

        System.out.println("NIK : " + Obj.getNik());
        System.out.println("Nama : " + Obj.getNama());
        System.out.println("Golongan : " + Obj.getGolongan());
        System.out.println("Jabatan : " + Obj.getJabatan());
        System.out.println("\n");

        System.out.println("TUNJANGAN GOLONGAN : " + Obj.tunjanganGolongan(Obj.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + Obj.tunjanganJabatan(Obj.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + Obj.tunjanganKehadiran(Obj.getKehadiran()));
        System.out.println("\n");
        System.out.println("GAJI TOTAL : " + Obj.totalGaji());
    }
}
