package Stream.IntermidiateOperations;

import java.util.Arrays;
import java.util.List;

public class map {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("hello","hi","bye","seeyou");
        name.stream().map(String::toUpperCase).forEach(System.out::println);
        name.stream().map(na-> na.toLowerCase()).forEach(System.out::println);

        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
        numbers.stream().map(Integer::doubleValue).forEach(System.out::println);
        numbers.stream().map(x-> x*x).forEach(System.out::println);
    }
}
