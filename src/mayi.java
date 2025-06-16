import java.util.Scanner;

public class mayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int rowNum = in.nextInt();

        int index = 0;  // 字符串中的当前索引
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= rowNum; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < i; j++) {
                // 如果超出长度则循环回到开头
                line.append(str.charAt(index % str.length()));
                index++;
            }

            System.out.println("第 " + i + " 行: " + line.toString());
            ans.append(line.charAt(0));
        }

        System.out.println("首字母组成的字符串: " + ans.toString());
    }
}