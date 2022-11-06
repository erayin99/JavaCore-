package Ders1;
//import org.apache.commons..lang.ArrayUtils;

public class Dizi4 {
    public static void main(String[] args) {
        int numbers[] = {4, 9, 7, 3, 2, 8};
        int element = 2;
        int index = -1;
        int i =0;
        while (i < numbers.length){
            if (numbers[i] ==element){
                index = i;
                break;
            }
            i++;
        }
            System.out.println("indeksi" + element + "ve" + index);
        for(i = 0; i <numbers.length; i++){
            if (numbers[i] ==element){
                index = i;
                break;
            }
        }
        System.out.println("indeksi" + element + "ve" + index);

       /* int elemente = 2;
        int indeks = ArraUtils.indexOf(numbers, elemente);
        System.out.println("indeksi" + elemente + "ve" + index); */
    }
}
