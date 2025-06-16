public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest re = new RecursionTest();
        int result = re.getSum(100);
        System.out.println(result);
    }

    public int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return getSum(num-1) + num;
    }
    /**
    // 如下递归方法的使用，会导致StackOverFlowError
    public static void main(String[] args) {
        RecursionTest re = new RecursionTest();
        re.method1();
    }

    public void method1() {
        System.out.println("method1...");
        method1();
    }
     **/
}
