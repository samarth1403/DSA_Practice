import java.util.*;
public class StockBuyandSell {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4}; // we can't sell on first day . we can only buy

        int buyPrice = prices[0];
        
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit , maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        System.out.println("The maximum profit is : "+maxProfit);

    }
}