package hiring.sorocco;

import java.util.Arrays;

public class SmallestNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args){
		String num="9625635";
		int[] numarr = new int[num.length()];
        int smallestCount =0;
        int small =9;
        int largest=0;
        for(int i=0;i<num.length();i++){
            numarr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(small>numarr[i]){
                small=numarr[i];
                smallestCount=1;
            }else if(small==numarr[i]){
                smallestCount++;
            }if(largest<numarr[i]){
                largest=numarr[i];   
            }
        }
        Arrays.sort(numarr);
        StringBuffer finalStr= new StringBuffer();
        int count=-1;
        do{
        	count = count+1;
            if(String.valueOf(num.charAt(count)).equals(String.valueOf(numarr[count]))){
            	finalStr.append(numarr[count]);
            }else{
            	char temp=num.charAt(count);
            	finalStr.append(numarr[count]);
            	finalStr.append(num.substring(count+1, num.length()));
            	finalStr.setCharAt(num.lastIndexOf(String.valueOf(numarr[count])),temp);
            	break;
            }
        }while(numarr[count]==small);
        System.out.println(finalStr);
        finalStr.toString();
	}
}
