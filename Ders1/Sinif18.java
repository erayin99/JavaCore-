package Ders1;

public class Sinif18 {
    public static void main(String[] args) {
    AbstractDatabase abstractDatabase = new NySQLDatabase();
    AbstractDatabase abstractDatabase2 = new Mongo();
    abstractDatabase2.add();
    }
}

