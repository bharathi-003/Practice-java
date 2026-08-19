import java.util.*;
public class Demo {
    public static void main(String[] args) {
    ArrayList<String> fruits= new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("mango");
    fruits.remove(1);
    fruits.addFirst("Grapes");
    System.out.println(fruits);
    
    }
}