package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams {
    public static void main(String[] args) {
        //primitive Array
        int[] primitiveArray={1,3,2,4,5};

        double[] primitiveArray1={1,3,2,4,5};

        //Object Array
        Integer[] objectArray={1,2,3,5,4};

        DoubleStream te = Arrays.stream(primitiveArray1);
        te.forEach(System.out::println);

        final IntStream intStream = Arrays.stream(primitiveArray);
        intStream.forEach(System.out::println);

        final Stream<Integer> IntegerStream = Stream.of(objectArray);
        IntegerStream.forEach(System.out::println);

        List<Integer> integerList=Arrays.asList(1,2,3,4);
        integerList.stream().forEach(System.out::println);
    }
}
