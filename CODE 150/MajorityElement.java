import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Arrays.sort(arr);
        int x=0;
        int y=1;
        while(y<arr.length){
            if(y==arr.length-1 || arr[x] != arr[y]){
                int len=y-x+1;
                if(len > arr.length/2){
                    break;
                }
            }
        }
    }
}
