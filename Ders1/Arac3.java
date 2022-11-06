package Ders1;

public class Arac3 {
    public static void main(String[] args){
        String s1 = new String("Erdal");
        String s2 = new String("Erdal");
        //if (s1 ==s2)    referanslari sorguladi[i icin esit degil sonucu dondu
        if (s1.equals(s2))  // degerleri sorguladigi ici esit sonucu dondu
        {
            System.out.println("esit");
        }
        else{
            System.out.println("esit degil");
        }
    }
}
