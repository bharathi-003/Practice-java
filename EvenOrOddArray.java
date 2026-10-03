import java.util.*;
public class EvenOrOddArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int []arr=new int[nums];
        int even=arr[0];
        int odd=arr[0];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}