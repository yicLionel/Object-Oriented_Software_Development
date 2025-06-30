import java.io.*;


/**
 * 从文本文件中读取内容，将其转化成小写格式并输出成一个新的文本文件
 */
public class FileWrite3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test1Out.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("output_test1Out.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
                pw.println(text.toLowerCase());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}