public class Time {
    public static void main(String[] args) throws InterruptedException {
        for(int hour=0;hour<24;hour++){
            for(int min=0;min<60;min++){
                for(int sec=0;sec<60;sec++){
                    System.out.println(hour + ":" + min + ":" + sec);
                    Thread.sleep(1000);
                }
            }
        }
    }
}
