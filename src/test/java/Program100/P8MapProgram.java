package Program100;

import java.util.*;

public class P8MapProgram {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("vishal",20);
        map.put("harsha",30);
        map.put("kartik",35);
        //size
        System.out.println(map.size());
        //print the map
        System.out.println(map);
        // get the particular key
        if (map.containsKey("vishal")){
            int a=map.get("vishal");
            System.out.println("value for key is: "+a);
            map.remove("vishal");
        }
        System.out.println(map);
        HashMap<String,Integer>map1=new HashMap<>(map);
        map1.put("hello",2);
        System.out.println(map1);
        map1.put("kartik",1);
        System.out.println(map1);

        //printing key value pair
        for (Map.Entry<String,Integer> m : map1.entrySet()) {
            System.out.println("key: "+m.getKey()+"        value: "+m.getValue());
        }
      

        System.out.println("-------------------------------------");

        //printing only key
        Set <String> key = map1.keySet();
                for (String a : key)
                {
                    System.out.println(a);
                }

        System.out.println("-------------------------------------");
        //printing only value
         Collection<Integer> values = map1.values();
                 for (Integer value : values)
                 {
                     System.out.println(value);
                 }

    }
}
