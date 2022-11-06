package Ders1;

import javax.xml.transform.sax.SAXResult;

public class Kalitim1 {
    // mirasci classs inheritence derioud class olarak adlandirilir
    public static void main(String[] args){
        // obje olusturma islemi
       /* Employee employee = new Employee("Erdal Ayin", "Bilgi sistemleri", 4500);
         //       employee.showinfos();*/

        Yinetici yonet = new Yinetici("erdal ayin", "bilgi sistemleri", 5000, 10);
        //pollymorphism cok bicimlilik
        // daha once tanimlayip owerride ettigimiz employee gibi calisma yapiyor
       Employee employee =new Yinetici("Erdal atin", "Blgi sistemleri", 5000, 10);
       employee.showinfos();
        /* yonet.showinfos();
        yonet.raisesalary(100);98*/
        System.out.println(yonet);
    }

}
