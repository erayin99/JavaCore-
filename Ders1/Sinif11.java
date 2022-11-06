package Ders1;
// fonksiyonlarda return tanimlama



public class Sinif11 {
    public static int Ucilecarp(int a){
        return (a * 3);

    }
    public static int Ilitopla(int a){
        return (a + 2);
    }
    public static int Dortcikar(int a){
        return (a - 4);
    }
    public static void main(String[] args){
        System.out.println("Sonuc" + Dortcikar(Ilitopla(Ucilecarp(4))));
            // fonksiyonlar ic ice tanimlanmistir
            // deger donduren fonksiyonlar
    }
}
