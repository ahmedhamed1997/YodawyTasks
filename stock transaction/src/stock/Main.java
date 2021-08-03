package stock;

import java.util.Scanner;

public class Main {

    public static int maxIncome(int prices[]) {
        int maxincome = 0;
    	int sellDay = 0;
    	int buyDay = 0;        
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int transactionIncome = prices[j] - prices[i];
                if (transactionIncome > maxincome) {
                    maxincome = transactionIncome;
                	buyDay = i+1;
                	sellDay = j+1;
                }
            }
        }
        System.out.print("Buy on day " + buyDay);
        System.out.print(" and sell on day " + sellDay);

        return maxincome;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of days of this month");
		int n = s.nextInt();
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		array[i]=s.nextInt();  
		}  
		int []stockPrices = array;
		System.out.println( " with max income = " + maxIncome(stockPrices));
	}

}
