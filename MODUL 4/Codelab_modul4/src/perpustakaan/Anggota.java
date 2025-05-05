package perpustakaan;

public class Anggota implements Pinjaman {
    private String idAnggota;
    private String nama;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    // Implementasi interface Pinjaman
    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println(nama + " (ID: " + idAnggota + ") meminjam buku: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " (ID: " + idAnggota + ") mengembalikan buku: " + judulBuku);
    }

    // Overloading method pinjamBuku
    public void pinjamBuku(String judulBuku, int durasi) {
        System.out.println(nama + " (ID: " + idAnggota + ") meminjam buku: " + judulBuku +
                " untuk " + durasi + " hari");
    }
}