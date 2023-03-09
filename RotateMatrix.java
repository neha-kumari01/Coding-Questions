package StriverSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateMatrix {

	public static void rotateMatrixHelper(ArrayList<ArrayList<Integer>> mat, int rowStart, int colStart, int rowEnd,
            int colEnd) {
        // Base Condition
        if (rowStart >= rowEnd || colStart >= colEnd) {
            return;
        }

        if (rowStart >= rowEnd - 1 || colStart >= colEnd - 1) {
            return;
        }

        int previous = mat.get(rowStart + 1).get(colStart);
        int current;

        // Move elements of first row from the remaining rows
        for (int i = colStart; i < colEnd; i++) {
            current = mat.get(rowStart).get(i);
            mat.get(rowStart).set(i, previous);
            previous = current;
        }

        rowStart++;

        // Move elements of last column from the remaining columns
        for (int i = rowStart; i < rowEnd; i++) {
            current = mat.get(i).get(colEnd - 1);
            mat.get(i).set(colEnd - 1, previous);
            previous = current;
        }
        colEnd--;

        // Move elements of last row from the remaining rows
        if (rowStart < rowEnd) {
            for (int i = colEnd - 1; i >= colStart; i--) {
                current = mat.get(rowEnd - 1).get(i);
                mat.get(rowEnd - 1).set(i, previous);
                previous = current;
            }
        }
        rowEnd--;

        // Move elements of first column from the remaining rows
        if (colStart < colEnd) {
            for (int i = rowEnd - 1; i >= rowStart; i--) {
                current = mat.get(i).get(colStart);
                mat.get(i).set(colStart, previous);
                previous = current;
            }
        }
        colStart++;

        // Recursively rotate inner rings
        rotateMatrixHelper(mat, rowStart, colStart, rowEnd, colEnd);

    }

    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {

        rotateMatrixHelper(mat, 0, 0, n, m);

   
    }
	private static void print(ArrayList<ArrayList<Integer>> mat) {

		for (int i = 0; i < mat.size(); i++) {
			for (int j = 0; j < mat.get(i).size(); j++)
				System.out.print(mat.get(i).get(j) + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> x = new ArrayList<>();
			for (int j = 0; j < m; j++) {
				int element = sc.nextInt();
				x.add(element);
			}
			mat.add(x);
		}

		rotateMatrix(mat, n, m);

		print(mat);

		sc.close();

	}

}
