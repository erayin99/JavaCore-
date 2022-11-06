package Ders1;
// ARRAYLIST
import java.util.*;

public class Sinif22 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("IZMIR");
        list.add("ISTANBUL");
        list.add("ISPARTA");
        list.add("IGDIR");
        System.out.println(list);
        System.out.println("3 : " + list.get(3));
        System.out.println("0 : " + list.get(0));
        List b = new ArrayList();   // list arraylistesini b arraylisyesine ekledik
        b.addAll(list);
        System.out.println(b);
        System.out.println(b.isEmpty()); // b listesi bosmu sorutor
        System.out.println(b.contains("IZMIR")); //LISTEDE izmir ADINDA BIR DEGER VARMI SORUYOR
        b.add(2, "IZMIT"); // LISTEYE IZMITI 2 DEGERE EKLEDI
        System.out.println(b.indexOf("IZMIT")); // IZMIT NESNESININ INDEKS SAYIS=AINI YAZDI
        b.set(3, "GOZTEPE");  // 3 NESNEYI SILIP YERINE GOZTEPE NESNESINI EKLEDI
        System.out.println(b.lastIndexOf("KAYSERI")); //LISTEDE TANIMLI OLMADIGI ICIN -1 DEGER DONDU
        System.out.println(b.size()); // ARRAYLISTIN SIZE INI VERIYOR
        System.out.println(b);
        b.remove(2); // L'stedeki 2. degeri siliyoruz
        b.clear(); // l'stenin butuun elemanlarini s'ler




    }
}
