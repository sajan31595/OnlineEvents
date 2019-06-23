package com.practice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class JohnyUncle {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int search = arr[k - 1];
			Arrays.sort(arr);

			int first = 0;
			int last = n - 1;
			int middle = (first + last) / 2;

			while (first <= last) {
				if (arr[middle] < search)
					first = middle + 1;
				else if (arr[middle] == search) {
					// System.out.println(search + " found at location " +(middle + 1) + ".");
					System.out.println(middle + 1);
					break;
				} else
					last = middle - 1;

				middle = (first + last) / 2;
			}
			if (first > last)
				System.out.println(search + " isn't present in the list.\n");
		}
	}
}
