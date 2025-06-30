import java.util.function.UnaryOperator;

/**
 * 单目运算符的例子
 */
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> u1 = i -> i+1;
        UnaryOperator<Integer> u2 = i -> i-1;
        Integer b = 10;
        Integer b1 = u1.apply(b);
        Integer b2 = u2.apply(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}
