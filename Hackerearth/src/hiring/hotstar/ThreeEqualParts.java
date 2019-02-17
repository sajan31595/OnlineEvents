package hiring.hotstar;

import java.util.Scanner;

public class ThreeEqualParts {

	public static void main(String[] args){
		try{
			Scanner s = new Scanner(System.in);
			int testcase = 1;//s.nextInt();
			while(testcase>0){
				int n = s.nextInt();
				int[] arr = new int[n];
				int numberofOnes = 0;
				for(int i=0;i<n;i++){
					arr[i] = s.nextInt();
					if(arr[i]==1){
						numberofOnes++;
					}
				}
				int zeorsRight=0;
				int right=n-1;
				while(arr[right]==0){
					zeorsRight++;
					right--;
				}
				if(numberofOnes%3==0){
					String finalInt1="";
					String finalInt2="";
					String finalInt3="";
					
					finalInt1 = getString(arr, 0, n/3-1);
					finalInt2 = getString(arr, n/3, (n*2)/3-1);
					finalInt3 = getString(arr, (n*2)/3, n-1);
					
					if((finalInt1.contains(finalInt2)||finalInt2.contains(finalInt1))
							&& finalInt2.contains(finalInt3)||finalInt3.contains(finalInt2)){
						int finalanswer = getValue(finalInt1);
						System.out.println(finalanswer);
					}else{
						System.out.println("-1");
					}
					
				}else{
					System.out.println("-1");
				}
				testcase--;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
	}
	public static String getString(int arr[],int start, int numberofLength){
		StringBuffer individualString = new StringBuffer();
		int count = numberofLength- start;
		while(count>=0){
			individualString.append(String.valueOf(arr[start]));
			start++;
			count--;
		}
		return individualString.toString();
	}
	public static int getValue(String finalInt){
		char[] numbers = finalInt.toCharArray();
	    int result = 0;
	    for(int i=numbers.length - 1; i>=0; i--){
	    	 if(numbers[i]=='1'){
	    		 result += Math.pow(2, (numbers.length-i - 1));
	    		 result = result%1000000007;
	    	 }
	    }
	       
	    return result;
	}
}
