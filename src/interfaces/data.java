package interfaces;

public interface data {
    void data();
    default void data1(){
        System.out.println("default function in interface");
    }

    static void data2(){
        System.out.println("static function in interface");
    }
}
