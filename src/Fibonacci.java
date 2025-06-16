/**
 * 用递归求斐波那契数列第n位的值
 */
public class Fibonacci {
    public static void main(String[] args) {
        int result = getFibonacci(10);
        System.out.println(result);
    }
    // 1 1 2 3 5 8 13
    public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n ==2) {
            return 1;
        } else {
            return getFibonacci(n -1) + getFibonacci(n -2);
        }
    }
}
