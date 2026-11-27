package DAY3.Session2;
import java.util.Scanner;

public class Prg19TimeToSellAndBuyStock {
        int maxProfit(int[] prices, int pricesSize) 
    {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < pricesSize; i++) 
        {
            if (prices[i] < min_price) 
            {
                min_price = prices[i];
            } 
            else if (prices[i] - min_price > max_profit) 
            {
                max_profit = prices[i] - min_price;
            }
        }   

            return max_profit;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        Prg19TimeToSellAndBuyStock obj = new Prg19TimeToSellAndBuyStock();
        int maxProfit = obj.maxProfit(prices, n);
        System.out.println("The maximum profit that can be achieved is: " + maxProfit);
    }
}
