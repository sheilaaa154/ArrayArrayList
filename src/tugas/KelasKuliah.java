package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Koleksi ArrayList bertipe Mahasiswa (seperti contoh Perpustakaan)
    private ArrayList<Mahasiswa> koleksi = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        koleksi.add(m);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Nilai Mahasiswa ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Mahasiswa m = koleksi.get(i);
            System.out.println((i + 1) + ". " + m.info());
        }
    }

    // Menggunakan logika penjumlahan total dari Latihan 5
    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : koleksi) {
            total += m.getNilai(); // Menjumlahkan semua nilai
        }
        return total / koleksi.size(); // Total dibagi jumlah data di ArrayList
    }

    // Menghitung jumlah yang lulus dengan kondisi if sederhana
    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa m : koleksi) {
            if (m.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Method untuk mengambil ukuran list (seperti .size() di Latihan 4 & 5)
    public int jumlahData() {
        return koleksi.size();
    }
}