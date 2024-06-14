package Program100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P5SortList {
    public static void main(String[] args) {
        //creating a list
        List<String> list=new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Sorting the list
        System.out.println("Before sorting: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);

    }
}
