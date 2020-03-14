package section6.task2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Реализуйте метод, вычисляющий симметрическую разность двух множеств.
 * Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
 * Пример
 * Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */

public class SetUtils {

    /**
     * Вычислить симметричную разность множеств
     *
     * @param set1
     * @param set2
     * @param <T>
     * @return
     */
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);
        Set<T> tmp = new HashSet<T>(set1);
        tmp.retainAll(set2);
        symmetricDiff.removeAll(tmp);
        return symmetricDiff;
    }
}
