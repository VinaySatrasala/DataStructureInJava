import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RelocateMarbles {
    public static void main(String[] args) {
        int[] nums = {1,6,7,8};
        
        int[] mf = {1,7,2};
        int[] mt = {2,9,5};

        System.out.println(relocateMarbles(nums, mf, mt));

    }
    static List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {

        TreeSet
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for(int i = 0;i<moveFrom.length;i++){
            int actual = moveFrom[i];
            int tobe = moveTo[i];
            set.remove((Integer)actual);
            set.add(tobe);
        }




        List<Integer> ans = new ArrayList<>();
        for (Integer integer : set) {
            ans.add(integer);
        }

        Collections.sort(ans);
        return ans;
    }

}
