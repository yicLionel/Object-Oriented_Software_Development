import java.util.Scanner;
public class TestScanner3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String s0 = scanner.next();
        Integer a = scanner.nextInt();
        String s1 = scanner.nextLine();
        System.out.println(s0 + "xx" + a + "xx" + s1);
    }

}