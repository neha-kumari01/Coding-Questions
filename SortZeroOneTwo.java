package StriverSheet;

import java.util.Scanner;

public class SortZeroOneTwo {
	
	public static void print(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	
	public static void sort(int[] arr)
	{
		int n=arr.length;
		int i=0,k=0,j=n-1;
		
		while(k<j)
		{
			if(arr[k]==0)
			{
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				i++;
				k++;
			}
			else if(arr[k]==1)
				k++;
			else
			{
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j--;
			}
		}
		
		print(arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sort(arr);

		sc.close();

	}

}
