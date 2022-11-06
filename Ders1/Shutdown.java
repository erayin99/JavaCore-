package Ders1;

import java.io.*;
import java.util.Scanner;

public class Shutdown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen zaman giriniz:");
        int seconds= scan.nextInt();
        Runtime r = Runtime.getRuntime();
        try {
            System.out.println("Biilgisayar restart edilecek" + seconds +"seconds.");
            r.exec("shutdown -s -t " +seconds);
        }
        catch (IOException e){
            System.out.println("Exception  " + e);
        }
    }
}
