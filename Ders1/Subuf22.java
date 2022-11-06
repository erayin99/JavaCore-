package Ders1;

public class Subuf22 {
    public static void main(String[] args) {
        String s = "Benim adim Sadi Evren Seker";
        // dizgi katar
       // s= s.toUpperCase(); // buyuk harfe cevirme
       // s= s.toLowerCase(); // kucuk harfe cevirme
        // System.out.println(s);
        int IlkNosluk = s.indexOf(" "); // ilkbosluk degerini yazar
        String IlkKelime = s.substring(0, IlkNosluk); // ilk kelimeyi yazar
        int Sonbosluk = s.lastIndexOf(" "); // son boslik bulunur
        String Sonkelime = s.substring(Sonbosluk); //son bosluktan sonra son kelime bulunur
        System.out.println(Sonkelime);
       System.out.println("10. KARAKTER   " + s.charAt(12)); //yukaridaki metinde karakter arama


    }
}
