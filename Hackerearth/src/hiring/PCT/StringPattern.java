package hiring.PCT;

import java.util.HashMap;
import java.util.Map;

public class StringPattern {
	
	public static void main(String[] args){
		String str="abac";
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		int maxCount=0;
		for(int i=0;i<str.length();i++){
			int value = null==map.get(str.charAt(i))?0:(int)map.get(str.charAt(i));
			map.put(str.charAt(i), ++value);
			maxCount=value;
		}
		int minCount=Integer.MAX_VALUE;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()<minCount)
				minCount=entry.getValue();
			/*if(entry.getValue()!=maxCount){
				System.out.println("False");
			}*/
		}
		if(str.length()%minCount>0) System.out.println("False");
		String individual = str.substring(0, str.length()/minCount);
		int m=0;
		int n =individual.length();
		for(int i=0;i<minCount;i++){
			String tmp = str.substring(m,n);
			if(!tmp.equals(individual)) System.out.println("False");
			m=n;
			n=n+individual.length();
		}
		System.out.println("True"); 
	}

}
