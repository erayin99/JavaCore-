package Ders1;

import java.util.Scanner;

public class Sinif9 {
    public static void faktoriyel(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz....");
        int sayi = scan.nextInt();
        int faktoriyel =1;
        while (sayi > 0){
            faktoriyel *= sayi;
            sayi--;


        }
        System.out.println("Faktoriyel...." + faktoriyel);
    }
    public static void main(String[] args){
        faktoriyel();  // fonksiyon cagirma

    }
}
