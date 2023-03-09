package StriverSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
	
	public static ArrayList<ArrayList<Integer>> pascalTriangle(int n)
	{
		ArrayList<ArrayList<Integer>> result=new  ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> row=new ArrayList<>();
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==j )
					row.add(1);
				else
					row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));				
			}
			
			result.add(row);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		 ArrayList<ArrayList<Integer>> result=pascalTriangle(n);
		 
		 for(int i=0;i<result.size();i++)
		 {
			 for(int j=0;j<result.get(i).size();j++)
				 System.out.print(result.get(i).get(j)+" ");
			 System.out.println();
		 }
		 
		 sc.close();
		 
			 

	}

}
