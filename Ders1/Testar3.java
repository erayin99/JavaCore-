package Ders1;

public class Testar3 {
    public static void main(String[] args) {
        String test = "bu nasil 1112235 bir,. koddur, 22.15 ";
        saydir(test);
    }
    public static void saydir(String e){
        char[] ch = e.toCharArray();
        int harf = 0;
        int bosluk = 0;
        int num =0;
        int diger = 0;
        for (int i = 0;i < e.length(); i++){
            if (Character.isLetter(ch[i])){
                harf++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                bosluk++;
            }
            else
                diger++;
        }
        System.out.println("bu sozlukler : Aa kiu i swd 23587 kiu:, sieo >>25.33 ");
        System.out.println("lharfler  " + harf);
        System.out.println("numara  " + num);
        System.out.println("lbosluk  " + bosluk);
        System.out.println("diger  " + diger);
        }

    }

