package Ders1;

public class Araba2 {
    private String color;
    private String model;
    private double engine;
    private int doors;
    public Araba2(){
       /* this.color = "bos";
        this.model = "bos";     // contructor owerloading yontem 1
        this.engine = 0;
        this.doors = 0;*/
        this("bos", "Vos", 0, 0);   // owerloading yaptik contructor yontem 2
    }
    public Araba2(String color, String model, double engine, int doors){
        //constructor olusturna ve atana
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;

    }
    public void show(){
        System.out.println("Arabanin rengi    " + this.color);
        System.out.println("Arabanin modeli    " + this.model);
        System.out.println("Arabanin motoru    " + this.engine);
        System.out.println("Arabanin kapi sayisi    " + this.doors);
    }

}





