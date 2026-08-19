import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowsize=sc.nextInt();
        int colsize=sc.nextInt();
        int arr[][]=new int[rowsize][colsize];
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                System.out.print(arr[i][j]+" ");
            }
              System.out.println();
        }
       }
}
