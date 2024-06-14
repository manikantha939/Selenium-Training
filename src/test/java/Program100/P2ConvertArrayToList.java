package Program100;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2ConvertArrayToList {
    public static void main(String[] args) {
        String[] array={"Java","Python","c++", "php"};
        System.out.println(array.length);
        System.out.println(array);
        System.out.println("Printing Array: "+Arrays.toString(array));
        //converting array to list
        List<String>list=new ArrayList<String>();
        //way 1
        System.out.println(Arrays.asList(array));
        //way 2
        for (String lang:
             array) {
            list.add(lang);
        }
        System.out.println("Printing List: "+list);
    }
}
