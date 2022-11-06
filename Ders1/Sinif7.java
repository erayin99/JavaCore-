package Ders1;

import java.util.Scanner;

public class Sinif7
{
    public static void main(String[] args)
    {

        while(true)
        {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Karakter giriniz....");
        s = scan.nextLine();
        if (s.equals("q")){
            System.out.println("Sisyemden cikiliyor....");
            break;


        }
            System.out.println("Islem sonlandirildi....");
        }

    }
}

