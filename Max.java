import java.util.Scanner;
public class Max{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int max=arr[0];
        int second=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                second=max;
                max=arr[i];
            }
            else if(arr[i] > second&& arr[i] != max) {
                second = arr[i];
            }

        }
        System.out.println(max+" is the largest");
        System.out.println(second+" is the second largest");
    }
}