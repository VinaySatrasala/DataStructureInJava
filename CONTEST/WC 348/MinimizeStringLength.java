import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength{
    public static void main(String[] args) {
        
    }
    public int minimizedStringLength(String s) {
        Set<String> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i)+"");
        }

        return set.size();
        
    }
}