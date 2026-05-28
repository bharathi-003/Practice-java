import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashSet <Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(140);
        s.add(100);
        s.add(10);
        System.out.println(s);
        s.remove(100);
        System.out.println(s);
        System.out.println(s.size());
    }
}