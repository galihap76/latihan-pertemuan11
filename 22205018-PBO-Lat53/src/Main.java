/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini berisi tentang hewan rabbit.
*/

// Definisikan kelas 'Animal'
class Animal {

    // Property vegetarian, eats, noOfLegs di buat
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    // Konstruktor untuk menginisialisasi property animal
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }

    // Method isVegetarian untuk mengembalikan property vegetarian berupa boolean
    public boolean isVegetarian(){
        return vegetarian;
    }

    // Method getter getEats() untuk mengembalikan property 'eats' berupa string
    public String getEats() {
        return eats;
    }

    // Method getNoOfLegs() untuk mengembalikan property 'noOfLegs' berupa int
    public int getNoOfLegs() {
        return noOfLegs;
    }
}

// Definisikan kelas turunan 'Rabbit' dari kelas 'Animal'
class Rabbit extends Animal {

    // Property color, name untuk kelas 'Rabbit'
    private String color;
    private String name;

    // Konstruktor untuk menginisialisasi property rabbits
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    // Method getColor() untuk mengembalikan property 'color' berupa string
    public String getColor() {
        return color;
    }

    // Method getName() untuk mengembalikan property 'name' berupa string
    public String getName() {
        return name;
    }
}

// Kelas utama 'Main'
public class Main{
	
    // Metode utama
    public static void main(String[] args) {
		
        // Membuat objek Rabbit bernama 'tank'
        Rabbit tank = new Rabbit("Peter", false, "Grass", 4, "grey");

        // Menampilkan informasi mengenai objek Rabbit
        System.out.println("Hello, his name is " + tank.getName());
        System.out.println(tank.getName() + " is Vegetarian? " + tank.isVegetarian());
        System.out.println(tank.getName() + " eats " + tank.getEats());
        System.out.println(tank.getName() + " has " + tank.getNoOfLegs() + " legs");
        System.out.println(tank.getName() + " color is " + tank.getColor());
    }
}
