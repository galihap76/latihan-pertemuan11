/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program tentang vehicle pada java.
*/

class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }

    public String getBrand() {
        return myBrand;
    }

    public String getModel() {
        return myModel;
    }

    public void setBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public void setModel(String myModel) {
        this.myModel = myModel;
    }
}

class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}

class Skateboard extends Vehicle {
    private double myBoardLeght;
    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getBoardLeght() {
        return myBoardLeght;
    }

    public void setBoardLeght(double myBoardLeght) {
        this.myBoardLeght = myBoardLeght;
    }
    
}

public class Main {

	public static void main(String[] args) {
		
		    Bicycle bcl = new Bicycle();
	        bcl.setBrand("Trek Bike");
	        bcl.setModel("7.4FX");
	        bcl.setGearCount(23);
	        System.out.println("Brand : "+bcl.getBrand());
	        System.out.println("Model : "+bcl.getModel());
	        System.out.println("Jumlah Gear : "+bcl.getGearCount());
	        System.out.println("");
	        
	        Skateboard sktb = new Skateboard();
	        sktb.setBrand("Ally sktb");
	        sktb.setModel("Rocket");
	        sktb.setBoardLeght(54.5);
	        System.out.println("Brand : "+sktb.getBrand());
	        System.out.println("Model : "+sktb.getModel());
	        System.out.println("Panjangnya Board : "+sktb.getBoardLeght());

	}

}
