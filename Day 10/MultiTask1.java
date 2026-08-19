class ItThread extends Thread{
    public void run(){
        System.out.println("Inside Thread");
    }
}
public class MultiTask1{
    public static void main(String[] args) {
        ItThread t=new ItThread();
        t.start();
        System.out.println("Main Thread");
    }
}