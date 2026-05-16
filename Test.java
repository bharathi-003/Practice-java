import java.util.*;
public class Test {
    public static void main(String[] args) {
        String s="Java python C++";
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
