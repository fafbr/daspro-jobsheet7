import java.util.Scanner;

public class TugasPenjualanTiket10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int hargaTiket = 50000;
        int totTiket = 0;
        double totPenjualan = 0;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.println("Masukkan jumlah tiket yang dibeli setiap pelanggan: ");
        System.out.println("Masukkan 0 untuk mengakhiri.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            if (!sc.hasNextInt()) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                sc.next();
                continue;
            }

            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif! Silahkan masukkan lagi.");
                continue;
            } else if (jumlah == 0) {
                break;
            }

            double diskon = 0;

            if (jumlah > 4) {
                diskon = 0.1;
            } else if (jumlah > 10) {
                diskon = 0.15;
            }

            double totalHarga = jumlah * hargaTiket * (1 - diskon);

            System.out.printf("Total harga untuk %d tiket = Rp %.0f\n", jumlah, totalHarga);
            
            totTiket += jumlah;
            totPenjualan += totalHarga;
        }

        System.out.println("=== RINGKASAN PENJUALAN HARIAN TIKET");
        System.out.println("Total tiket terjual: " + totTiket);
        System.out.printf("Total Penjualan: Rp %.0f", totPenjualan);

        sc.close();
    }
}
