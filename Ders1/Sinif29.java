package Ders1;

import java.util.Scanner;

public class Sinif29 {
    public static void main(String[] args) {
        Scanner     scan = new Scanner(System.in);
        int km, yas, tip;
        System.out.println("kac km...");
        km = scan.nextInt();
        System.out.println("kac yas...");
        yas = scan.nextInt();
        System.out.println("tip...");
        tip = scan.nextInt();
        double normalFiyat, yasind, tipindirimi;

        if (km > 0 && yas > 0 && (tip ==1) || (tip == 2) ){
            normalFiyat = km * 0.10;
            if (yas <= 12){
                yasind = normalFiyat * 0.5;
               // normalFiyat = normalFiyat - yasind;

            } else if (yas >12 && yas <= 24) {
                yasind = normalFiyat * 0.10;
               // normalFiyat = normalFiyat - yasind;
            } else if (yas >65) {
                yasind = normalFiyat * 0.30;
                //normalFiyat = normalFiyat - yasind;
                
            }
            else{
                yasind = 0;
            }
            normalFiyat-= yasind;  //yukarida metne donusruedugumuz kodlari daralltik
            if (tip ==2){
                tipindirimi = normalFiyat* 0.20;
                normalFiyat = (normalFiyat-tipindirimi) * 2;
            }
            System.out.println("BILET FIYATI  " + normalFiyat + "  $ DIR.." );
        }

        else {
            System.out.println("girdilerde hata var");

        }
    }
}
