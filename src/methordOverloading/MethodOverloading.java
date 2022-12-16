package methordOverloading;

public class MethodOverloading {

    int year;
    int month;
    int day;

    public void age(){
        System.out.println("non parameters");
    }

    public void age(int year){
        System.out.println("one parameter");
    }

    public void age(int month,int day){
        System.out.println("two parameters");
    }

    public void age(int year, int month, int day){
        System.out.println("three parameters");
    }

    // in this all methods named as 'age' but they have different types og parameters patters.
    // so we can say this is the method overloading concept in OOP concept

}
