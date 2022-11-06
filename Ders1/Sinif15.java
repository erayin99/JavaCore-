package Ders1;

public class Sinif15 {
    public static void main(String[] args){
        IDatabase database = new Customer();    //YONTEM 2
        IDatabase database1 = new Student();

     //   Customer customer = new Customer();   // yontem 1
       // Student student = new Student();
       // student.log();
        // customer.log();
        database.log();
        database1.log();


    }
}
