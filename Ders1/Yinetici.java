package Ders1;
// mirasci classs inheritence derioud class olarak adlandirilir
// exstends kullanarak miras aliyoruz kalitim1 classindan
public class Yinetici extends Employee {
    private int num_pf_employees;

    public Yinetici(String name, String departman, int id, int num_of_employees) { // sag click constructor
        super(name, departman, id);     // super class
        // ekstra ozellik ekleme yonetici ye bagli calisan sayisi belirleme
        this.num_pf_employees = num_of_employees;

    }
    public void raisesalary(int amount){    //ektra metot ucret gonderme
    System.out.println("Calisanlara   " + amount + "tl  zam yapildi..");
    }
        //owerriding iptal etme miras aldigimiz konsetleri kendine ozgu ozellestirme


    @Override
    public void showinfos() {
       /* System.out.println("isim..." + getName());
        System.out.println("Departman..." + getDepartman());
        System.out.println("ucret..." + getSalary());*/
        // getter setter yontemiyle yilarida get ettigimiz bilgiler emloyee alaninda set edilmis bilgiler
        super.showinfos();      // daha kolay bir yontemle cagirdik
        System.out.println("sorumlu kisi sayisi  " + this.num_pf_employees);
    }

    @Override       // objekt sinifinda owerride etmek
    public String toString() {
        return "Yonetici objesi";
    }
}
