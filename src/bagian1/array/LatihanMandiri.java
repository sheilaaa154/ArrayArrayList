package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // ==========================================
        // Jawaban Latihan 1.4 No. 1 (Suhu tertinggi dan terendah)
        // ==========================================
        System.out.println("== Jawaban Latihan 1.4 No. 1 ==");
        
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0], min = suhu[0];
        
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah : " + min);
        System.out.println(); // Pembatas antar nomor


        // ==========================================
        // Jawaban Latihan 1.4 No. 2 (Hari dengan lebih dari 5 huruf)
        // *Catatan: Menyesuaikan gaya penulisan satu baris if dari dosen
        // ==========================================
        System.out.println("== Jawaban Latihan 1.4 No. 2 ==");
        
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        for (String h : hari) {
            if (h.length() > 5) System.out.println("Hari: " + h);
        }
        System.out.println(); // Pembatas antar nomor


        // ==========================================
        // Jawaban Latihan 1.4 No. 3 (Hitung bilangan genap)
        // ==========================================
        System.out.println("== Jawaban Latihan 1.4 No. 3 ==");
        
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        
        System.out.println("Jumlah genap: " + genap);
    }
}