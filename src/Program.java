import java.util.*;

public class Program{
    public static void main(String[] args){
        Program p = new Program();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integers:");
        ArrayList<Integer> nums = new ArrayList<>();
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            nums.add(num);
        }

        HashMap<Integer, Integer> mostFrequent = new HashMap<>();
        mostFrequent = p.numOfInt(nums);
        System.out.print("Most Frequent Number: ");

        for (Map.Entry<Integer, Integer> entry : mostFrequent.entrySet()) {
            System.out.print(entry.getKey()+ ", ");
        }
        System.out.print("Frequency: " + mostFrequent.entrySet().iterator().next().getValue());
    }

    public HashMap<Integer, Integer> numOfInt(List<Integer> i) {
        HashMap<Integer, Integer> countNumOfInt = new HashMap<>();
        for (Integer integer : i) {
            if (!countNumOfInt.containsKey(integer)) {
                countNumOfInt.put(integer, 1);
            } else {
                countNumOfInt.put(integer, countNumOfInt.get(integer) + 1);
            }
        }

        HashMap<Integer, Integer> result = new HashMap<>();
        int maxCount = Collections.max(countNumOfInt.values());
        for (Map.Entry<Integer, Integer> entry: countNumOfInt.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}