package Ders1;

public class Mongo extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mongo guncelledi...");
    }

    @Override
    void get() {
        System.out.println("Mongo elde etti...");
    }
}
