package Ders1;

import java.util.Scanner;


public class Sinif28 {
    public static int dersler(int a, int b, int c, int d, int e){

        return (a+b+c+d+e);
    }
    public static void main(String[] args) {

        int  tr =1, mat = 1, fen = 1, sos = 1, beden = 1 ;
        int ders = dersler(tr, mat, fen, sos, beden);

        Scanner scan = new Scanner(System.in);
        System.out.println("turkce notunuzu giriniz..");
        tr = scan.nextInt();
        System.out.println("matematik notunuzu giriniz..");
        mat = scan.nextInt();
        System.out.println("fen bilgisi notunuzu giriniz..");
        fen = scan.nextInt();
        System.out.println("sosyal vilgiler notunuzu giriniz..");
        sos = scan.nextInt();
        System.out.println("beden egitimi notunuzu giriniz..");
        beden = scan.nextInt();


        double ortalama = (tr + mat + fen + sos + beden)/ders;

        if(ortalama >= 60){
            System.out.println("Sinifi gectiniz..."+ ortalama);

    }
        else{
            System.out.println("Sinifta kaldiniz..." + ortalama);
        }

    }
}
