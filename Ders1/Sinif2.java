package Ders1;
import java.util.Scanner;


public class Sinif2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen x degerini giriniz");
       int x = scan.nextInt();
         Scanner scab2 = new Scanner(System.in);
        System.out.println("Lutfen y degerini giriniz");
        int y = scan.nextInt();
        int sonuc;
        sonuc = x+y;
        System.out.println("toplaam islemi sonucu  =" + sonuc);
    }

}
