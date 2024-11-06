public class CheckifTheNumberisFascinating{
    public static void main(String[] args) {
        System.out.println(isFascinating(192));
    }
    static boolean isFascinating(int n) {
        String res = n + ""+2*n +""+ 3 * n;
        int[] k = new int[10];
        for (int i = 0; i < res.length(); i++) {
            k[res.charAt(i) - '0']++;
        }

        if(k[0] != 0){
            return false;
        }

        boolean ans = true;
        for (int i = 1; i < k.length; i++) {
            if(k[i] != 1){
                ans =false;
                break;
            }
        }
        return ans;
    }
}