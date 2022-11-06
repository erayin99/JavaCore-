package Ders1;
//owerloading islemler
public class Sinif12 {
    public static void Toplam(int a, int b, int c){
        // ilk yazilan fonksiyo
        System.out.println("TOPLAMLARI  =  " + (a + b +c));
    }
    public static void Toplam(int a, int b){
        // fonksiyondan turetilme yapliyor owerloading ayni isimle cagrilabiliyor
        System.out.println("TOPLAMLARI  =  " + (a + b));
    }
    public static void main(String[] args){
        Toplam(3, 4, 5);
        Toplam(3, 4);
            // owerloading edilme islemi yapilmasi na bir ornek
    }
}
