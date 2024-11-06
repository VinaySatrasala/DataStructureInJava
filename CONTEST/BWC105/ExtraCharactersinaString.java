
public class ExtraCharactersinaString {
    static int min = 55;
    public static void main(String[] args) {
        String s = "dwmodizxvvbosxxw";
        // ["ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"]
        String[] dictionary ={"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};

        // fun(s, dictionary, 0);
        // System.out.println(min);
        System.out.println(minExtraChar(s, dictionary));
    }
    static int minExtraChar(String s, String[] dictionary) {
        for (String string : dictionary) {
            s=s.replaceAll(string, "");
        }
        return s.length();
    }
    static void fun(String s, String[] dictionary,int index){
        if(index == dictionary.length){
            if(s.length() < min){
                min = s.length();
            }
            return;
        }
        
        System.out.println(s);

        String acc = new String(s);
        acc = acc.replaceAll(dictionary[index],"");
        System.out.println(acc);
        System.out.println("--");
        int temp= index +1;
        fun(acc, dictionary, temp);
        fun(s, dictionary, temp);

    }
}
