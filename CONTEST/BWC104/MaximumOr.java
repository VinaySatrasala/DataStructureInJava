import java.util.Arrays;

public class MaximumOr {
    public static void main(String[] args) {
        int[] nums={8,1,2};
        int k=2;

        System.out.println(maximumOr(nums, k));
    }
    static long maximumOr(int[] nums, int k) {
        // long mul = (1<<k);
        long[] pref=new long[nums.length + 1];
        long[] suf=new long[nums.length + 1];
        
        
        for(int i=0;i<nums.length;i++){
            pref[i+1] = pref[i] | nums[i];
            suf[nums.length-i-1] = suf[nums.length-i]|nums[nums.length -1-i];
        }
        System.out.println(Arrays.toString(pref));
        System.out.println(Arrays.toString(suf));

        
        long max=0;

        for(int i=0;i<nums.length;i++){
            // nums[i]*=mul;
            long res = pref[i] | (long)nums[i]*(1L<<k) |suf[i+1];    
            if(max < res){
                max=res;
            }
            
        }
        
        return max;
        
        
    }
}