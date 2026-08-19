
import java.util.ArrayList;


//     public static void main(String[] args) {
//         ArrayList<String> fruits=new ArrayList<>();
//         fruits.add("Apple");
//         fruits.add("orange");
//         fruits.add("mango");
//         fruits.add("banana");
//         fruits.add("Grappes");
//         System.out.println(fruits);
//         System.out.println(fruits.size());
//         System.out.println(fruits.get(2));
//         System.out.println(fruits.remove(3));
//         System.out.println(fruits);
//         System.out.println(fruits.contains("orange"));
//         System.out.println(fruits.contains("Avagado"));
//     }
// }
public class Listt{
    public static void main(String[] args) {
        ArrayList <Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        num.set(1,60);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.get(3));
        System.out.println(num.remove(4));
        System.out.println(num);
        System.out.println(num.contains(40));
        
    }
}