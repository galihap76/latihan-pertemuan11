/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program java sederhana tentang handphone.
*/

// Mendefinisikan kelas HandPhone
class HandPhone {

    // Variabel protected untuk kelas HandPhone
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    // Konstruktor untuk menginisialisasi objek HandPhone dengan nilai manufacture, operatingSystem, model, dan harga
    public HandPhone(String man, String os, String model, int harga) {
    	
    	// Tampung sebagai nilai sementara menggunakan this yang merujuk pada variabel kelas HandPhone
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi produk HandPhone
    public void displayProduct(){
        System.out.println("Manufaktur : " +manufacture);
        System.out.println("OS\t: " +operatingSystem);
        System.out.println("Model\t: " +model);
        System.out.println("Harga\t: " +harga);
    }
}

// Mendefinisikan kelas Android yang merupakan turunan dari HandPhone
class Android extends HandPhone{
	
	// Variabel untuk membuat keyStore
    private String keyStore;
    
    // Konstruktor untuk menginisialisasi objek Android dengan nilai manufacture, operatingSystem, model, dan harga
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    // Getter untuk keyStore
    public String getKeyStore() {
        return keyStore;
    }

    // Setter untuk keyStore
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }  
}

// Mendefinisikan kelas BlackBerry yang merupakan turunan dari HandPhone
class BlackBerry extends HandPhone {

    // Variabel untuk membuat PIN BlackBerry
    private String pinBB;

    // Konstruktor untuk menginisialisasi objek BlackBerry dengan nilai manufacture, operatingSystem, model, dan harga
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    // Getter untuk pinBB
    public String getPinBB() {
        return pinBB;
    }

    // Setter untuk pinBB
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}

// Mendefinisikan kelas WindowsPhone yang merupakan turunan dari HandPhone
class WindowsPhone extends HandPhone {

    // Variabel untuk membuat Windows Phone KeyStore
    private String wpKeyStore;

    // Konstruktor untuk menginisialisasi objek WindowsPhone dengan nilai manufacture, operatingSystem, model, dan harga
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    // Getter untuk wpKeyStore
    public String getWpKeyStore() {
        return wpKeyStore;
    }

    // Setter untuk wpKeyStore
    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
}

// Kelas utama untuk menjalankan program
public class Main {

	// Buat method main sebagai method utama
    public static void main(String[] args) {
        
        // Membuat objek Android
        Android andro = new Android("Samsung","Android","Grand",3000000);
        
        // Set key store
        andro.setKeyStore("234ibfd3840fo");
        
        // Panggil method displayProduct();
        andro.displayProduct();
        
        // Tampilkan keystore android key store dengan method getKeyStore();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        
        // Beri spasi
        System.out.println("");
        
        // Membuat objek BlackBerry
        BlackBerry bb = new BlackBerry("BlackB","RIM","Curve",2000000);
        
        // Set key store
        bb.setPinBB("BHS249");
        
        // Panggil method displayProduct();
        bb.displayProduct();
        
        // Tampilkan PIN BlackBerry dengan method getPinBB();
        System.out.println("PIN : "+bb.getPinBB());
        
        // Beri spasi
        System.out.println("");
        
        // Membuat objek WindowsPhone
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",3500000);
        
        // Set key store
        wp.setWpKeyStore("UUUQIJWORJ");
        
        // Panggil method displayProduct();
        wp.displayProduct();
        
        // Tampilkan windows phone key store dengan method getWpKeyStore();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore()); 

    }
}
