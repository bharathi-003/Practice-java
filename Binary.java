import java.util.ArrayList;
import java.util.Collections;

public class Binary { public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(1);//10 2 3 1
        int position=Collections.binarySearch(list, 2);
        System.out.println(position);
    }
}
