import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Pair {

    public static void main(String[] args) {
        Pair p = new Pair();
        double result = p.sum(1,2);
        System.out.println(result);

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana na");
        words.add("orange");
        words.add("pear");
        words.remove(2);
        System.out.println(words);
        ArrayList<String> joinedWords = p.joinWord(words);
        System.out.println(joinedWords);

        String str = "fwhiabribr";
        System.out.println(p.numOfChar(str));

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(4);
        intList.add(8);
        intList.add(1);
        intList.add(9);
        intList.add(8);
        System.out.println(p.uniqueNum(intList));

    }


    public <T extends Number, U extends Number> double sum(T first, U second){
        return first.doubleValue() + second.doubleValue();
    }

    public ArrayList<String> joinWord(ArrayList<String> words) {
        ArrayList<String> newArray = new ArrayList<>();
        for (String word : words) {
            if (!word.contains(" ")) {
                newArray.add(word.trim());
            }
        }
        return newArray;
                //String.join(", ", newArray);
    }

    public HashMap<Character, Integer> numOfChar(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (Character ch: str.toCharArray()) {
            if (!countMap.containsKey(ch)) {
                countMap.put(ch, 1);
            } else {
                countMap.put(ch, countMap.get(ch) + 1);
            }
        }
        return countMap;
    }

    public HashSet<Integer> uniqueNum(List<Integer> i) {
        HashSet<Integer> uniqueNumber = new HashSet<Integer>();
        for (Integer integer : i){
            if (integer != null){
                uniqueNumber.add(integer);
            }
        }
        return uniqueNumber;
    }
}
