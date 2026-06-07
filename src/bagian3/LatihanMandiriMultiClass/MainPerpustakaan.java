package bagian3.LatihanMandiriMultiClass;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        perpus.tampilkanKoleksi();
        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        System.out.println(">> Uji Coba Pengembalian Buku <<");
        perpus.kembalikanBuku("Bumi Manusia"); 
        perpus.kembalikanBuku("Laskar Pelangi"); 
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println();

        System.out.println(">> Uji Coba Cari Penulis <<");
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();
        perpus.cariPenulis("Tere Liye"); 
    }
}