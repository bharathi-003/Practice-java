import java.io.FileWriter;

public class WritingFile {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("student.txt");

            w.write("Name: John\n");
            w.write("Age: 20\n");
            w.write("Dept: IT");
            

            w.close();

            System.out.println("Data Written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}