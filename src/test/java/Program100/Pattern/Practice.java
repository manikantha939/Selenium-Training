package Program100.Pattern;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		String str="abcdABCDabcd";
		char[] chars=str.toCharArray();

        Map<Character, Integer> charCount=new HashMap<>();
		for (char c: chars) {
			if(charCount.containsKey(c)){
				int count=charCount.get(c);
				charCount.put(c,count+1);
			}else {
				charCount.put(c,1);
			}
		}
		System.out.println(charCount);
	}
}
