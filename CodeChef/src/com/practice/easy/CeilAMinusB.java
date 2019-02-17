package com.practice.easy;

import java.util.Scanner;

public class CeilAMinusB {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner( System.in );
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int diff = a-b;
		//System.out.println(diff);
		if(diff%10!=9)
			diff++;
		else diff--;
		System.out.println(diff);
		scanner.close();
		return;
	}

}
