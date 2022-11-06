package Ders1;
// diziler yeniden
public class Sinif31 {
    public static void main(String[] args) {
        String meyves[] = {"elma", "armut", "cilek"};
        for(String meyve: meyves){
            System.out.println(meyve);      // gor each dongusu ile dizilerde dolanma
        }


        String arabalar[] = {"ford", "honda", "toyota", "range"};
                int len = 0;
                for(String araba: arabalar) len++;
                System.out.println(len);

        String araclar[] = new String[4];
        araclar[0] = "ford";
        araclar[1] = "honda";
        araclar[2] = "toyota";
        araclar[3] = "range";
                for(String arac: araclar){      // benzer ornek
                    System.out.println(arac);

    }
       int numbers [] ={2, 1, 4, 7, 6, 2, 9};
       int number = numbers[2];
       System.out.println(number);  //sonuc 4 dur 2ci eleman
       numbers[2] =85;                  // 85 ejlendi artik 2 eleman 85 4 un yerine
        System.out.println(numbers[2]);
        int index =0;               // dizinin icerigini yazdirma while metot
        while(index < numbers.length){
            System.out.println(numbers[index]);
            index++;
        for (index = 0; index < numbers.length; index++){ // dizinin elemanlari yazdirma for dongusu ile
            System.out.println(numbers[index]);
        }
        }
}

}