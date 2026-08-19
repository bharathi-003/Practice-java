import java.util.*;

public class index {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println("0 index value="+list.get(0));
         System.out.println("Total Size="+list.size());
         System.out.println(list.remove(2));
         System.out.println(list.contains(20));
        for(int value:list){
            System.out.println(value+" ");
        }
    }
}
