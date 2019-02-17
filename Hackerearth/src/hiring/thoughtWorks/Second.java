package hiring.thoughtWorks;

import java.util.Arrays;
import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int testCase = scanner.nextInt();
		while(testCase>0){
			int n = scanner.nextInt();
			int s = scanner.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			
			testCase--;
		}
	}
}
