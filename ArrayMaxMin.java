import java.util.Scanner;
public class ArrayMaxMin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum no:"+min);
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum no:"+max);
    }
}