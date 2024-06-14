package Program100;

import java.util.HashMap;
import java.util.Scanner;

public class countTheNumberOfCharactersInAStringUsingHashMap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input");
        String str = scanner.nextLine();
        System.out.println(numberCharacters(str));
    }
    public static HashMap<Character, Integer> numberCharacters(String str){
        char[] characters = str.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();
            for (char c:characters) {
                if (c!=' ') {
                    if (map.containsKey(c)) {
                        int count = map.get(c);
                        map.put(c, count + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        return map;
    }
}