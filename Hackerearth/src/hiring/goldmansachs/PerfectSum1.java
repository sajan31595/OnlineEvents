package hiring.goldmansachs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSum1 {

	//static boolean[][] dp;
	//static int count=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int desiredSum = sc.nextInt();
		int[] arr = new int[n];
		n=arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		countSubsequence(arr,desiredSum);
	}

	static int  countSubsequence(int[] arr, int sum) {

		List<Integer>  list = new ArrayList<Integer>();
		arr = list.stream().mapToInt(i->i).toArray();
		return printAllSubsets(arr,arr.length,sum);
	}

	static int printAllSubsets(int arr[], int n, int sum) {
		int count=0;
		if (n == 0 || sum < 0)
			return count;

		boolean[][] dp = new boolean[n][sum + 1];
		for (int i = 0; i < n; ++i) {
			dp[i][0] = true;
		}

		if (arr[0] <= sum)
			dp[0][arr[0]] = true;

		for (int i = 1; i < n; ++i)
			for (int j = 0; j < sum + 1; ++j)
				dp[i][j] = (arr[i] <= j) ? (dp[i - 1][j] || dp[i - 1][j - arr[i]]) : dp[i - 1][j];
		if (dp[n - 1][sum] == false) {
			//System.out.println("There are no subsets with" + " sum " + sum);
			return count;
		}
		ArrayList<Integer> p = new ArrayList<>();
		count = printSubsetsRec(arr, n - 1, sum, p,dp, count);
		//System.out.println(count);
		return count;
	}

	static int printSubsetsRec(int arr[], int i, int sum, ArrayList<Integer> p,boolean[][] dp,int count) {
		// If we reached end and sum is non-zero. We print
		// p[] only if arr[0] is equal to sun OR dp[0][sum]
		// is true.
		if (i == 0 && sum != 0 && dp[0][sum]) {
			p.add(arr[i]);
			//display(p);
			p.clear();
			count++;
			return count;
		}

		// If sum becomes 0
		if (i == 0 && sum == 0) {
			//display(p);
			p.clear();
			count++;
			return count;
		}

		// If given sum can be achieved after ignoring
		// current element.
		if (dp[i - 1][sum]) {
			// Create a new vector to store path
			ArrayList<Integer> b = new ArrayList<>();
			b.addAll(p);
			count = printSubsetsRec(arr, i - 1, sum, b,dp,count);
		}

		// If given sum can be achieved after considering
		// current element.
		if (sum >= arr[i] && dp[i - 1][sum - arr[i]]) {
			p.add(arr[i]);
			count = printSubsetsRec(arr, i - 1, sum - arr[i], p,dp,count);
		}
		return count;
	}

	static void display(ArrayList<Integer> v) {
		System.out.println(v);
	}
}
