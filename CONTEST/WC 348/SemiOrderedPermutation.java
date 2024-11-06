public class SemiOrderedPermutation {
    public static void main(String[] args) {
        int[] nums={2,4,1,3};
        System.out.println(semiOrderedPermutation(nums));
    }
    static int semiOrderedPermutation(int[] nums) {

        if(nums[0] == 1 && nums[nums.length - 1] == nums.length){
            return 0;
        }


        int min=-1;
        int max=-1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == nums.length){
                max = i;
            }

            if(nums[i] == 1){
                min = i;
            }

            if(min != -1 && max !=-1){
                break;
            }
        }

        int steps = min+ (nums.length-1-max);
        if(min < max){
            return steps;
        }


        return steps-1;
    }
}
