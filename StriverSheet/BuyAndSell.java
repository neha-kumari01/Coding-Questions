package StriverSheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyAndSell {
	
	private static int maximumprofit(List<Integer> prices) {
		
		int minPrice=prices.get(0);
		int profit=Integer.MIN_VALUE;
		for(int i=1;i<prices.size();i++)
		{
			minPrice=Math.min(minPrice, prices.get(i));	
			profit=Math.max(profit,prices.get(i)-minPrice);
		}
		return profit;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> prices=new ArrayList<>();
	
		for (int i = 0; i < n; i++)
		{
			int a=sc.nextInt();
			prices.add(a);
		}
		
		int profit=maximumprofit(prices);
		System.out.println(profit);
		
		sc.close();

	}

	

}
