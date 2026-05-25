import java.util.*;
public class Accesnding {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);///accending order
        System.out.println(list);
        Collections.reverse(list);//reverse
        System.out.println(list);
    }
}
