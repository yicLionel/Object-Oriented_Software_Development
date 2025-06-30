import java.util.ArrayList;
import java.util.Collections;

public class ENUM {
    public enum direction {
        NORTH(0),
        NORTHEAST(45),
        EAST(90),
        SOUTHEAST(135),
        SOUTH(180),
        SOUTHWEST(225),
        WEST(270),
        NORTHWEST(315);

        public int toDegrees(){
            return degrees;
        }
        private final int degrees;
        private direction(int degrees) {
            this.degrees = degrees;
        }
    }

    public static void main(String[] args) {
        ArrayList<direction> directionList = new ArrayList<>();
        // Add all enum values to the list
        Collections.addAll(directionList, direction.values());
        System.out.println(directionList);
        // Sort the list based on the degrees
        Collections.sort(directionList, (d1, d2) -> Integer.compare(d1.toDegrees(), d2.toDegrees()));
        System.out.println(directionList);



    }
}
