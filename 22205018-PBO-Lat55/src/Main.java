/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program java sederhana tentang handphone.
*/

class HandPhone {

    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public HandPhone(String man, String os, String model, int harga) {
        
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : " +manufacture);
        System.out.println("OS\t: " +operatingSystem);
        System.out.println("Model\t: " +model);
        System.out.println("Harga\t: " +harga);
        
       
    }

}

class Android extends HandPhone{
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;

    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }  
}

class BlackBerry extends HandPhone {

    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;

    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

}

class WindowsPhone extends HandPhone {

    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }

}

public class Main {

	public static void main(String[] args) {
		
		    Android andro = new Android("Samsung","Android","Grand",3000000);
	        andro.setKeyStore("234ibfd3840fo");
	        andro.displayProduct();
	        System.out.println("Android KeyStore : "+andro.getKeyStore());
	        System.out.println("");
	        
	        BlackBerry bb = new BlackBerry("BlackB","RIM","Curve",2000000);
	        bb.setPinBB("BHS249");
	        bb.displayProduct();
	        System.out.println("PIN : "+bb.getPinBB());
	        System.out.println("");
	        
	        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",3500000);
	        wp.setWpKeyStore("UUUQIJWORJ");
	        wp.displayProduct();
	        System.out.println("Wp Key Store : "+wp.getWpKeyStore()); 

	}

}
