package section2.task5;

import org.junit.Test;
import section2.task2.YaerCount;

import static org.junit.Assert.*;

/**
 * Тестирование lesson2.task5.Cast {@link CharD}
 *
 * @author Firsin
 * @since 31.08.2018
 */
public class CharDTest {
    /**
     * Проверка результатов
     */
    @Test
    public void charExpression() {
        assertEquals(CharD.charExpression(32), '|');
        assertEquals(CharD.charExpression(29), 'y');
    }
}