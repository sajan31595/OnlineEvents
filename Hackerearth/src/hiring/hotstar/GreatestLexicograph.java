package hiring.hotstar;

import java.util.Scanner;

public class GreatestLexicograph {

	public static void main(String[] args){
		try{
			Scanner s = new Scanner(System.in);
			int testcase = s.nextInt();
			while(testcase>0){
				String abc = s.next();
				int n =s.nextInt();
				char[] chars = abc.toCharArray();
				for(int i=0;i<chars.length;i++){
					if(n>0 && (chars[i]=='a'|| chars[i]=='e'|| chars[i]=='i'|| chars[i]=='o'|| chars[i]=='u')){
						chars[i] = (char)(++chars[i]);
						n--;
					}
				}
				System.out.println(new String(chars));
				testcase--;
			}
		}catch(Exception ex){
			
		}
		
	}
}
