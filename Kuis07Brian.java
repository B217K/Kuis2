import java.util.Scanner;

public class Kuis07Brian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pengunjung: ");
        int n = sc.nextInt();
        int totalPendapatan = 0;
        int totalUsia = 0;
        int nim2 = <2 digit NIM>;
        int kuotaDewasa = (nim2 % 3)+2;

        for (int i = 1; i <= n; i++) {
            System.out.print("Usia pengunjung ke-" + (i) + ": ");
            int usia = sc.nextInt();
            if (usia < 1 || usia > 80){
                System.out.println("Input tidak valid, ulangi");
                System.out.print("Usia pengunjung ke-" + (i)+ ": ");
                usia = sc.nextInt();
                continue;
            }
                

            
            // Harga tiket: usia di bawah 12 tahun Rp 25000, selain itu Rp 40000
            int harga;
            int salah = 0;
            if (usia < 12) {
                harga = 25000;
            } else {
                if (totalUsia > kuotaDewasa){
                    System.out.println("Kunjungan ditolak");
                    salah++;
                    System.out.print("Usia pengunjung ke-" + (i)+ ": ");
                    usia = sc.nextInt();
                    continue;
                }
                harga = 40000;
            }
            totalPendapatan += harga;
            totalUsia += usia;
            System.out.println("  Harga tiket: Rp " + harga);
        }

        double rataUsia = totalUsia / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pendapatan : Rp " + totalPendapatan);
        System.out.println("Rata-rata usia   : " + rataUsia + " tahun");
        System.out.println("Jumlah Pengunjung yng ditolak: "+ salah +"orang");
    }
}