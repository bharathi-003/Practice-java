class Demo implements Runnable{
    public void run(){
        try{
            for(int i=0;i<=5;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        }catch(InterruptedException e){
        }
    }
}
public class SleepThread{
    public static void main(String[] args) {
        Demo d=new Demo();
        Thread t=new Thread(d);
        t.start();
    }
}