import java.util.Vector;

public class Vec{
    public static void main(String[] args) {
        Vector<Integer>arr=new Vector<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.get(2));
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}