package Ders1;

import java.util.Scanner;

public class Sinif26 {
    public static void main(String[] args) {
        int r;
        double alan, hacim, pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("daire capini giriniz");
        r = scan.nextInt();
        alan = (2* pi * r);
        hacim = pi * (r*r);
        System.out.println(alan);
        System.out.println(hacim);

    }
}
