public class FindMaxDivScore {

    public static void main(String[] args) {
        int[] divisors={10,16};
        int[] nums={10};
        System.out.println(maxDivScore(nums, divisors));
    }
    static int maxDivScore(int[] nums, int[] divisors) {
        int count=0;
        int d=divisors[0];
        for(int k:nums){
            if(k%d ==0){
                count++;
            }
        }
        for(int i=1;i<divisors.length;i++){
            int div = divisors[i];
            int c=0;
            for(int k:nums){
                if(k%div ==0){
                    c++;
                }
            }
            if(c > count){
                count = c;
                d = div;
            }
            if(c == count){
                d= Math.min(d,div);
            }
        }
        
        return d;
    }
}