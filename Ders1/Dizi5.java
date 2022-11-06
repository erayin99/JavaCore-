package Ders1;

import java.util.ArrayList;
import java.util.Arrays;

public class Dizi5 {
    public static void main(String[] args) {
        String arr1[] = new String[5];
        arr1[0] = "tr";
        arr1[1] = "mat";
        arr1[2] = "fen";
        arr1[3] = "sos";
        arr1[4] = "beden";
     //   System.out.println("array 2 nin sifirinci degerei  " + arr1[4]);
      //  for (String arr: arr1)
        //    System.out.println("eleman   " + arr);
        //}

      /*  int index = 0;
        int i =0;
        for(i = 0; i < arr1.length; i++){
                index = i;
                System.out.println(arr1.length);

            }*/
            // FOR EAZH DONGUSU
            for (String arr: arr1){
                System.out.println(arr);
            }
             //   FOR EACH ILE METOT SONUCLARI
            // sadece arr yazinca elemanlari listeliyor
            // arr.lenght yazinca elemanlarin kac harf oldugunu yaziyor
            // charAt(0) yazinca ilk harfleri veriyor
            // arr.concat(arr dedigimiz zamnan ciktisi
            //  trtr seklinde klonlaniyor
            //arr.intern() seklinde eleman listesi element tr olarak gorundu
            // arr.repeat(3) deyince 3 kez tekrarladi
    }
}

