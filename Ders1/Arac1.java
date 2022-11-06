package Ders1;

public class Arac1 {
    public static void main(String[] args){
        Araba1 Car1 = new Araba1();
        Car1.setColor("Gumus");
        Car1.setModel("Megane");
        Car1.setEngine(1.6);
        Car1.setDoors(4);
        System.out.println("Arabanin rengi" + Car1.getColor());
        System.out.println("Arabanin modeli" + Car1.getModel());
        System.out.println("Arabanin motor hacmi" + Car1.getEngine());
        System.out.println("Arabanin kapi sayisi" + Car1.getDoors());
        Car1.start();
        Car1.stop();
    }


}
