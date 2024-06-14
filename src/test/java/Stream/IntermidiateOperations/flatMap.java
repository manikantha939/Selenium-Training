package Stream.IntermidiateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );
//        listOfLists.stream().forEach(System.out::println);
        listOfLists.stream()
                .flatMap(list-> list.stream())
                .map(String::toUpperCase)
                .forEach(System.out::println);

//        List<List<List<Integer>>> int1=Arrays.asList(
//                Arrays.asList(
//                        Arrays.asList(1, 2)),
//                Arrays.asList(
//                        Arrays.asList(3,4)),
//                Arrays.asList(
//                        Arrays.asList(5,6))
//        );
//        int1.stream().forEach(System.out::println);
//        List<Integer> collect = int1.stream()
//                .flatMap(lists -> lists.stream())// Flattening one level
//                .flatMap(l -> l.stream())// Flattening second level
////                .map(x-> x*x).forEach(System.out::println);
//                .collect(Collectors.toList());
//        collect.stream().map(x-> x*x).forEach(System.out::println);


    /*
    The first flatMap call flattens the list from List<List<List<Integer>>> to List<List<Integer>>.
The second flatMap call flattens it further from List<List<Integer>> to List<Integer>.
     */
    }
}
