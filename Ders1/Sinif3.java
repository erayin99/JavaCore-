package Ders1;

import java.util.Scanner;

public class Sinif3 {
    public static void main(String[] args){
        // kullanici parola giris
        String sys_kul_adi = "erdal";
        String parola = "1234";
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanici adi giriniz");
        String kullanici_adi = scan.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("parola giriniz");
        String kullanici_parola = scan2.nextLine();

        if (!(sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kullanici_parola))){
            System.out.println("Kullanici adi ve parola yanlistir");
        }
        else if((sys_kul_adi.equals(kullanici_adi)) && !(parola.equals(kullanici_parola))){
            System.out.println("parola yanlistir");
        }
        else if(!(sys_kul_adi.equals(kullanici_adi)) && (parola.equals(kullanici_parola))){
            System.out.println("parola yanlistir");
        }

        else{
            System.out.println("Sisteme giris yaptiniz");
        }
    }
}

