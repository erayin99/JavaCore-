package Ders1;
/* PRIVATE OLARAK TANIMLADIK BU SEFER VE ERISIM OLMAYACAGI ICIN
DOLAYLI ERISIM YAPIP PUBLIC BIR TANIMLAMA YAPITORUZ
 */

public class Araba1 {
    private String color;
    private String model;
    private double engine;
    private int doors;
    // setter getter netotlari kullanarak dolayli erisim saglamir
    // sag click generate  getter setter
    public void setColor(String color){
        this.color = color;

    }
    public String getColor(){
        return this.color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors == 4){
            this.doors = doors;
        }
        else{
            System.out.println("Kapi sayisi 4 olmak zorundadir...");
        }
    }
    public void start(){
        System.out.println("Araba calisti...");
    }
    public void stop(){
        System.out.println("Araba durdu....");
    }
}
