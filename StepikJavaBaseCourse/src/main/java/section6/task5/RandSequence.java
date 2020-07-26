package section6.task5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RandSequence {
    public static void main(String[] args) {
        int[] c = pseudoRandomStream(13).limit(10).toArray();
        System.out.print(Arrays.toString(c));
    }
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, t -> (t*t/10)%1000);
    }
}