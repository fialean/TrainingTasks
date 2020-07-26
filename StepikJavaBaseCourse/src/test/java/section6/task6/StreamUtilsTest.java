package section6.task6;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamUtilsTest {
    @Test
    public void testRun() {
        Stream<Integer> intStream = Stream.of(1, 2, -3, 10, 5, 6, 7, 0, 9);
        StreamUtils.findMinMax(intStream, (a1, a2) -> {
            if (a1 == a2) {
                return 0;
            }

            if (a1 > a2) {
                return 1;
            }

            return -1;
        }, (x, y) -> {
            assertEquals(x.intValue(), -3);
            assertEquals(y.intValue(), 10);
        });
    }
}