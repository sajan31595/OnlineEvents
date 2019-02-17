package hiring.wissen;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleArea {

	private static ArrayList<Integer> length = new ArrayList<Integer>();
	private static ArrayList<Integer> breadth = new ArrayList<Integer>();
	public static void main(String[] args){
		Scanner scanner = new Scanner( System.in );
		int n = scanner.nextInt();
		int len,bred;
		while(n>0){
			len = scanner.nextInt();
			bred = scanner.nextInt();
			
			add(len,bred);
			n--;
		}
		for(int i=0;i<length.size();i++){
			System.out.println(length.get(i)+" "+breadth.get(i));
		}
	}
	private static void add(int len,int bred){
		boolean added =false;
		if(length.size()==0){
			length.add(0, len);
			breadth.add(0,bred);
			added =true;
		}else{
			for(int i=0;i<length.size();i++){
				if(len>=length.get(i)){
					if(bred>breadth.get(i)){
						for(int j=i;bred<breadth.get(j);j++){
						}
					}
					length.add(i, len);
					breadth.add(i,bred);
					added=true;
					i++;
					break;
				}
			}
			if(!added){
				length.add(len);
				breadth.add(bred);
			}
		}
		
	}
}
