package Stream.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        boolean b = list.stream()
                .anyMatch(x-> x%2==0);
        System.out.println(b);
    }
}
