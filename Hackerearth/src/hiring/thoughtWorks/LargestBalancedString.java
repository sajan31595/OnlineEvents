package hiring.thoughtWorks;

import java.util.Scanner;

public class LargestBalancedString {

	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner( System.in );
			int n = Integer.parseInt(scanner.nextLine());
			while(n>0){
				String input = scanner.nextLine();
				int largstNo=0;
				int ans[] = new int[6];
				for(int i=0;i<input.length();i++){
					switch(input.charAt(i)){
					case '(':
						ans[0] = ans[0]+1;
						break;
					case ')':
						ans[1] = ans[1]+1;
						break;
					case '{':
						ans[2] = ans[2]+1;
						break;
					case '}':
						ans[3] = ans[3]+1;
						break;
					case '[':
						ans[4] = ans[4]+1;
						break;
					case ']':
						ans[5] = ans[5]+1;
						break;
					}

				}
				largstNo = 2*Math.min(ans[0], ans[1])+ 2* Math.min(ans[2], ans[3])+ 2*Math.min(ans[4], ans[5]);
				System.out.println(largstNo);
				n--;
			}
		}catch(Exception ex){
            
        }
	}
}
