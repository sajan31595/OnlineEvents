package hiring.archit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinaryComplement {

	public static void main(String[] args){
		
		int x=10;
		String binary = Integer.toBinaryString(x);
		String binaryOut = "";
		for(int i =0;i<binary.length();i++){
			binaryOut = binaryOut+""+String.valueOf((1-Integer.parseInt(String.valueOf(binary.charAt(i)))));
		}
		System.out.println(Double.compare(1, 1));
		Collections.sort(new ArrayList<Integer>(), new Comparator<Integer>(){
			public int compare(Integer idx1, Integer idx2) {
		        return Integer.compare(idx1,idx2);
		    }
		});
		System.out.println(binaryToDecimal(Integer.parseInt(binaryOut))); 
	}
	
	public static int binaryToDecimal(int binaryNumber){
	    int decimal = 0;
	    int p = 0;
	    while(true) {
	      if(binaryNumber == 0) {
	        break;
	      } else {
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	       }
	    }
	    return decimal;
	  }
}
