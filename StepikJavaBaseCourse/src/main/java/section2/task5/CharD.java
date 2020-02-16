package section2.task5;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 * <p>
 * Sample Input 1: 32; Sample Output 1: |;
 * Sample Input 2: 29; Sample Output 2: y;
 *
 * @author Firsin
 * @since 31.08.2018
 */

public class CharD {

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

}
