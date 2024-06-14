package Program100;

import java.util.ArrayList;
import java.util.List;

public class P1Arrayist {
    public static void main(String[] args) {
        //creating a list
        List<String> list=new ArrayList<>();
        //adding a frits to the list
        list.add("Mango");
        list.add("Banana");
        list.add("apple");
        list.add("grapes");
        //iterating the list of fruit using for each loop
        for (String fruit: list) {
            System.out.println(fruit);
        }

    }
}
