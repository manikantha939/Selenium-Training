package Program100;

import java.util.HashMap;
import java.util.Scanner;

public class countTheNumberOfWordsInAStringUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=scanner.nextLine();
        HashMap<String, Integer> v1 = numOfWord(str);
        System.out.println(v1);
    }

    public static HashMap<String, Integer> numOfWord(String str){
        String[] split=str.split(" ");
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        for (int i=0;i< split.length; i++) {
            if(map.containsKey(split[i])){
                int count=map.get(split[i]);
                map.put(split[i], count+1);
            }else {
                map.put(split[i], 1);
            }
        }
        return map;
    }
}
