import java.util.Arrays;
import java.util.List;

public class VariadicExample1 {
    public static void main (String[] args) {
        List<Integer> list1 = Arrays.asList(12, 5);
        System.out.println(list1);
        List<Integer> list2 = Arrays.asList(12, 5, 45, 18);
        System.out.println(list2);
        List<Integer> list3 = Arrays.asList(12, 5, 45, 18, 33);
        System.out.println(list3);
        }
}