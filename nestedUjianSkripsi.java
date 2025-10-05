package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen: (ya/tidak) ");
        String bebasKompen =sc.nextLine().trim();

        System.out.println("Masukkan  jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        if (bebasKompen.equalsIgnoreCase("ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "semua syarat terpenuhi.Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1 < 8 &&  bimbinganP2 < 4){
                pesan ="Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }else if (bimbinganP1 < 8) {
                pesan ="Gagal! Log bimbingan P1 kurang dari 8";
            }else{
                pesan ="Gagal! Log bimbingan P2 kurang dari 4";
            }
    }else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }   
    System.out.println(pesan);
    sc.close();
}
}
