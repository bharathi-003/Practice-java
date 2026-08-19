import java.util.*;
public class NullExcep {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //nullpointerException
        try{
        String value =null;
        System.out.println(value.length());
        }
        catch(NullPointerException e){
            System.out.println("There is no element to get length");
        }
    }
}

