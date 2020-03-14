package section6.task2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetUtilsTest {

    @Test
    public void symmetricDifferenceTest() {
        Set<Integer> num1 = new HashSet<>();
        num1.add(3);
        num1.add(7);
        num1.add(9);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(5);
        num2.add(7);
        num2.add(12);

        Set<Integer> result = SetUtils.symmetricDifference(num1,num2);
        System.out.println(result);
    }
}