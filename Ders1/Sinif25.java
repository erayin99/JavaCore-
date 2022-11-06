package Ders1;

import java.util.Scanner;

public class Sinif25 {
    public static void main(String[] args) {
        int v;
        int f;
        int q;
        double ortalama;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen vize notunuzu giriniz...");
        v= scan.nextInt();

        System.out.println("Lutfen final notunuzu giriniz...");
        f= scan.nextInt();

        System.out.println("Lutfen quiz notunuzu giriniz...");
        q= scan.nextInt();
        ortalama = (q * 0.20) + (v * 0.35) + (f * 0.45);
     String sonuc = (ortalama>= 50 )? "Gectiniz.." : "Kaldiniz..";
     System.out.println(sonuc);

    }
}
