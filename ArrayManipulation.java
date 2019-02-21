package edu.gobind.Success;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {


	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {

		long zeroArray[] = new long[n];
		int start, end, addition=0;
		for (int i = 0; i < queries.length; i++) {
			
			start = queries[i][0]-1;
			end = queries[i][1];
			addition = queries[i][2];
			
			zeroArray[start] += addition;
			if(end < n)
			zeroArray[end] -= addition;
		}
		int max=0, temp=0;
		for (int i = 0; i < zeroArray.length; i++) {
			temp += zeroArray[i];
			if(max < temp) max = temp;
		}
		return max;
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt(); // Size of zero arrays
		int m = scanner.nextInt(); // No of operations
		int[][] queries = new int[m][3];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				queries[i][j] = scanner.nextInt(); // onsisit of starting point, end point and value to be added
			}
		}
		long result = arrayManipulation(n, queries);
		System.out.print(result);
		scanner.close();
	}
}


