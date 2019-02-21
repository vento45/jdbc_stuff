package edu.gobind.Success;

import java.util.Scanner;

public class LeftRotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		scanner.close();
	}

	private static int[] rotLeft(int[] a, int d) {
		// TODO Auto-generated method stub
		for (int i = 0, j=d-1; i <d/2; i++, j--) {
			if(i!=j)
			{
				int temp = a[i]; // Reversing Array without using another array
				a[i] = a[j];
				a[j] = temp;
			}
		}
		for (int i = d, j=a.length-1; i <((a.length-d)/2)+d; i++, j--) {
			if(i!=j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0, j=a.length-1; i < a.length/2; i++, j--) {
			if(i!=j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}

}
