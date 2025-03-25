package src.main.java;

class A1{
    int countA;

    void display(){
        System.out.println(countA);

    }
}

class B1 extends A1{
    int countB;

    void display(){
        System.out.println(countB);
        System.out.println(countA);
    }
}

public class AccessModifiers {

    public static void main(String[] args) {

        B1 b = new B1();
        b.display();
    }
}
