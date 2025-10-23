import java.util.Scanner;

public class TugasTotalTarifParkir10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jenis = 0, durasi;
        double total = 0;

        System.out.print("=== PROGRAM PERHITUNGAN BIAYA PARKIR ===\n");

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");

            if (!sc.hasNextInt()) {
                System.out.println("Input tidak valid! harap masukkan angka 0, 1, atau 2.");
                sc.next();
                continue;
            }
            
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak  dikenal! silahkan 1 atau 2.");
                sc.next();
                continue;
            }

            System.out.print("Masukkan durasi parkir: ");

            if (!sc.hasNextInt()) {
                System.out.println("Durasi tidak valid! silahkan masukkan angka.");
                sc.next();
                continue;
            }

            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += 3000;
            } else {
                total += 2000;
            }
        }
        System.out.println("\n=== HASIL TOTAL PEMBAYARN PARKIR");
        System.out.printf("Total biaya parkir hari ini: Rp %.0f\n", total);

        sc.close();
    }
}
