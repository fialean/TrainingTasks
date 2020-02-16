package section2.task3;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 * <p>
 * Sample Input: 0.1 0.2 0.3; Sample Output: true
 *
 * @author Firsin
 * @since 30.08.2018
 */

public class CorrectFloatSum {

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) <= 0.0001;
    }
}
