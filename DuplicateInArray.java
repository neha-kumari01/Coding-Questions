package StriverSheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateInArray {
	
	private static int findDuplicate(List<Integer> arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			int index= Math.abs(arr.get(i));
			if(arr.get(index)<0)
				return index;
			
			arr.set(index,arr.get(index)*-1);
		}
		
		return 0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr=new ArrayList<>();
	
		for (int i = 0; i < n; i++)
		{
			int a=sc.nextInt();
			arr.add(a);
		}
		
		int x=findDuplicate(arr, n);
		System.out.println(x);
		
		sc.close();


	}

	

	
}
