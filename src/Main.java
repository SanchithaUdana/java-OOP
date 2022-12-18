import Object.personalData;
import abstracts.samsung;
import encapsulation.person;
import inheritance.child;
import methordOverriding.daughter;
import superKeyword.son;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        personalData p1 = new personalData();
        // p1.name();

        // Encapsulation part
        // object create to encapsulation class

        person p = new person();

        // set the value to id
        p.setId(20);
        // set the value to name
        p.setName("Sanchitha");

        // print the id value using getters
        System.out.println("id is "+p.getId());
        // print the name value using getters
        System.out.println("name is "+p.getName());

        // used super keyword

        son s = new son();
        son s2 = new son(2);

        // method overriding

        daughter d = new daughter();

        d.phone();  // override method
        d.id();     // non-override method


        // abstract
        // we can not create object using abstract class

        samsung ph = new samsung();
        ph.call();
        ph.sleep();
        ph.vibrate();
        ph.talk();






    }
}