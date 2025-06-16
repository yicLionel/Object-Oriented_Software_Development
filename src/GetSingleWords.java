import java.util.ArrayList;

/**
 * 处理一个字符串类型的ArrayList，输出其中所有只包含一个单词的元素，输出的时候用逗号隔开
 *
 */
public class GetSingleWords {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("fef wef fw");
        arr.add("fwef");
        arr.add("htg g 3 beg");
        arr.add("we2rf");
        String result = getSingleWords(arr);
        System.out.println(result);
    }
    public static String getSingleWords(ArrayList<String> strings) {
        String output = "";
        for (String s : strings) {
            if (s.split(" ").length == 1) {
                output += "," + s;
            }
        }
        return output.substring(1);
    }
}

