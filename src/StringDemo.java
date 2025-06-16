import java.util.Arrays;
public class StringDemo {
    public static void main(String[] args) {
        char[] h = {'H', 'E', 'L'};
        char[] k = h;
        System.out.println(h==k);
        System.out.println(h.length);
        String s = String.valueOf(h);
        System.out.println(s);
    }
}
