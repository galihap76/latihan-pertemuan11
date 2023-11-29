/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini membuat koordinat sederhana pada java.
*/

class Koordinat {
    protected int x;
    protected int y;
    
    public Koordinat(int x, int y){
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class WarnaKoordinat extends Koordinat {
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna){
     super (x, y);
    }
    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
    
}


public class Main {

	public static void main(String[] args) {
		
	    WarnaKoordinat wk = new  WarnaKoordinat(0,0,"");
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " 
                            + wk.getY());

	}

}
