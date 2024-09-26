package src.main.java;

class EagerSingleton{

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

public class EagerSingletonTest {

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance());
    }
}
