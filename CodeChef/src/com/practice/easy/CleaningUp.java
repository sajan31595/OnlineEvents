package com.practice.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CleaningUp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int testCase = scanner.nextInt();
		while(testCase>0){
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int arr[] = new int[n+1];
			List<Integer> chefArr = new ArrayList<Integer>();
			List<Integer> asstArr = new ArrayList<Integer>();
			for(int i =1;i<=m;i++){
				arr[scanner.nextInt()]=1;
			}
			System.out.println();
			boolean chef=true; 
			for(int i=n;i>0;i--){
				if(arr[i]!=1){
					if(chef){
						chefArr.add(i);
						chef=false;
					}else {
						asstArr.add(i);
						chef=true;
					}
				}
			}
			for(int i=chefArr.size()-1;i>=0;i--){
				System.out.print(chefArr.get(i)+" ");
			}
			System.out.println();
			for(int i=asstArr.size()-1;i>=0;i--){
				System.out.print(asstArr.get(i)+" ");
			}
			testCase--;
		}
		scanner.close();
		return;
	}

}
