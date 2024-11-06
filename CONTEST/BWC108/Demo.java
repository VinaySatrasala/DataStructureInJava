import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {1,6,7,8};
        
        int[] mf = {1,7,2};
        int[] mt = {2,9,5};
        System.out.println(rs(nums,mf,mt));
    }
    public static List<Integer> rs(int[] nums, int[] moveFrom, int[] moveTo) {
        Map<Integer, Integer> map = new HashMap<>(); // Map to store the count of marbles

        // Count the marbles and store their count in the map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        // Relocate marbles from moveFrom to moveTo
        for (int i = 0; i < moveFrom.length; i++) {
            int numMarbles = map.get(moveFrom[i]); // Get the count of marbles to be moved
            map.remove(moveFrom[i]); // Remove the marble from the original location
            map.put(moveTo[i], map.getOrDefault(moveTo[i], 0) + numMarbles); // Add the marbles to the new location
            System.out.println(map);
        }

        List<Integer> result = new ArrayList<>(); // Result list to store the relocated marbles
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getKey()); // Add the marble number to the result list
        }
        result.sort(null); // Sort the result list in ascending order

        return result; // Return the final result list
    }
}