/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program tentang umur barang antik pada java.
*/

class BarangAntik {
    int umur;
    
    public BarangAntik(int umur){
      this.umur = umur;  
    }
    
    public void tampilUmur(){
        System.out.println("Umur Barang Antik ini adalah : " +umur+ " tahun ");
        
    }
    
}

class Radio extends BarangAntik {
    private String name;

    public Radio(int umur){
        super(umur);
        this.umur = umur;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}

public class Main {

	public static void main(String[] args) {
		
		 Radio rdo = new Radio(234);
	     rdo.setName("Radio AM");
	     System.out.println("Nama Barang Antik : " + rdo.getName());
	     rdo.tampilUmur();

	}

}
