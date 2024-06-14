package Stream.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenSquaredList = list.stream()
                .filter(n -> n % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
//        evenSquaredList.forEach(System.out::println);
        System.out.println(evenSquaredList);
    }
}
