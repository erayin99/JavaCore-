package Ders1;

import java.util.ArrayList;

// arraylost olusturma
public class DiziList {
    public static void main(String[] args){
        ArrayList<String> groups = new ArrayList<String>(); // arraylist olusturuldu
        groups.add("Tarkan");       // groups adlsi arrayliste deger ekleme
        groups.add("Sezen aksu");
        groups.add("Muslum gurses");
        groups.add("Sertab erener");

        // ARRAYLISTTEN SILME ISLEMI
       // groups.remove("Muslum gurses");
        //groups.remove(1);
        System.out.println(groups.indexOf("Tarkan"));

      // System.out.println("0 indeksi" + groups.get(1));
       // System.out.println("ArrayList uzunluk" + groups.size());
        for (int i = 0; i < groups.size(); i++){
            System.out.println("Eleman  " + groups.get(i));
        }

    }
}

