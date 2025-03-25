package src.main.java;

interface Test{
    int display();
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {


        Test t  = () -> 1;
        System.out.println(t.display());
    }
}
