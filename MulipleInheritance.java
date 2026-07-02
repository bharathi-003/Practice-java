interface Camera{
    void click();
}
interface MusicPlayer{
    void playmusic();
}
class Phone implements Camera,MusicPlayer{
    public void click(){
        System.out.println("photo click");
    }
    public void playmusic(){
        System.out.println("playing music");
    }
}
public class MulipleInheritance{
public static void main(String[] args) {
    Phone p=new Phone();
    p.click();
    p.playmusic();
}
}
