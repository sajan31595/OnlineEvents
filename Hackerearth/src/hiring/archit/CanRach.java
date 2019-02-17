package hiring.archit;

public class CanRach {

	public static void main(String[] args){
		boolean findx = isReachable(1, 4, 9);
		boolean findy = isReachable(1, 4, 23);
		System.out.println(findx && findy );
	}
	public static boolean isReachable(int a, int b, int dest){
		int sum=a+b;
		int min = Math.min(a, b);
		int max= sum-min;
		
		while( dest>=sum){
			if(dest==a ||dest==b||dest==sum )
				return true;
			else {
				min=max;
				max=sum;
				sum = max+min;
			}
		}
		return false;
	}
}
