package Program100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3ConvertListToArray {
    public static void main(String[] args) {
//        //creating a list
//        List<String> list=new ArrayList<>();
//        //adding a frits to the list
//        list.add("Mango");
//        list.add("Banana");
//        list.add("apple");
//        list.add("grapes");
//        //converting list to array
//        String[] a=list.toArray(new String[list.size()]);
//        System.out.println("Printing Array: "+ Arrays.toString(a));
//        System.out.println("Printing List: "+list);

        //create a list
        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println("Printing the list"+num);
        //convert list to array
        Integer[] n=num.toArray(new Integer[num.size()]);
        System.out.println("List to Array: "+Arrays.toString(n));
    }
}
