public class Neglitnegative{
    public static void main(String[] args) {
        int [] arr={10,20,-30,40};
        for(int i=0;i<=arr.length;i++){
            if(arr[i]<0){
                break;
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}