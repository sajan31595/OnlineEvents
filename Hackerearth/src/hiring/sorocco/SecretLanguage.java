package hiring.sorocco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecretLanguage {

	public static void main(String[] args){
		List<String> secret_mapping = new ArrayList<String>();
		List<String> word_list = new ArrayList<String>();
		Map<String,String> map = new HashMap<String,String>();
		for(int i=0; i<word_list.size(); i++){
			StringBuffer finalStr= new StringBuffer();
			for(int j=0;j<word_list.get(i).length();j++){
				finalStr.append(secret_mapping.get((int)word_list.get(i).charAt(j)-97));
			}
			map.put(finalStr.toString(), "Done");
			System.out.println(map.size());
		}
		
	}
	
	
	
}
