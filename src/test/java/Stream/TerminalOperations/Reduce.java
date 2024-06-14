package Stream.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> int111= Arrays.asList(1,2,3,4,5);
        int111.stream().peek(System.out::println);
        int sum=int111.stream()
                .reduce(0, (a,b)-> a+b);
        System.out.println(sum);

        int reduce = IntStream.rangeClosed(1, sum).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
