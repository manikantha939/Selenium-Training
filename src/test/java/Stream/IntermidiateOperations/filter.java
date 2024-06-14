package Stream.IntermidiateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
//        //primitive Array
        int[] arr={1,2,3,4,5,6};
        Arrays.stream(arr).filter(num->num%2==0).forEach(System.out::println);

//        IntStream a =Arrays.stream(arr);
//        a.forEach(System.out::println);
//
//        //objectArray
//        Integer [] obj={1,2,3,4,5};
//        Stream<Integer> b = Stream.of(obj);
//        b.forEach(System.out::println);

        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);

        numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(numbers.stream().count());
    }
}
