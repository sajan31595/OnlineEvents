package hiring.thoughtWorks;

import java.util.Scanner;

public class First {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int testCase = scanner.nextInt();
		while(testCase>0){
			int n = scanner.nextInt();
			//int[] peoplseSay = {0,1,1};
			int[] peoplseSay = new int[n+1];
			int[] country = new int[n+1];
			int countries=0;
			int people=0;
			String invalid = "";
			for(int i=1;i<=n;i++){
				peoplseSay[i] = scanner.nextInt();
				if(peoplseSay[i]<=n){
					country[peoplseSay[i]]++;
				}else {
					invalid = "Invalid Data";
				}
			}
			/*for(int i=1;i<=n;i++){
			 System.out.print(country[i]);
			}*/
			for(int i=1;i<=n;i++){
				if(country[i]%i==0){
					countries = countries+country[i]/i;
					people = people+country[i];
				}else {
					invalid = "Invalid Data";
				}
			}
			if(people==n && !"Invalid Data".equalsIgnoreCase(invalid))
				System.out.println(countries);
			else
				System.out.println(invalid);
			testCase--;
		}
	}

}
