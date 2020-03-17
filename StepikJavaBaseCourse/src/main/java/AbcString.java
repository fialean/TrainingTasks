import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbcString {
    public static void main(String[] args) {
        String s = "сапог сарай арбуз болт бокс биржа";
        Stream.of(s.split(" ")).collect(
                Collectors.groupingBy(s1 -> s1.substring(0, 1)))
                .entrySet().stream().filter(map->map.getValue().size()!=1)
                .collect(Collectors.joining(","))
                .forEach(s3 -> System.out.println(s3));

    }
}
