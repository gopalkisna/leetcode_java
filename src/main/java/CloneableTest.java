package src.main.java;

class Movie implements Cloneable{

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
     public Cloneable clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class CloneableTest {


    public static void main(String[] args) {

        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

    }
}
