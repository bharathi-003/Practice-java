import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.offer(19);
        q.offer(34);
        q.offer(65);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.contains(50));
    }
}
