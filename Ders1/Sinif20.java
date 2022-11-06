package Ders1;

public class Sinif20 {
   public static int fib(int n){
        if (n==1) return 1; //recursive fonksiyon
        if (n==0) return 1;
        return fib(n - 1) + fib(n -2);

    }
    public static void main(String[] args) {
       for (int i = 0; i < 10; i++)
    System.out.println(fib(i));
    }
}
