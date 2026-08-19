import java.io.*;

public class FileeHandleing{
    public static void main(String[] args) {
        try {
            File f=new File("Students");
            if(f.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File Already exits");
            }
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
        