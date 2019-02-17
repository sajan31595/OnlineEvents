package hiring.wissen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneValue {

	private class NumberCount{
		int key;
		int count;
	}
	
	private static int highestnumber=-1;
	private static int leastFrequencyCount=Integer.MAX_VALUE;
	private static int leastNumber=-1;
	private static int highestFrequestCount = 0;
	private static Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
	public static void main(String[] args){
		Scanner scanner = new Scanner( System.in );
		int queries = scanner.nextInt();
		//Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		while(queries>0){
			//List<NumberCount> numbers = new ArrayList<NumberCount>();
			int querynum = scanner.nextInt();
			if(querynum==1){
				int value = scanner.nextInt();
				if(numbers.containsKey(value)){
					numbers.put(value, numbers.get(value)+1);
				}else{
					numbers.put(value, 1);
				}
				if(numbers.get(value)>=leastFrequencyCount && value<=highestnumber){
					seetLeastNumberwithHighFreq(value,numbers.get(value));
				}
				if(numbers.get(value)<=highestFrequestCount && value>=leastNumber){
					setLergestNumberwithLowFreq(value,numbers.get(value));
				}
				
			}else if(querynum==2){
				int value = scanner.nextInt();
				if(numbers.containsKey(value)){
					numbers.put(value, numbers.get(value)>0?numbers.get(value)-1:0);
				}
				rsetLeastNumberwithHighFreq(numbers);
				rsetLergestNumberwithLowFreq(numbers);
			}else if(querynum==3){
				System.out.println(highestnumber);
			}else if(querynum==4){
				System.out.println(leastNumber);
			}
			
			queries--;
		}
	}
	private static int rsetLeastNumberwithHighFreq(Map<Integer,Integer> numbers){
		if(!numbers.isEmpty()){
			for (Map.Entry<Integer, Integer> number : numbers.entrySet()){
			    //System.out.println(number.getKey() + "/" + number.getValue());
				if(number.getValue()>highestFrequestCount){
					highestFrequestCount=number.getValue();
					leastNumber= number.getKey();
				}else if(number.getValue() == highestFrequestCount && number.getKey()<leastNumber){
					leastNumber =number.getKey();
				}
			}
		}
		return leastNumber;
	}
	private static int rsetLergestNumberwithLowFreq(Map<Integer,Integer> numbers){
		if(!numbers.isEmpty()){
			for (Map.Entry<Integer, Integer> number : numbers.entrySet()){
			    //System.out.println(entry.getKey() + "/" + entry.getValue());
			    if(number.getValue()<leastFrequencyCount){
			    	leastFrequencyCount=number.getValue();
					highestnumber= number.getKey();
				}else if(number.getValue() == leastFrequencyCount && number.getKey()>highestnumber && highestnumber>0){
					highestnumber =number.getKey();
				}
			}
		}
		return highestnumber;
	}
	
	private static void seetLeastNumberwithHighFreq(int value,int count){
		if(count> highestFrequestCount){
			highestFrequestCount = count;
			leastNumber = value;
		}else if(count == leastFrequencyCount && leastNumber>value){
			leastNumber = value;
		}
	}
	private static void setLergestNumberwithLowFreq(int value,int count){
		if(count< leastFrequencyCount){
			leastFrequencyCount = count;
			highestnumber = value;
		}else if(count== leastFrequencyCount && highestnumber<value){
			highestnumber = value;
		}
	}
}
