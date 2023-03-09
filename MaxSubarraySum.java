package StriverSheet;

import java.util.Scanner;

public class MaxSubarraySum {
	
	public static long subarraySum(int[]arr,int n)
	{
		long ans=Long.MIN_VALUE,sum=0l;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			ans=Math.max(ans, sum);
			
			if(sum<0)
				sum=0;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		long sum=subarraySum(arr, n);
		System.out.println(sum);
		
		sc.close();

	}

}
