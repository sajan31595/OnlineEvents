package hiring.thoughtWorks;

import java.util.Arrays;
import java.util.Scanner;

public class MagicalArray {
	
	public static void main(String[] args){
		try{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner( System.in );
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] arr = new int[n];
			int[] arrout = new int[n];
			//arr = new int[]{1,4,8,10,15};
			for(int i=0;i<n;i++){
				arr[i] = scanner.nextInt();
			}
			for(int i=0;i<n;i++){
				arrout[i] = nearestSqare(arr[i]);
			}
			Arrays.sort(arrout);
			int sum=0;
			for(int i=0;i<k;i++){
				sum = sum+arrout[i];
			}
			System.out.println(sum+n-k);
		}catch(Exception ex){
			
		}
	}
	public static boolean isPrime(int num){
		if(num<2)
			return false;
		for(int i = 2; i <= num/2; ++i){
            if(num % i == 0){
               return false;
            }
        }
		return true;
	}
	
	public static int nearestSqare(int number){
		int upperNearestSquare = 0;
		int lowerNearestSquare = 0;
		int numberTemp = number;
		while(isPrimeSquare(numberTemp)==false){
			upperNearestSquare = upperNearestSquare + 1;
			numberTemp++;
			
		}
		numberTemp = number;
		if(numberTemp<4){
			lowerNearestSquare = 4-numberTemp;
		}else{
			while( isPrimeSquare(numberTemp)==false){
				lowerNearestSquare = lowerNearestSquare + 1;
				numberTemp--;
			}
		}
		
		if(upperNearestSquare>lowerNearestSquare)
			return lowerNearestSquare;
		return upperNearestSquare;
	}
	
	public static boolean isPrimeSquare(int number){
		int sqrt = (int) Math.sqrt(number);
		if(sqrt*sqrt == number){
			if(isPrime(sqrt)){
				return true;
			}
		}
		return false;
	}

}
