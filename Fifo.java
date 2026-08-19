import java.util.LinkedList;
import java.util.Queue;

public class Fifo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(45);
        queue.add(77);
        queue.add(61);
        queue.offer(88);
        System.out.println(queue);
        int k = queue.poll();
        System.out.println(queue);
        int g = queue.peek();
        System.out.println(g);
        System.out.println(queue);
        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()) {
            int q = queue.poll();
            System.out.println(q);
        }
    }
}