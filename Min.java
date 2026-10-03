import java.util.*;
public class Min{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int arr[]=new int[nums];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}