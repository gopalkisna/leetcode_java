package src.main.java;

public class FinalizeDemo {

    public static void main(String[] args) {

        try{
            int a = 5/0;
        }catch(Exception ex){

            throw ex;
        }finally {
            //System.exit(0);
            System.out.println("Finally block");
            System.out.println("Finally block");
            System.out.println("Finally block");
        }
    }
}
