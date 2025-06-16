/**
 * 用递归求阶乘
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        RecursionTest2 re2 = new RecursionTest2();
        System.out.println(re2.getFactorial(3));
    }

    public int getFactorial(int num){
        if (num == 1) {
            return 1;
        }
        return (getFactorial(num-1) * num);
    }

}