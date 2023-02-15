package interfaces;

public interface animal {

    // by default in interface methods are  abstract and public
    // abstract method have not a body
    // interface can not create an object
    // interface not have constructor
    // we can not inherit interface using extends keyword , but we use implements keyword to inherit
    // can not include non-abstract methods
    // can use multiple implements

    void sleep();
    void eat();
    void getup();

    // we can give body part in only default and static methods
    default void newmethod(){
        System.out.println("in default");
    }

    static void newmethod1(){
        System.out.println("in static");
    }




}
