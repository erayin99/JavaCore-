package Ders1;
import javax.swing.*; //ilk satir importu

public class Sunuf23 extends JApplet {
    public static void main(String[] args) {
        // mesaj kutusu yadirma
        JOptionPane.showMessageDialog(null, "java sinifina hosgeldiniz");
        // INPUT GIRIS MESAJ YAZDIR
        String isim = JOptionPane.showInputDialog("Lutfen isminizi giriniz");
        JOptionPane.showMessageDialog(null, "java sinifina hosgeldiniz.." + isim,
                "hosgeldiniz ISW PROGRAMI", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    }










