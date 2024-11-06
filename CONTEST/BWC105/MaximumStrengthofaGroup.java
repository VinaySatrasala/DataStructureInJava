public class MaximumStrengthofaGroup {
    public static void main(String[] args) {
        int[] nums={-9};
        fun(nums, 0, 1,true);
        System.out.println(max);
    }
    public long maxStrength(int[] nums) {
        return 0;
    }
    static long max = Integer.MIN_VALUE;
    static void fun(int[] nums,int index,int ans,boolean used){
        if(index == nums.length){
            if(ans > max && !used){
                max = ans;
            }
            return;
        }

        int temp=index+1;
        fun(nums, temp, ans*nums[index],used&&false);
        fun(nums, temp, ans,used&true);
    }
}
