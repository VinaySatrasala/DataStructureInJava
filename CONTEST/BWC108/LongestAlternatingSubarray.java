public class LongestAlternatingSubarray{
    public static void main(String[] args) {
        System.out.println(alternatingSubarray(new int[]{21,9,5}));
    }
    static int alternatingSubarray(int[] nums) {
        int size = nums.length;
        while (size > 1) {
            for (int i = 0; i +size - 1 < nums.length ; i++) {
                int last = i +size - 2;
                boolean found = true;
                int intial = 1;
                for (int j = i; j <= last; j++) {
                    if(nums[j] + intial != nums[j+1]){
                        found = false;
                        break;
                    }
                    intial = 0 - intial;
                }
                if(found){
                    System.out.println(i);
                    return size;
                }
            }
            size--;
        }
        return -1;
    }
}