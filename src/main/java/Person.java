package src.main.java;

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.name = this.name;
        clone.age = this.age;
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("John Doe", 30);
        Person clone = (Person) person.clone();

        System.out.println(person == clone); // false
        System.out.println(person.name.equals(clone.name)); // true
        System.out.println(person.age == clone.age); // true
    }
}