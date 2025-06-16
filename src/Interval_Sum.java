import java.util.Scanner;

public class Interval_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vec = new int[n];
        int[] p = new int[n];

        int presum = 0;

        for (int i = 0; i < n; i++){
            vec[i] = scanner.nextInt();
            presum += vec[i]; // calculate the sum form 0th to ith
            p[i] = presum;
        }

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = 0;
            if (a == 0) {
                sum = p[b];
            } else {
                sum = p[b] - p[a-1];
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
