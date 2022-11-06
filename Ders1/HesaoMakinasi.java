package Ders1;

import java.util.Scanner;

public class HesaoMakinasi {
    public static void main(String[] args) {

        int sayi1, sayi2;
        int secim;

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi1 giriniz....");
        sayi1 =scan.nextInt();
        System.out.println("sayi2 giriniz....");
        sayi2 =scan.nextInt();
        System.out.println("YAPMAK ISTEDIGINIZ ISLEMI SECINIZ...");
        System.out.println("1 TOPLAMA 2 CIKARMA 3 CIKARMA 4 BOLME...");
        System.out.println("seciminizi  giriniz....");
       secim = scan.nextInt();

       if(secim ==1){
           System.out.println("TOPLAMA ISLEMI...." + (sayi1 + sayi2));
       }
       else if (secim ==2){

           System.out.println("Carpma islemi..." + (sayi1 + sayi2));
       }

       else if (secim == 3) {
           System.out.println("Cikarma islemi" + (sayi1-sayi2));

       } else if (secim ==4) {
           System.out.println("Bolme islemi" + (sayi1/sayi2));
       }
        else {
            System.out.println("lutfen gecerli bir sayi giriniz");
    }


    }



}
