package src.main.java;

class Fruit implements Cloneable{
    int id;
    String name;

    public Fruit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Fruit clone = (Fruit) super.clone();
        //clone.id = this.id;
        //clone.name = this.name;
        return clone;
    }

}

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit fruit = new Fruit(123, "gopal");
        System.out.println(fruit);
        System.out.println(fruit.clone());
    }
}
