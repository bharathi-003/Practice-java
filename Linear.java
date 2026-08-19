import java.util.*;
public class Linear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int count=0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]==key){
                count++;
                System.out.println(i);
                break;
            }
        }
        if(count==0){
            System.out.println("invalid number");
        }
    }
}
