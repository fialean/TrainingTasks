package section6.task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.lines().flatMap(line -> Arrays.stream(line.toLowerCase()
                .replaceAll("[^a-zа-я0-9]", " ")
                .trim()
                .split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey))
                .limit(11)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}

