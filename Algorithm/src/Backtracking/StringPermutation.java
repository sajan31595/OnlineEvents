package Backtracking;

public class StringPermutation {

	public static void main(String[] args){
		char[] str = {'A','B','C','D'};
		permute(str,0,3);
	}
	public static void permute(char[] str, int left, int right){
		if(left==right) {
			display(str);
		} else {
			for(int i=left; i<=right; i++){
				swap(str,left,i);
				permute(str, left+1, right);
				swap(str,left,i);
			}
		}
	}
	public static void display(char[] str){
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]+" ");
		System.out.println();
	}
	public static char[] swap(char[] str, int left, int right){
		char tmp = str[left];
		str[left]= str[right];
		str[right] = tmp;
		return str;
	}
}
