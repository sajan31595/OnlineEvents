package hiring.PCT;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneNumber {
	private static final HashMap<Integer, String> map = new HashMap<>(8);
	static {
	    map.put(2, "abc");
	    map.put(3, "def");
	    map.put(4, "ghi");
	    map.put(5, "jkl");
	    map.put(6, "mno");
	    map.put(7, "pqrs");
	    map.put(8, "tuv");
	    map.put(9, "wxyz");
	};
	public static void main(String[] args){
		
		int[] number ={8,6,6,2,6,6,5};
		
		ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> preres = new ArrayList<String>();
        res.add("");

        for (int i = 0; i < number.length; i++) {
            for (String str : res) {
                String letters = map.get(number[i]);
                for (int j = 0; j < letters.length(); j++)
                    preres.add(str + letters.charAt(j));
            }
            res = preres;
            preres = new ArrayList<String>();
        }
        //return res;
	}

	public void printWordsUtil(int number[], int curr_digit, char output[], int n){
 
	}
}
