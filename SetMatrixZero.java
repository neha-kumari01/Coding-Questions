package StriverSheet;

import java.util.Scanner;

public class SetMatrixZero {
	
	public static void SetZeros(int[][] matrix)
	{
		int row=matrix.length;
		int col=matrix[0].length;
		
		int x=1;
		
		for(int i=0;i<row;i++)
		{
			if(matrix[i][0]==0)
				x=0;
			for(int j=1;j<col;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[0][j]=0;
					matrix[i][0]=0;
				}				
			}			
		}
		
		for(int i=row-1;i>=0;i--)
		{
			for(int j=col-1;j>=0;j--)
			{
				if(matrix[0][j]==0 || matrix[i][0]==0)
					matrix[i][j]=0;
			}
			if(x==0)
			{
				matrix[i][0]=0;
			}
		}
		
		print(matrix);
		
	}
	
	public static void print(int[][] matrix)
	{
		int row=matrix.length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] matrix=new int[row][col];
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				matrix[i][j]=sc.nextInt();
		
		SetZeros(matrix);
		
		sc.close();
		
		
		
		

	}

}
