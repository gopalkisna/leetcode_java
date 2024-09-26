package src.main.java;

class A{

    private int id;
    A(int id){
        this.id=id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class EqualsHashcode {

    public static void main(String[] args) {

        A a = new A(12);

        System.out.println(a);
        System.out.println(a.hashCode());

    }
}
