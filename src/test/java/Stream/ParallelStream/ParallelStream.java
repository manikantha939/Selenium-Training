package Stream.ParallelStream;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ParallelStream {
    public static void main(String[] args) {
        long[] longArray = new long[20000];
        for (int i=0;i<longArray.length;i++){
            longArray[i]=i+1;
            System.out.println(longArray[i]);
        }

        //calculate sum of factorials using sequential stream
        long startTime=System.currentTimeMillis();
        long sequentialSum = Arrays.stream(longArray)
                .map(ParallelStream::factorial).sum();
        long endTime=System.currentTimeMillis();
        System.out.println("Sequential sum of factorial: "+sequentialSum);
        System.out.println("Time taken by Sequential Stream: "+(endTime-startTime)+"ms");

        //calculate sum of factorials using parallel stream
        long startTime1=System.currentTimeMillis();
        long parallelSum = Arrays.stream(longArray)
                .parallel()
                .map(ParallelStream::factorial).sum();
        long endTime1=System.currentTimeMillis();
        System.out.println("Parallel sum of factorial: "+parallelSum);
        System.out.println("Time taken by Parallel Stream: "+(endTime1-startTime1)+"ms");
    }

    private static long factorial(long number) {
        return LongStream.rangeClosed(1, number).reduce(1, (a,b)-> a*b);
    }

}
