package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArraylist {
    public static void main(String[] args) {
        
        // Soal 1: ArrayList Daftar Belanja
        System.out.println(" - Jawaban Latihan 2.5 No. 1 -");
        
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Buku");
        belanja.add("Pena");
        belanja.add("Pensil");
        belanja.add("Penghapus");
        
        belanja.remove(1); 
        
        System.out.println("Isi list : " + belanja);
        System.out.println("Jumlah   : " + belanja.size());
        System.out.println();

        // Jawaban Latihan 2.5 No. 2 (Nilai terbesar di ArrayList)
        System.out.println(" - Jawaban Latihan 2.5 No. 2 - ");
        
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); nilai.add(95); nilai.add(60);
        nilai.add(88); nilai.add(75);
        
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        
        System.out.println("Terbesar: " + max);
        System.out.println();
        

        // Jawaban Latihan 2.5 No. 3 (Nama berawalan A)
        System.out.println("- Jawaban Latihan 2.5 No. 3 -");
        
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        
        for (String d : data) nama.add(d);
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println(n);
        }
    }
}