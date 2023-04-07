public class BestTimeStock {
        public static int maxProfit(int[] prices) {
            int buyPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
    
            for(int i=0; i<prices.length; i++){
                if(prices[i] < buyPrice){
                    buyPrice = prices[i];
                }
                else{
                    int profit = prices[i] - buyPrice;
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
            return maxProfit;
        }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println("The maximum profit is : "+maxProfit);
    }
}