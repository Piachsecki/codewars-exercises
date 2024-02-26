package leetCode.topInterview150;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//Constraints:
//
//1 <= prices.length <= 105
//0 <= prices[i] <= 104
public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{1, 2}));

    }

    //correct solution, but time complexity is too big
//    public static int maxProfit(int[] prices) {
//        int biggestRevenue = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length ; j++) {
//                int tempRevenue = prices[j] - prices[i];
//                if (biggestRevenue < tempRevenue){
//                    biggestRevenue = tempRevenue;
//                }
//            }
//        }
//        return biggestRevenue;
//
//    }
    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int biggestRevenue = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minValue){
                minValue = prices[i];
            } else if (prices[i] - minValue > biggestRevenue) {
                biggestRevenue = prices[i] - minValue;
            }

        }
        return biggestRevenue;

    }

//
//
//
//
//    public static int maxProfit(int[] prices) {
//        //finding the lowest number's index
//        int minValueIndex = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if(prices[minValueIndex] > prices[i])
//                minValueIndex = i;
//        }
//        if(minValueIndex == prices.length - 1){
//            return 0;
//        }else {
//            int biggestRevenue = 0;
//            for (int i = minValueIndex; i < prices.length - 1; i++) {
//                int temp = prices[i+1] - prices[minValueIndex];
//                if(biggestRevenue < temp)
//                    biggestRevenue = temp;
//            }
//            //because of the indexing
//            return biggestRevenue;
//        }

//    }
}
