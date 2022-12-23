import Object.personalData;
import abstracts.samsung;
import encapsulation.person;
import interfaces.animal;
import interfaces.dog;
import methordOverriding.daughter;
import superKeyword.son;


class Bike{
    void run(){
        System.out.println("bike is running");
    }
}

class yamaha extends Bike{
    @Override
    void run(){
        System.out.println("yamaha bike is running");
    }

    void demo(){
        System.out.println("bike bike");
    }
}


// multi level inherit example (using extends)

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("dog is eating");
    }
}

class BabyDog extends Dog{
    @Override
    void eat(){
        System.out.println("Baby Dog is eating");
    }
}


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

        // final keyword

        finalKeyword k = new finalKeyword();
        k.laps = 15;

        System.out.println(k.laps);
        System.out.println(k.race);  // final instant variable

        k.school();  // final method

        // interfaces

        dog ui = new dog();
        ui.eat();
        ui.sleep();
        ui.getup();
        ui.newmethod();  // default method in interface
        // we can call to static method using interface name and static method name
        animal.newmethod1();  // static method can access via interface

        // --> run time polymorphism

        // we can say dynamic method dispatch to run time polymorphism
        // we use overloading and overriding concept to do polymorphism concept

        Bike z = new yamaha();
        z.run();
        yamaha hh = new yamaha();
        hh.demo();

        // multi level inherit
        Animal a1,a2,a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();

        a1.eat();
        a2.eat();
        a3.eat();








    }
}