package app;

import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Fiksi("Moby Dick", "Herman Melville", "Adventure");
        Buku buku2 = new NonFiksi("Bumi Manusia: Catatan Pinggir", "Goenawan Mohamad", "Politik");

        // Menampilkan info buku (polymorphism)
        buku1.displayInfo();
        System.out.println();
        buku2.displayInfo();
        System.out.println();

        // Membuat anggota (gunakan NIM dan nama Anda dan teman)
        Anggota anggota1 = new Anggota("E189", "Muhammad Syakhish Al Hanif");
        Anggota anggota2 = new Anggota("E168", "Wildan Noverliansyah Umasugi");

        // Demonstrasi peminjaman dan pengembalian
        anggota1.pinjamBuku("Moby Dick");
        anggota2.pinjamBuku("Bumi Manusia: Catatan Pinggir", 7);
        anggota1.kembalikanBuku("Moby Dick");
        anggota2.kembalikanBuku("Bumi Manusia: Catatan Pinggir");
    }
}