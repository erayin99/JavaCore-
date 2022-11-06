package Ders1;

import java.util.Scanner;

// ARRAYS
public class Dizi1 {
    public static void mean(int[] arr ){  // fonksiyon tanimladik
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];

        }
        System.out.println("Ortalama   " + total/arr.length);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr3 = new int [5];   // for dongusu eleman istedik kullanicidan
        System.out.println("Lutfen dizi 3 icin degerleri giriniz");
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = scan.nextInt();
        }
        for(int i = 0;i < arr3.length; i++){    // dizi elemanlarini yazdirdik
           // System.out.println("eleman   " + arr3[i]);
            System.out.println("dizi 3 degerleri   =  " + arr3[i]); // dozonon belli
                                                                    // bir elemanini yazdirma
        }
        mean(arr3);
       // int [] arr1 = {10, 20, 30, 40, 50};
       /* int [] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;
        System.out.println("array 2 nin sifirinci degerei  " + arr2[0]);
        System.out.println("array 1 nin ucuncu elemani degerei  " + arr1[2]);*/
       // for(int i = 0;i < 5; i++) 1 yontem
        //    for(int i = 0;i < arr1.length; i++) // 2 yontem
        {
          //  System.out.println("eleman   " + arr1[i]);  // arr1 dizi ekman goruntuleme dongusu
        }

    }
}
