package section6.task1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairTest {

    @Test
    public void ofTest() {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Assert.assertEquals(java.util.Optional.of(1), java.util.Optional.ofNullable(pair.getFirst()));
        Assert.assertEquals("hello", pair.getSecond());

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        assertTrue(pair.equals(pair2));
        assertTrue(pair.hashCode() == pair2.hashCode());
    }
}