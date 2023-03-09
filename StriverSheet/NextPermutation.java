package StriverSheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NextPermutation {

	private static void reverse(ArrayList<Integer> nums, int start, int end) {
		while (start < end) {
			swap(nums, start++, end--);
		}
	}

	private static void swap(ArrayList<Integer> nums, int i, int j) {
		int temp = nums.get(i);
		nums.set(i, nums.get(j));
		nums.set(j, temp);
	}

	private static ArrayList<Integer> Permutation(ArrayList<Integer> arr) {

		int i, j;

		int n = arr.size();
		for (i = arr.size() - 2; i >= 0; i--) {
			if (arr.get(i) < arr.get(i + 1))
				break;
		}

		if (i < 0) {
			Collections.sort(arr);
		} else {
			for (j = n - 1; j > i; j--) {
				if (arr.get(j) > arr.get(i))
					break;
			}
			swap(arr, i, j);
			reverse(arr, i + 1, arr.size() - 1);

		}

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr.add(a);
		}
		int x = 1;
		while (x < 10) {
			ArrayList<Integer> next = Permutation(arr);

			for (int i : next)
				System.out.print(i + " ");

			System.out.println();
			x++;
		}

		sc.close();

	}

}
