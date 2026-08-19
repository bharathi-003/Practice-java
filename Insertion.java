public class Insertion{
    public static void main(String[] args) {
        int [] arr=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=40;
        arr[3]=50;
        arr[4]=60;
        int position=2;
        int value=30;
       
        for(int i=4;i>=position;i--){
            arr[i+1]=arr[i];
        }
        arr[position]=value;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}