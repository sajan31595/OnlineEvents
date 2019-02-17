package Backtracking;

import java.util.Scanner;

public class NQueen {
	
	public class Position{
		int row;
		int col;
		public Position(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Position[] positions = new Position[n];
		
		display(positions);
	}
	public static void display(Position[] positions){
		for(int i=0;i<positions.length;i++){
			System.out.print("Q ");
		}
	}

}
