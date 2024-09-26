package src.main.java;

interface Test{
    void display();
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {


        Test t  = () -> System.out.print("Hi...");
        t.display();
    }
}
