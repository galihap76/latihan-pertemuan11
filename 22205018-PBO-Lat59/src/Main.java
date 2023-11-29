/*
 * Nama : Galih Anggoro Prasetya
 * NIM : 22205018
 * Kelas : Teknik Informatika Pagi
 * Semester : 3
 * Mata Kuliah : PBO 1
 * Deskripsi Program : Program ini berisi tentang detektif conan pada java.
*/

import java.util.ArrayList;
import java.util.List;

class Karakter {

    private String nama;

    public Karakter(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanKarakter() {
        // Method kosong atau method dengan blok kosong
    }
}

class KarakterUtama extends Karakter {
    private String peran;

    public KarakterUtama(String nama, String peran) {
        super(nama);
        this.peran = peran;
    }

    public String getPeran() {
        return peran;
    }

    @Override
    public void tampilkanKarakter() {
        System.out.println("Saya adalah karakter utama dengan nama " + getNama() + " dan peran " + peran + ".");
    }
}

class KarakterPendukung extends Karakter {
    private String peran;

    public KarakterPendukung(String nama, String peran) {
        super(nama);
        this.peran = peran;
    }

    public String getPeran() {
        return peran;
    }

    @Override
    public void tampilkanKarakter() {
        System.out.println("Saya adalah karakter pendukung dengan nama " + getNama() + " dan peran " + peran + ".");
    }
}

public class Main {

    public static void main(String[] args) {
        KarakterUtama MyMainChar = new KarakterUtama("Conan Edogawa", "Detektif");

        MyMainChar.tampilkanKarakter();
        System.out.println("\n");
        
        List<KarakterPendukung> karakterPendukungList = new ArrayList<>();

        karakterPendukungList.add(new KarakterPendukung("Ran Mouri", "Ahli Beladiri Karate"));
        karakterPendukungList.add(new KarakterPendukung("Kogoro Mouri", "Detektif Swasta"));
        karakterPendukungList.add(new KarakterPendukung("Eri Kisaki", "Pengacara"));
        karakterPendukungList.add(new KarakterPendukung("Sonoko Suzuki", "Siswi SMA"));
        karakterPendukungList.add(new KarakterPendukung("Heiji Hattori", "Detektif SMA"));
        karakterPendukungList.add(new KarakterPendukung("Kazuha Tayoma", "Ahli Aikido"));
        karakterPendukungList.add(new KarakterPendukung("Hiroshi Agasa", "Profesor"));
        karakterPendukungList.add(new KarakterPendukung("Ai Haibara", "Peneliti"));
        
        for (KarakterPendukung karakterPendukung : karakterPendukungList) {
            karakterPendukung.tampilkanKarakter();
            System.out.println("\n");
        }
    }
}
