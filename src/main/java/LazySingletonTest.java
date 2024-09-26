package src.main.java;

class LazySingleton{
    private static volatile LazySingleton instance = null;
    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

public class LazySingletonTest {

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
    }
}
