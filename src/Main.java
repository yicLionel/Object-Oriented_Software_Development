public class Main {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        int count = 1000000;
        while(count > 0) {
            System.out.println("Hello, World!");
            count--;
        }
        double end = System.currentTimeMillis();
        System.out.println((end-start)/1000);
    }
}