package Ders1;

/* ARAC CALSSINDA TANIMLADIGIMIZ PUBLIC OZELLIKLERI ARABA CLASSINDA CAGIRIYORUZ
CAGIRMA REFERANSI TANIMI CAR1 OLARAK BELIRLENDI
OBJE OLUSTURMA ISLEMINDE DIKKAT EDILMESI GEREKEN ARABA CLASSINDA ARAC CLASSINDAN CAGIR
VE REFERANS OLARAK CAR1 BELIRLENMIS
 */

public class Araba {
    public static void main(String[] args){
        Arac Car1 = new Arac();

        Car1.Color = "Gumus";
        Car1.Model = "MEGANE";
        Car1.engine = 1.6;
        Car1.doors = 4;

        System.out.println("Arabanin Rengi   " + Car1.Color);
        System.out.println("Arabanin Modeli   " + Car1.Model);
        System.out.println("Arabanin Motori   " + Car1.engine);
        System.out.println("Arabanin Kapi sayisi   " + Car1.doors);

    }
}