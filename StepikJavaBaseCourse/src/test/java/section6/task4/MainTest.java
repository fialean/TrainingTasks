package section6.task4;

import org.junit.Test;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;
import static section6.task4.Main.ternaryOperator;


public class MainTest {
    @Test
    public void testTern() {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        assertThat(safeStringLength.apply(null)).isEqualTo(0);
        assertThat(safeStringLength.apply("test")).isEqualTo(4);
    }

}