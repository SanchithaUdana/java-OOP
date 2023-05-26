package interfaces;

public class dog implements animal,animaldata,data{   // multiple implements

    @Override
    public void data() {
        System.out.println("Data");
    }

    @Override
    public void run(){
        System.out.println("in multiple implements");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void getup(){
        System.out.println("get up");
    }

}

