
import java.util.HashMap;

public class HashhMap{
    public static void main(String[] args) {
        HashMap<Integer,String> Students=new HashMap<>();
        Students.put((101),("Rio"));
        Students.put((102),("Jasvanth"));
        Students.put((103),("Alice"));
        System.out.println(Students);
        System.out.println(Students.size());
        System.out.println(Students.containsKey(102));
        System.out.println(Students.containsValue("Alice"));
        System.out.println(Students.get(102));
        System.out.println(Students.remove(101));
        System.out.println(Students.size());
    }
}