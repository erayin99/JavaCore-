package Ders1;

import java.util.Scanner;

public class Sinif1 {
    // if kosulu ornek
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int a = scan.nextInt();
        if (a > 90){

            System.out.println("Tebrikler dersten AA ile gectiniz");
        }
        else if (a > 85){
            System.out.println("Tebrikler dersten BA ile gectiniz");
        }
        else if (a > 70){
            System.out.println("Tebrikler dersten BB ile gectiniz");
        }
        else{
            System.out.println("Malesef dersten kaldiniz");
        }

         }

        }