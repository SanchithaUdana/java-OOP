import Object.personalData;
import encapsulation.person;
import inheritance.child;

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





    }
}