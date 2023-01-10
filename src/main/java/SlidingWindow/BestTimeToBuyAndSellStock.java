package SlidingWindow;

/*Вам дан массив, prices где указана prices[i] цена данной акции в день. i^th
Вы хотите максимизировать свою прибыль, выбрав один день для покупки одной акции и выбрав другой день в будущем для продажи этой акции.
Верните максимальную прибыль, которую вы можете получить от этой сделки . Если вы не можете получить какую-либо прибыль, верните 0.*/


public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        int max = 1;
        int min = 0;
        int maxProfit = 0;
        while (max < prices.length) {
            if (prices[max] > prices[min]) {
                maxProfit = Math.max(maxProfit, prices[max] - prices[min]);
                max++;
            } else {
                min = max;
                max++;
            }
        }
        return maxProfit;
    }
}