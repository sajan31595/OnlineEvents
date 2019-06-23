package hiring.HSBC;

import java.util.Scanner;

public class SamHeight {
	public static void main(String[] args) {
		try{
			Scanner s = new Scanner(System.in);
			int testcase = s.nextInt();
			while(testcase>0){
				int n = s.nextInt();
				int samHeight = s.nextInt();
				int lesserHeight =0, greaterHeight=0;
				int[] friendsHeight = new int[n];
				for(int i=0;i<n;i++){
					friendsHeight[i] = s.nextInt();
					if(friendsHeight[i]>samHeight)
						greaterHeight++;
					else if(friendsHeight[i]<samHeight)
						lesserHeight++;
				}
				System.out.println(Math.abs(lesserHeight-greaterHeight));
				testcase--;
			}
		}catch(Exception ex){
			
		}
		
	}
}
