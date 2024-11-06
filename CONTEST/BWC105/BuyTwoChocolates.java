public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] arr={98,54,6,34,66,63,52,39};
        System.out.println(buyChoco(arr, 62));
    }
    static int buyChoco(int[] prices, int m) {
        int max = -1;
        int money = m;
        // boolean chan = false;
        for(int i=0;i<prices.length;i++){
            for (int j = i+1; j < prices.length; j++) {
                int sum = prices[i] + prices[j];
                if(money - sum >=0 && money - sum > max){
                    max = money - sum;
                    // chan = true;
                }
            }
        }
        if(max > -1){
            return max;
        }
        return money;    
    }
}
