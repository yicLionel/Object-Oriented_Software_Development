import java.util.HashMap;

/**
 * implement a method that takes a string as an argument and returns a HashMap<Character, Integer>
 * containing the number of times each character in the string appears.
 */
public class frequencyCount {
    public static void main(String[] args) {
        String s = "fwjgooqenbglbge";
        System.out.println(countFrequency(s));
    }

    public static HashMap<Character, Integer> countFrequency(String str) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            result.putIfAbsent(c, 0);
            result.put(c, result.get(c)+1);
        }
        return result;
    }
}
