package Program100;

import java.util.ArrayList;
import java.util.List;

public class P4GetAndSetElementInList {
    public static void main(String[] args) {
        //creating a list
        List<String> list=new ArrayList<>();
        list.add("test 1");
        list.add("test 2");
        list.add("test 3");
        list.add("test 4");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.set(0,"updated");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
