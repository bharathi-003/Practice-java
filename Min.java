import java.util.*;
public class Min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
          int min=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("min:"+min);
    }
}