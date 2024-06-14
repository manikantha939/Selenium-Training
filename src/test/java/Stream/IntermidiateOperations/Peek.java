package Stream.IntermidiateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredList = numbers.stream()
                .map(n -> n * n)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
