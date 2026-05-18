import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] arr={1,2,3,4,5};
       int arr1[]=new int[5];
       int sum=0;
       for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<5;i++){
        sum+=arr[i];
            
       }
        System.out.print("Sum:"+sum);
    }
}
