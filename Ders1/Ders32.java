package Ders1;


import java.util.Scanner;

public class Ders32 {
    public static void main(String[] args) {
    int num, temp, digits =0, rem, remTemp, r, rev =0, digitsTemp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz...");
        num = scan.nextInt();
        temp =num;
        while (temp >0){
            digits++;
            temp = temp/10;

        }
        if (digits <2){
            System.out.println("\n Interchange mumkun degil");
        } else if (digits ==2) {

        }
        temp =num;
        while (temp >0){
            rem =temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;

        }
        r = rev;
        rev =0;
        temp = num;
        digitsTemp = digits;
        while(temp>0){
            remTemp = r%10;
            if (digitsTemp == digits || digitsTemp ==1){
                rem = temp%10;
                rev = (rev*10) +rem;
            }
            else {
                rev = (rev*10) +remTemp;
            }
            r = r/10;
            temp = temp/10;
            digitsTemp++;
        }
        System.out.println("\n ilk ve son interchabge basarili");
        System.out.println("\n yeni numara" + rev);
    }
}
