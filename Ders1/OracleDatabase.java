package Ders1;

public class OracleDatabase implements IDatabase2{
    @Override
    public void add() {
        System.out.println("Oracle ekleme");
    }

    @Override
    public void delete() {
        System.out.println("Oracle solme ");
    }

    @Override
    public void get() {
        System.out.println("Oracle elde etme");
    }

    @Override
    public void update() {
        System.out.println("Oracle guncelleme");
    }
}
