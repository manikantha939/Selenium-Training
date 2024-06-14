package Stream.IntermidiateOperations;

import java.util.Arrays;
import java.util.List;

public class Limit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
