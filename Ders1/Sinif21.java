package Ders1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Sinif21 {
    public static void main(String[] args) {


        File f = new File("C:\\Users\\jawa erdal\\Desktop\\ERDAL JAVA\\a.txt");

        try{
        FileReader fr = new FileReader(f);
        int c = fr.read();
        while( c !=-1){
            char k = (char)c;
            System.out.print(k + " ");
            c = fr.read();
        }
            fr.close();
        f = new File("C:\\Users\\jawa erdal\\Desktop\\ERDAL JAVA\\a.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
        System.out.println(br.readLine());
        br.close();
        File cikti = new File("C:\\Users\\jawa erdal\\Desktop\\ERDAL JAVA\\cikti.txt");
            FileWriter fw = new FileWriter(cikti);
            fw.write("deneme mesaji");
            fw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
