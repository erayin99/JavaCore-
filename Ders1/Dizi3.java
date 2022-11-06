package Ders1;

public class Dizi3 {
    public static void main(String[] args) {
        Car cars[] = new Car[4];
        cars[0] = new Car("Toyota", 56600);
        cars[1] = new Car("honda", 56600);
        cars[2] = new Car("Tata", 56600);
        cars[3] = new Car("Hyundai", 56600);
        for (Car car:cars)car.printDetails();

    }
}
class Car{
    public String name;
    public int miles;

    public Car(String name, int miles) {
        this.name = name;
        this.miles = miles;
    }
    public  void printDetails(){
        System.out.println(name + "..." + miles);
    }
}
