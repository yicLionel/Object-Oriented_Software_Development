import java.util.Scanner;
import java.util.stream.IntStream;

public class Workshop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = scanner.nextInt();

        // question 1
        for (int i = 1; i <= size; i++) {
            System.out.println("#".repeat(i));
        }
        System.out.println("\n");

        // question 2
        // top half
        for (int i = 0; i <= size / 2; i++) {
            int numSpace = size / 2 - i;
            int numHashes = 1 + 2 * i;
            System.out.println(" ".repeat(numSpace)
                                + "#".repeat(numHashes));
        }
        //bot half
        for (int i = size / 2 - 1; i >= 0; i--) {
            int numSpace = size / 2 - i;
            int numHashes = 1 + 2 * i;
            System.out.println(" ".repeat(numSpace) + "#".repeat(numHashes));
        }


    }
}
