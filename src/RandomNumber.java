import java.util.Random;
import java.util.Arrays;
public class RandomNumber implements Comparable<RandomNumber> {
    private static Random random = new Random();
    public final int number;
    // 构造Random数
    public RandomNumber() {
        this.number = random.nextInt(100);
    }
    // 重写compareTo方法
    public int compareTo(RandomNumber randomNumber) {
        return randomNumber.number - this.number; // 降序
        // return this.number - randomNumber.number; // 升序
    }
    // 重写toString方法
    public String toString() {
        return Integer.toString(this.number);
    }


    public static void main(String args[]) {
        RandomNumber randomNumbers[] = new RandomNumber[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = new RandomNumber();
        }
        System.out.println(Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
    }
}

