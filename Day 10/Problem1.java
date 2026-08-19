
import java.util.LinkedList;
import java.util.Queue;

public class Problem1{
 public static void main(String[] args) {
     Queue<String> q=new LinkedList<>();
     q.offer("Naruto");
     q.offer("Minato");
     q.offer("Boruto");
     q.offer("Kakashi");
     q.offer("Itachi");
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.poll());
    System.out.println(q);
 }
}