import java.io.FileWriter;

public class DataAppend{
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("student.txt",true);
            w.write("\nMarks:95");
            w.close();

            System.out.println("Data Appended");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}