package hiring.AmericanExpress;

import java.util.Scanner;

public class LongestL {

	private class ShellObject{
		int maxLength=0;
		int currentLength =0;
		boolean down =true;
		boolean right = false;
	}
	public static void main(String[] args){
		try{

			Scanner sc = new Scanner( System.in );
			int n =8;// sc.nextInt();
			int m = 5;//sc.nextInt();

			String[] arr = {".**.*","..*.*",".**..","..***","*****",".*...",".*.**","..*.." };//new String[n];
			/*for(int i=0;i<n;i++){
				arr[i] = sc.nextLine();
			}*/

			ShellObject[][] shells = new ShellObject[n][m]; 

			for(int i=0;i<n-1;i++){
				for(int j=0;j<m-1;j++){
					if(arr[i].charAt(j+1)=='.' && arr[i+1].charAt(j)=='.'){
						shells[i][j].currentLength =0;
						continue;
					}else{
						if(logicalXOR(arr[i].charAt(j+1)=='.',arr[i+1].charAt(j)=='.')){
							if(shells[i][j].down && arr[i+1].charAt(j)=='.'){
								shells[i][j].currentLength++;
								shells[i][j].down = true;
							}else if((shells[i][j].right || shells[i][j].down) && arr[i].charAt(j+1)=='.'){
								shells[i][j].down=false;
								shells[i][j].right =true;
								shells[i][j].currentLength++;
								if(shells[i][j].currentLength> shells[i][j].maxLength){
									shells[i][j].maxLength = shells[i][j].currentLength;
								}
							}
						}
					}
				}
			}
			int maxLength =0;
			for(int i=0;i<n-1;i++){
				for(int j=0;j<m-1;j++){
					if(maxLength<shells[i][j].maxLength){
						maxLength=shells[i][j].maxLength;
					}
				}
			}
			System.out.println(maxLength);
				
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static boolean logicalXOR(boolean x, boolean y) {
	    return ( ( x || y ) && ! ( x && y ) );
	}
}
