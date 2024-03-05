import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data pengguna
        String adminUsername = "admin";
        String adminPassword = "admin123";
        String mahasiswaNIM = "123456789012345"; // Contoh NIM dengan panjang 15

        while (true) {
            // Meminta pengguna untuk memilih jenis login atau exit
            System.out.println("Silakan pilih jenis login atau ketik 'exit' untuk keluar:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilih (1/2/3): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit") || choice.equals("3")) {
                System.out.println("Sampai jumpa lagi.");
                break;
            }

            // Proses login berdasarkan jenis
            switch (choice) {
                case "1":
                    System.out.print("Masukkan username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = scanner.nextLine();

                    // Verifikasi admin
                    if (username.equals(adminUsername) && password.equals(adminPassword)) {
                        System.out.println("Login berhasil sebagai admin.");
                    } else {
                        System.out.println("Username atau password salah. Gagal login.");
                    }
                    break;

                case "2":
                    System.out.print("Masukkan NIM (15 digit): ");
                    String nim = scanner.nextLine();

                    // Verifikasi mahasiswa
                    if (nim.length() == 15 && nim.equals(mahasiswaNIM)) {
                        System.out.println("Login berhasil sebagai mahasiswa.");
                    } else {
                        System.out.println("NIM tidak valid. Gagal login.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
