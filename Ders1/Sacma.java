package Ders1;

import java.io.IOException;
import java.util.Scanner;

public class Sacma {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Lutfen zaman giriniz:");
      int sec= scan.nextInt();
      Runtime r = Runtime.getRuntime();
      try {
          System.out.println("Biilgisayar restart edilecek" + sec +"saniye sonra");
          r.exec("shutdown -r -t " +sec);
      }
      catch (IOException e){
          System.out.println("Exception  " + e);
    }

 }
}