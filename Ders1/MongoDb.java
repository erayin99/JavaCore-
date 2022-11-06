package Ders1;

public class MongoDb implements IDatabase2{

    @Override
    public void add() {
        System.out.println("Mongodb ekleme");
    }

    @Override
    public void delete() {
        System.out.println("Mongodb silme");
    }

    @Override
    public void get() {
        System.out.println("Mongodb elde etme");
    }

    @Override
    public void update() {
        System.out.println("Mongodb guncelleme");
    }
}
