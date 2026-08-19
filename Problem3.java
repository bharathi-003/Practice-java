class MessageTask implements Runnable{
   public void run(){
    for (int i=0;i<=5;i++){
        String a="Learning java Multithreading";
        System.out.println(a);
    }
   } 
}
public class Problem3{
    public static void main(String[] args) {
        MessageTask m=new MessageTask();
        Thread t=new Thread(m);
        t.start();
    }
}