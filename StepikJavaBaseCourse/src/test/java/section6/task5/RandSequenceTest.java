package section6.task5;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RandSequenceTest {
    @Test
    public void testRun() {
        int[] resultValues = RandSequence.pseudoRandomStream(13).limit(10).toArray();
        int[] thrueValues = {13, 16, 25, 62, 384, 745, 502, 200, 0, 0};

        assertEquals(Arrays.toString(resultValues), Arrays.toString(thrueValues));
    }
}