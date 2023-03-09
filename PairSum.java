package StriverSheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PairSum {

	public static List<int[]> pairSum(int[] arr, int s) {
		List<int[]> ans = new ArrayList<>();
		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int count=mp.getOrDefault(s-arr[i], 0);
			
			int[] pair=new int[2];
			pair[0]= Math.min(arr[i], s-arr[i]);
			pair[1]= Math.max(arr[i], s-arr[i]);
			
			while(count-- >0)
				ans.add(pair);
			
			mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);

		}
		Collections.sort(ans, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int sum = sc.nextInt();

		List<int[]> ans = pairSum(arr, sum);

		

		for (int[] it : ans) {
			for (int i = 0; i < it.length; i++)
				System.out.print(it[i] + " ");
			System.out.println();

		}
		
		sc.close();

	}

}
