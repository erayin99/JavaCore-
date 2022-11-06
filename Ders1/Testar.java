package Ders1;

import java.util.Scanner;

public class Testar {
    public static int kel_say(String str){
        int sayac = 0;
        if(!(" ".equals(str.substring(0, 1))) || !(" ".equals((str.substring(str.length() -1))))){
            for (int i =0;i <str.length();i++){
                if (str.charAt(i) == ' '){
                    sayac++;
                }
            }
            sayac = sayac +1;
        }
        return sayac;
    }

    public static void main(String[] args) {
        int  tr, mat, fen, sos, beden;


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dersleri giriniz...");
        String str = scan.nextLine();
        kel_say(str);
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


        double ortalama = (tr + mat + fen + sos + beden)/kel_say(str);

        if(ortalama >= 60){
            System.out.println("Sinifi gectiniz..."+ ortalama);

        }
        else{
            System.out.println("Sinifta kaldiniz..." + ortalama);
        }

    }
}

