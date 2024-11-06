public class Winner{
    public static void main(String[] args) {
        int[] p1={0,4,7,2,0};
        int[] p2={2,3,3,0,1};
        System.out.println(isWinner(p1, p2));
    }

    static int isWinner(int[] p1, int[] p2) {
        int s1=0;
        int s2=0;
        for(int i=0;i<p1.length;i++){
            if(i>=2){
                if(p1[i-1]==10 ||p1[i-2]==10){
                    s1+=(2*p1[i]);
                }else{
                    s1+=p1[i];
                }
                if(p2[i-1]==10 ||p2[i-2]==10){
                    s2+=(2*p2[i]);
                }else{
                    s2+=p2[i];
                }
            }else{
                s1+=p1[i];
                s2+=p2[i];
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1>s2){
            return 1;
        }else if(s1==s2){
            return 0;
        }
        
        return 2;
    }
}