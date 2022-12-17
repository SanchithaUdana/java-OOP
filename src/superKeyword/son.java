package superKeyword;

public class son extends father {

    // default constructor
    public son() {
        super();
        System.out.println("default constructor in son class");
    }

    // parameterized constructor
    public son(int a){
        super(5);
        System.out.println("parameterized constructor in son class");
    }

}


