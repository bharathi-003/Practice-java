import java.util.*;
public class Evenandodd {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(3);
        int odd=0;
        int even=0;
        for(int value:list){
            if(value%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
           System.out.print(even+" ");
        System.out.print(odd+" ");
    }
}
