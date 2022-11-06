package Ders1;

// inhertence bir klasin baska bir classdan ozelliklerini miras almasidir
//super vlass yada base class denir.
public class Employee {
    private String name;
    private String departman;
    private int salary;

    public Employee(String name, String departman, int salary) {  // constructor yaz sag click constructor
        this.name = name;
        this.departman = departman;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showinfos(){   // fonksiyon tanimla
        System.out.println("Bilgiler...");
        System.out.println("isim..." + this.name);
        System.out.println("Departman..." + this.departman);
        System.out.println("ucret..." + this.salary);
    };

}
