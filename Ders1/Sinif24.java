package Ders1;
import javax.swing.*;
public class Sinif24 {
    public static void main(String[] args) {
        // imputlara giris yapip mesage dan sonuc alma
      int number1;
      int number2;
      int toplam;
      number1 = Integer.parseInt(JOptionPane.showInputDialog("ilk gercej sayiyi gir"));
      number2 = Integer.parseInt(JOptionPane.showInputDialog("ikinci gercej sayiyi gir"));
      toplam = (number1 + number2);
      JOptionPane.showMessageDialog(null, "TOPLAM = " + toplam);

    }
}
