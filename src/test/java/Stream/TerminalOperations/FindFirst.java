package Stream.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> first = list.stream()
                .filter(x -> x % 2 == 0)
                .findFirst();
        System.out.println(first.get());
    }
}
