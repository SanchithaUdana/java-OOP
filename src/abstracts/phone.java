package abstracts;

public abstract class phone {
    // abstract method has not method body
    // we can not create object relevant abstract classes
    // can include abstract methods or non-abstract methods
    // if we need to use abstract methods, so we must inherit abstract class to other java class

    public abstract void call();   // abstract method
    public abstract void sleep();
    public abstract void vibrate();
    public void talk(){             // non-abstract method
        System.out.println("can call");
    }





}
