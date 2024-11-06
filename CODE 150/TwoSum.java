import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums=new int[10];
        Map<Integer,Integer> ans=new HashMap<>();
        int[] res={0,0};
        int target=8;
        for (int i = 0; i < nums.length; i++) {
            if(ans.containsKey(target-nums[i])){
                res[0]=ans.get(target-nums[i]);
                res[1]=i;
            }
            ans.put(nums[i], i);
        }
    }
}