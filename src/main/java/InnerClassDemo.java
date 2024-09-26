package src.main.java;

class Vehicle{

    void display(){
        System.out.println("I'm in Vehicle class");
    }

    static class Person{

        void display(){
            System.out.println("I'm in person class");
        }
    }

}



public class InnerClassDemo {

    public static void main(String[] args) {

        Vehicle.Person p = new Vehicle.Person();
        p.display();

    }
}
