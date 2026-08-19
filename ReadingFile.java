import java.io.FileReader;
public class ReadingFile {
    public static void main(String[] args) {
        try {
            FileReader r= new FileReader("student.txt");
            int ch;
            while((ch=r.read())!=-1){
                System.out.print((char)ch);
            }
            r.close();
            System.out.println("\nData Read");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}