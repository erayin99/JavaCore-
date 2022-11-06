package Ders1;

public class Sinif14 {
    public static void main(String[] args){
        // STRING SINIFI
        String s1 = "Mustafa";          // STRING TANIM LAMA
        String s2 = new String("Mystafa");      //STRING CLASS
        System.out.println(s2.length()); // s2 string uzunlugunu bulma
        System.out.println(s2.charAt(0));
        System.out.println(s2.charAt(4));
        System.out.println(s2.charAt(s2.length()-1));
        System.out.println(s2.startsWith("Mu"));
        System.out.println(s2.endsWith("fa"));
    }
}
