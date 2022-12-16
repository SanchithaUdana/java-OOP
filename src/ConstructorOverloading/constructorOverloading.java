package ConstructorOverloading;

public class constructorOverloading {

    String name;
    int age;

    public constructorOverloading() {
    }

    public constructorOverloading(String name) {
        this.name = name;
    }

    public constructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // in above code set have three types of constructors. the first type is the default constructor
    // other two constructors have different parameters
    // this is the constructors overloading method in OOP concept in java



}
