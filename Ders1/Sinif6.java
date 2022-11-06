package Ders1;

import java.util.Scanner;

public class Sinif6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam =0;

        do {
            toplam += sayi % 10;
            sayi = sayi / 10;

            System.out.println(" Topkam = " + toplam +"sayi  = " + sayi );
        }
        while(sayi > 0);
        System.out.println("Toplam  = " + toplam);
    }

}
