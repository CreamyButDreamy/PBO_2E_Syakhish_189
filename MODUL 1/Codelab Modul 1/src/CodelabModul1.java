//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.LocalDate;

public class CodelabModul1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // masukkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // masukkan jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // masukkan tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String kelamin;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            kelamin = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            kelamin = "Perempuan";
        } else {
            kelamin = "Tidak diketahui";
        }

        // Menampilkan data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + kelamin);
        System.out.println("Umur          : " + umur + " tahun");

        scanner.close();
    }
}