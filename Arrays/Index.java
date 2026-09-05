import java.util.*;
public class Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] arr={1,2,3,4,5};
       int arr1[]=new int[5];
       for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
       }
    }
}
