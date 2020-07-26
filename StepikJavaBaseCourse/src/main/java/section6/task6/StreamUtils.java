package section6.task6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class StreamUtils {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        Object[] o = new Object[2];
        o[0] = null;
        o[1] = null;

        stream.forEach(x -> {
            if (o[0] == null) o[0] = x;
            if (o[1] == null) o[1] = x;
            if (order.compare((T) o[0], x) > 0) o[0] = x;
            if (order.compare((T) o[1], x) < 0) o[1] = x;
        });

        minMaxConsumer.accept((T) o[0], (T) o[1]);
    }
}
