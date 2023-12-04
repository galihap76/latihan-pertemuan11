/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program tentang vehicle pada java.
*/

// Membuat kelas Vehicle
class Vehicle {
	
	// Buat property myBrand, myModel
    private String myBrand;
    private String myModel;
    
    // Konstruktor default untuk kelas Vehicle
    public Vehicle(){
     
    }

    // Getter untuk myBrand
    public String getBrand() {
        return myBrand;
    }

    // Getter untuk myModel
    public String getModel() {
        return myModel;
    }

    // Setter untuk myBrand
    public void setBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    // Setter untuk myModel
    public void setModel(String myModel) {
        this.myModel = myModel;
    }
}

// Membuat kelas Bicycle yang merupakan turunan dari Vehicle
class Bicycle extends Vehicle{
	
	// Buat property myGearCount
    private int myGearCount;
    
    // Konstruktor untuk kelas Bicycle
    public Bicycle(){
        System.out.println("Bicycle");
    }

    // Getter untuk myGearCount
    public int getGearCount() {
        return myGearCount;
    }

    // Setter untuk myGearCount
    public void setGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}

// Membuat kelas Skateboard yang merupakan turunan dari Vehicle
class Skateboard extends Vehicle {
	
	// Buat property myBoardLength
    private double myBoardLength;

    // Konstruktor untuk kelas Skateboard
    public Skateboard(){
        System.out.println("Skateboard");
    }

    // Getter untuk myBoardLength
    public double getBoardLength() {
        return myBoardLength;
    }

    // Setter untuk myBoardLength
    public void setBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}

// Kelas Main sebagai kelas utama
public class Main {

	// Method main sebagai method utama untuk menjalankan program
    public static void main(String[] args) {
        
        // Membuat objek Bicycle
        Bicycle bcl = new Bicycle();
        
        // Set brand, model dan gear count
        bcl.setBrand("Trek Bike");
        bcl.setModel("7.4FX");
        bcl.setGearCount(23);
        
        // Menampilkan informasi Bicycle
        System.out.println("Brand : " + bcl.getBrand());
        System.out.println("Model : " + bcl.getModel());
        System.out.println("Jumlah Gear : " + bcl.getGearCount());
        System.out.println("");
        
        // Membuat objek Skateboard
        Skateboard sktb = new Skateboard();
        
        // Set brand, model dan board length
        sktb.setBrand("Ally sktb");
        sktb.setModel("Rocket");
        sktb.setBoardLength(54.5);
        
        // Menampilkan informasi Skateboard
        System.out.println("Brand : " + sktb.getBrand());
        System.out.println("Model : " + sktb.getModel());
        System.out.println("Panjangnya Board : " + sktb.getBoardLength());

    }
}
