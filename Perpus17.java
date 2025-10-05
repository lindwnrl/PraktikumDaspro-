import java.util.Scanner;

public class Perpus17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean punyaKartu;      
    boolean registrasiOnline;
    
    System.out.println("Apakah punya kartu (true/false): ");
    punyaKartu = sc.nextBoolean();
    System.out.println("Apakah sudah registrasi online");
    registrasiOnline = sc.nextBoolean();

    if (punyaKartu == true && registrasiOnline == true ) {
        System.out.println("Masuk sana");
    }else{
        System.out.println("Jangan masuk");
    }
    }
}
