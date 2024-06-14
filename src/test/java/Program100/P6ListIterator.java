package Program100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class P6ListIterator {
    public static void main(String[] args) {
        //creating a list
        List<String> list=new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //adda list Iterator
        ListIterator<String> li= list.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(li.hasNext()){
            System.out.println("index:"+li.nextIndex()+" value:"+li.next());
        }

        System.out.println("Traversing elements in backward direction");
        while(li.hasPrevious()){
            System.out.println("index:"+li.previousIndex()+" value:"+li.previous());
        }

    }
}
