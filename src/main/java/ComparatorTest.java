package src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
    String name;
    int productId;

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }
}

public class ComparatorTest
{
    public static void main(String[] args) {


        Product p1 = new Product("a", 123);
        Product p2 = new Product("b", 456);
        Product p3 = new Product(null, 789);


        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);


       // Collections.sort(productList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(productList, Comparator.comparing(Product::getName));


        System.out.println(productList);

    }
}
