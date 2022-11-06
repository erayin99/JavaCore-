package Ders1;

import java.util.Scanner;

public class Sinif4
{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int bakiye = 1000;
    int islem;

    System.out.println("1  Bakiye goruntuleme");
        System.out.println("2  Para Yatirma");
        System.out.println("3  Para Cekme");
        System.out.println("4  Sistemden cikis");
    islem = scan.nextInt();


        switch(islem){
            case 1:
            System.out.println("Bakiyeniz" + bakiye + "tk dir.");
            break;
            case 2:
            System.out.println("Ne kadar yatiracaksiniz");
            int miktar = scan.nextInt();
            bakiye += miktar;
            System.out.println("Yeni bakiue" + bakiye + "tl dir.");
            break;
            case 3:
            System.out.println("Ne kadar para cekeceksiniz");
            miktar = scan.nextInt();
            bakiye -= miktar;
            System.out.println("Yeni bakiue" + bakiye + "tl dir.");
            break;
            case 4:
            System.out.println("sISTEMDEN CIKIS YAPTINIZ");
            break;
            default:
                System.out.println("Gecersiz islem talebi");


    }
}

}
