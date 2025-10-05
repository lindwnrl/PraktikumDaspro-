    package jobsheet5;
    import java.util.Scanner;

    public class ifCetakKRS17 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("=--= Cetak KRS SIAKAD =--= ");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pemabayaran ukt terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan Pak Usman");
        }
        sc.close();
    }   
    
}