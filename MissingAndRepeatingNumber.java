package StriverSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingAndRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr.add(x);
		}

		int[] ans = missingAndRepeating(arr, n);

		for (int x : ans)
			System.out.print(x + " ");

		sc.close();

	}

	private static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {

		int r = 0, m = 0;

        // Traversing the array
        for (int i = 0; i < n; i += 1) {
            if (arr.get(Math.abs(arr.get(i)) - 1) > 0) {

                int x = Math.abs(arr.get(i));

                arr.set(x - 1, -arr.get(x - 1));
            }
            // If arr[i] is already negative, it is the repeating number
            else {
                r = Math.abs(arr.get(i));
            }
        }

        for (int i = 0; i < n; i += 1) {
            // The index at which the element is positive is the missing number
            if (arr.get(i) > 0) {
                m = i + 1;
                break;
            }
        }

        int[] ans = new int[]{m, r};

        return ans;
		
	}

}
