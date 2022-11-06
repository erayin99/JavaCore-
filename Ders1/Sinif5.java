package Ders1;

import java.util.Scanner;

public class Sinif5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        while(sayi >= 1){
            faktoriyel = faktoriyel * sayi;
            System.out.println("jfaktoriyel  =  " + faktoriyel + "sayi " + sayi);

            sayi--;
        }
        System.out.println("Faktoriyel  = " + faktoriyel);
    }
}
