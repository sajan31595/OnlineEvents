package com.challange.cf2017.october;

import java.util.Scanner;

public class BalancedContest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int testCase = scanner.nextInt();
		while(testCase>0){
			int cakeWalk = 0;
			int hard = 0;
			int n = scanner.nextInt();
			int p = scanner.nextInt();
			int[] solved = new int[n];
			String ans = "no";
			for(int i=0;i<n;i++){
				solved[i] = scanner.nextInt();
				if(solved[i]>=p/2){
					//System.out.println("cakeWalk"+i);
					cakeWalk++;
					if(cakeWalk>1){
						break;
					}
				}else if (solved[i]<=p/10){
					//System.out.println("hard"+i);
					hard++;
					if(hard>2){
						break;
					}
				}
			}
			if(cakeWalk==1&&hard==2){
				ans="yes";
			}
			System.out.println(ans);
			testCase--;
		}
		scanner.close();
		return ;
	}

}
