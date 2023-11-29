/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program tentang tambah kurang pada java.
*/

class Bilangan {
   private int x;
   private int y;
   
   public Bilangan(){
       this.x = 3;
       this.y = 4;
   }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah(){
        System.out.println("Hasil Perjumlahan = "+ (getX()+getY()));
    }
    
}

class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " +getX()+" - "+getY()+" = "
                            +(getX()-getY()));
   }
}

public class Main {

	public static void main(String[] args) {
		
		   JumlahBilangan bil = new JumlahBilangan();
	       bil.tampilHasilJumlah();
	       
	       SelisihBilangan blg = new SelisihBilangan();
	       blg.tampilSelisih();

	}

}
