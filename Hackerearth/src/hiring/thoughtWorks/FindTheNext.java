package hiring.thoughtWorks;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheNext {

	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner( System.in );
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int arr[] = new int[n];
			for (int i=0;i<n;i++){
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			while(x>0){
				int inputValue= scanner.nextInt();
				int index=0;
				inputValue++;
				while(index<arr.length && arr[index]<inputValue){
					index++;
				}
				while(index<arr.length && inputValue>=arr[index] ){
					inputValue++;
					index++;
				}
				System.out.println(inputValue);
				x--;
			}
		}catch(Exception ex){
			
		}
	}
}
