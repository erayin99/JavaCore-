package Ders1;

public class NySQLDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mysql guncelledi...");
    }

    @Override
    void get() {
        System.out.println("Mysql elde etti...");
    }
}
