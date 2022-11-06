package Ders1;

import javax.lang.model.type.NullType;

public class Arac2 {
    public static void main(String[] args){
        Araba2 Car1 = new Araba2("Gumus", "Megane", 1.6, 4);
      //  Araba2 Car2 = new Araba2();
        Araba2 Car2 = Car1;
        Car2.show();




    }


}

