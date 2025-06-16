import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String acronym = "";

        for (String word : words) {
            acronym += Character.toUpperCase(word.charAt(0));
        }
        System.out.println(acronym);
    }
}
