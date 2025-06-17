public class WithExceptionHandling {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 0;

        try{
            System.out.println("The result is " + divide(n1, n2));
        } catch (RuntimeException e) {
            System.out.println("n2 is not dividable");
        } finally {
            System.out.println("This line will be printed any way");
        }


    }
    public static int divide(int n1, int n2) {
        return n1/n2;
    }
}
