public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String str="leetcode";
        StringBuilder s=new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            String temp=str.substring(i+1);
            temp.contains(str.charAt(i)+"");
            
        }
        System.out.println('c'+"c");
    }
}
