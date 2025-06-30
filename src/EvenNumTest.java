class PrintNum extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
public class EvenNumTest {
    public static void main(String[] args) {
        PrintNum p1 = new PrintNum();
        p1.start();
    }
}