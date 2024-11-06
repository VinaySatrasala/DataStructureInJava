public class FindFirstIndexAndLastIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 2 };
        System.out.println(bsf(nums, 2));
        System.out.println(bsl(nums, 2));
    }

    static int bsf(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                if (m == 0 || nums[m] != nums[m - 1]) {
                    return m;
                } else if (nums[m] == nums[m - 1]) {
                    e = m - 1;
                }
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return -1;
    }

    static int bsl(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                if (m == nums.length - 1 || nums[m] != nums[m + 1]) {
                    return m;
                } else if (nums[m] == nums[m + 1]) {
                    s = m + 1;
                }
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }

        }

        return -1;
    }
}
