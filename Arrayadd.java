import java.util.Scanner;
public class Arrayadd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr2=new int[3];
        int total=0;
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            total+=arr2[i];
        }
    System.out.print(total);
    }
}