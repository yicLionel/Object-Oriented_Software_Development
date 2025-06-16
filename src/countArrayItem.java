import java.util.HashMap;

public class countArrayItem<item> {
    public static void main(String[] args) {
        HashMap<String, Integer> abc = new HashMap<>();
        abc.put("alan", 1010);
        abc.put("alan", 1013);
        Integer x = (Integer) abc.get("alan");
        System.out.println(x);
    }
}
