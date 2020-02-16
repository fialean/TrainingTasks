package section2.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class YaerCountTest {

    @Test
    public void leapYearCount() {
        assertEquals( 0, YaerCount.leapYearCount(1));
        assertEquals( 1, YaerCount.leapYearCount(4));
        assertEquals( 24, YaerCount.leapYearCount(100));
    }
}