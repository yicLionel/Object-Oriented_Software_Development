/**
 * Use to iterate an array, print the elements from the
 * start to the end, then go over again
 *
 */
public class IteratorTest {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5};
        int len = intArray.length;
        for (int i = 0; i < 20; i++) {
            System.out.println(intArray[i%len]);
        }
    }
}
