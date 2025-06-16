import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite1 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("test1Out.txt"))) {
            pw.println("Hello World");
            pw.format("My favourite girl is %s and she is %s",
                    "yy", "so cute");

            } catch (IOException e) {
            e.printStackTrace();
            }
        }
}