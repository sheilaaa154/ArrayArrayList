package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    // Constructor standar
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter biasa
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Logika lulus sekelas mahasiswa (>= 60)
    public boolean lulus() {
        return nilai >= 60;
    }

    // Method info dengan format teks ringkas
    public String info() {
        String status = lulus() ? "Lulus" : "Tidak Lulus";
        return npm + " - " + nama + " [" + nilai + " | " + status + "]";
    }
}