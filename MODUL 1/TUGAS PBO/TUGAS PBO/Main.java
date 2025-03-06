import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih Login:\n1. Admin\n2. Mahasiswa\nMasukkan Pilihan:");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    admin();
                    break;
                case 2:
                    mahasiswa();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void admin() {
        System.out.println("Masukkan username: ");
        String usernameAdmin = input.nextLine();
        System.out.println("Masukkan Password: ");
        String passwordAdmin = input.nextLine();

        if (usernameAdmin.equals("admin189") && passwordAdmin.equals("password189")) {
            System.out.println("Login Admin Berhasil!");
            System.exit(0);
        } else {
            System.out.println("Login gagal! Username atau passwordhjhj salah.");
        }
    }

    public static void mahasiswa() {
        System.out.println("Masukkan username: ");
        String usernamemahasiswa = input.nextLine();
        System.out.println("Masukkan NIM: ");
        String passwordmahasiswa = input.nextLine();

        if (usernamemahasiswa.equals("Muhammad Syakhish Al Hanif" ) && passwordmahasiswa.equals("202410370110189")) {
            System.out.println("Login Mahasiswa Berhasil!");
            System.out.println("Nama : "+usernamemahasiswa);
            System.out.println("NIM : "+passwordmahasiswa);
            System.exit(0);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}