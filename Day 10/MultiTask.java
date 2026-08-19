class ItThread extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
}
public class MultiTask{
    public static void main(String[] args) {
        ItThread t=new ItThread();
        t.start();
    }
}