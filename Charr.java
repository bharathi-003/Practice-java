import java.util.*;

public class Charr{
    public static void main(String[] args) {
        PriorityQueue<Character> pq=new PriorityQueue<>();
        pq.offer('b');
        pq.offer('a');
        pq.offer('c');
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
