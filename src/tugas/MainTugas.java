package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // Poin 4: Membuat Array String ukuran tetap (Materi Bagian 1)
        String[] matakuliah = new String[3];
        matakuliah[0] = "Pemrograman Java";
        matakuliah[1] = "Struktur Data";
        matakuliah[2] = "Basis Data";
        
        System.out.println("Mata Kuliah : ");
        for (String mk : matakuliah) {
            System.out.println("- " + mk);
        }
        System.out.println(); // Pembatas

        // Poin 3: Membuat objek pengelola & tambah 5 mahasiswa awal
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Rayhan", "2410010270", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Sheila", "2410010276", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Arka", "2410010567", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Neishya", "2410010876", 45));
        kelas.tambahMahasiswa(new Mahasiswa("Diffa", "2410010435", 90));

        // Tampilkan data awal
        kelas.tampilkanSemua();
        System.out.println();

        // Poin 5: Tampilkan rata-rata & jumlah lulus (Format teks sama seperti Latihan 4 & 5)
        System.out.println("Rata-rata    : " + kelas.hitungRataRata());
        System.out.println("Jumlah Lulus : " + kelas.jumlahLulus());
        System.out.println();

        // Poin 6: Tambah 1 objek mahasiswa baru, lalu tampilkan jumlah akhirnya
        System.out.println(">> Tambah mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Dita", "2410010789", 65));
        
        // Output jumlah akhir seperti Latihan 4
        System.out.println("Jumlah data  : " + kelas.jumlahData()); 
        System.out.println();
        
        // Tampilkan ulang untuk melihat hasil akhir data terbaru
        kelas.tampilkanSemua();
    }
}