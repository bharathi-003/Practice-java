import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr1={1,2,3,4,5};
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}