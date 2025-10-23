import java.util.Scanner;

public class SiakadFor10Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, terendah = 100, tertinggi = 0;
        int lulus = 0, tidakLulus = 0; // 🔹 Tambahan variabel penghitung

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // 🔹 Mengecek nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // 🔹 Mengecek nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // 🔹 Menentukan lulus atau tidak
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // 🔹 Menampilkan hasil akhir
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Jumlah mahasiswa lulus      : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}
