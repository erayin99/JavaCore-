package Ders1;

public class MySql implements IDatabase2{


    @Override
    public void add() {
        System.out.println("MuSql ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MuSql silme");
    }

    @Override
    public void get() {
        System.out.println("MuSql elde etme");
    }

    @Override
    public void update() {
        System.out.println("MuSql guncelleme");
    }
}
