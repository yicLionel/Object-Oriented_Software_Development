import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray_1 = {1,2,3,4,5};
        int[] intArray_2 = intArray_1;
        System.out.println(intArray_2[1]);

        int[] n1 = {1, 2, 3};
        int[] n2 = {1, 2, 3};
        System.out.println(Arrays.equals(n1, n2)); // compare with value// true
        System.out.println(n1==n2); // compare with reference//  false
    }
}
