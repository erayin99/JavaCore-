package Ders1;
// KULLANICI GIRISI

import java.util.Scanner;

public class Sinif27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String kadi, parola;
        System.out.println("Kullanici adi giriniz....");
        kadi = scan.next();
        System.out.println("PAROLA GIRINIZ....");
        parola = scan.next();
        if (kadi.equals("java") && (parola.equals("123"))){
            System.out.println("Sisteme giris yaptiniz hosgeldiniz");
        }
        else{
            System.out.println("Hatali kullanici adi yada parola");
        }
    }
}
