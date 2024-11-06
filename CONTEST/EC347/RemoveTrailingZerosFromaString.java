public class RemoveTrailingZerosFromaString{
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("1203000"));
    }
    static String removeTrailingZeros(String num) {
        int i = num.length() - 1;
        while(num.charAt(i) == '0'){
            i--;
        }
        
        
        return  num.substring(0, i+1);

    }
}