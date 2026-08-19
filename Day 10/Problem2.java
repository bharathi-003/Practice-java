class NumberThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
public class Problem2{
    public static void main(String[] args) {
        NumberThread t=new NumberThread();
        t.start();
    }
}