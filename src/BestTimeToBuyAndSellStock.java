//You are given an array prices where prices[x] is the price of a given stock on the xth day. You want to maximize
//your profit by choosing a single day to buy one stock and choosing a different day in the future to sell the stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Ex: Input: prices = [7, 1, 5, 3, 6, 4] Output: 5 (buy on day 2 at a price of 1, sell on day 5 at a price of 6)
//Keep in mind that you cannot buy on day 2 and sell on day 1.


public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){

        int currentLowest = prices[0];
        int currentBestProfit = 0;

        for(int x = 1; x < prices.length; x++){

            if(prices[x] < currentLowest){
                currentLowest = prices[x];
            }

            int profitIfSoldToday = prices[x] - currentLowest;

            if(profitIfSoldToday > currentBestProfit){
                currentBestProfit = profitIfSoldToday;
            }
        }
        return currentBestProfit;
    }

    public static void main(String[] args){

        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);

    }

}
