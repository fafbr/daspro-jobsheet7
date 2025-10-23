import java.util.Scanner;

public class KafeDoWhile {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String namaPelanggan;
        int kopi, teh, roti, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            sc.nextLine();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            sc.nextLine();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            sc.nextLine();

            totalHarga =(kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp"+totalHarga);
        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();   
   } 
}
