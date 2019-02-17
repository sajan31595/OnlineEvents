package hiring.goldmansachs;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSum {

	//static boolean[][] dp;
	static int count=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int desiredSum = 6;//sc.nextInt();
		int[] arr = {1, 2, 3, 4, 5};//new int[n];
		n=arr.length;
		/*for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}*/
		countSubsequence(arr,desiredSum);
	}

	static void countSubsequence(int[] arr, int sum) {

		printAllSubsets(arr,arr.length,sum);
	}

	static void printAllSubsets(int arr[], int n, int sum) {
		if (n == 0 || sum < 0)
			return;

		// Sum 0 can always be achieved with 0 elements
		boolean[][] dp = new boolean[n][sum + 1];
		for (int i = 0; i < n; ++i) {
			dp[i][0] = true;
		}

		// Sum arr[0] can be achieved with single element
		if (arr[0] <= sum)
			dp[0][arr[0]] = true;

		// Fill rest of the entries in dp[][]
		for (int i = 1; i < n; ++i)
			for (int j = 0; j < sum + 1; ++j)
				dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] || dp[i - 1][j - arr[i]]) : dp[i - 1][j];
		if (dp[n - 1][sum] == false) {
			System.out.println("There are no subsets with" + " sum " + sum);
			return;
		}

		// Now recursively traverse dp[][] to find all
		// paths from dp[n-1][sum]
		ArrayList<Integer> p = new ArrayList<>();
		printSubsetsRec(arr, n - 1, sum, p,dp);
		System.out.println(count);
	}

	static void printSubsetsRec(int arr[], int i, int sum, ArrayList<Integer> p,boolean[][] dp) {
		// If we reached end and sum is non-zero. We print
		// p[] only if arr[0] is equal to sun OR dp[0][sum]
		// is true.
		if (i == 0 && sum != 0 && dp[0][sum]) {
			p.add(arr[i]);
			//display(p);
			p.clear();
			count++;
			return;
		}

		// If sum becomes 0
		if (i == 0 && sum == 0) {
			//display(p);
			p.clear();
			count++;
			return;
		}

		// If given sum can be achieved after ignoring
		// current element.
		if (dp[i - 1][sum]) {
			// Create a new vector to store path
			ArrayList<Integer> b = new ArrayList<>();
			b.addAll(p);
			printSubsetsRec(arr, i - 1, sum, b,dp);
		}

		// If given sum can be achieved after considering
		// current element.
		if (sum >= arr[i] && dp[i - 1][sum - arr[i]]) {
			p.add(arr[i]);
			printSubsetsRec(arr, i - 1, sum - arr[i], p,dp);
		}
	}

	static void display(ArrayList<Integer> v) {
		System.out.println(v);
	}
}
