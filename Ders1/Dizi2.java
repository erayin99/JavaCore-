package Ders1;
// cok boyutlu array
public class Dizi2 {
    public static void main(String[] args){
        int [][] arr = {{10, 20, 30},{40, 50, 60}};
        int [][] arr2 = new int [2][3];
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;
        for(int i = 0; i < 2; i++){     //for dongusu ile arr2 elemanlari yazdirma
            for(int j =0; j< 3;j++){
            System.out.println("Eleman   " + arr2[i][j]);
            }
        }

       /* System.out.println("COK BOYUTLU 0, 0 DEGER  " + arr[0] [0]);
        System.out.println("COK BOYUTLU 1, 2 DEGER  " + arr[1] [2]);*/
    }
}
