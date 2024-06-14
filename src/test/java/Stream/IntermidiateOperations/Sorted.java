package Stream.IntermidiateOperations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 1, 5, 6, 3);
        list.stream()
                .sorted()
                .forEach(System.out::println);//it will sort in ascending order

        //descending order
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "chherry");

        list1.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        List<String> list2 = list1.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
        list2.forEach(System.out::println);

    }
}
