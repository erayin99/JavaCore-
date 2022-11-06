package Ders1;

import java.util.ArrayList;

public class Sinif13 {
    public static void main(String[] atgs){

        int [] arr1 = {10, 20, 30, 40, 50};
        ArrayList<String> groups = new ArrayList<String>(); // arraylist olusturuldu
        groups.add("Tarkan");       // groups adlsi arrayliste deger ekleme
        groups.add("Sezen aksu");
        groups.add("Muslum gurses");
        groups.add("Sertab erener");
       for (int i = 0; i < groups.size(); i++){
            System.out.println("Eleman  " + groups.get(i));
        }
        for(String s:groups){       //FOR EACH DONGUSU S TANIMI ARRAY LIST ICERSINDE BILGI ALMAAYA
           System.out.println("Eleman  " + s);
        }
        for (int i:arr1){   //for each dongusu
            System.out.println("ELEMAN  " + i);

        }
        System.out.println("ELEMAN SAYISI  " + arr1.length);
    }
}
