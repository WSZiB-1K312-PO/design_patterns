package pl.edu.wszib.design_patterns.functional_programing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final IntFunction<Integer> add2 = processWith2(Main::add);

        System.out.println(add2.apply(4));

        final List<String> tags = new ArrayList<>();
        final Person szymon = new Person("Syzmon", "Rozkocha", tags);
        System.out.println(szymon);
        tags.add("Test2");
        final Person fixed = szymon.withName("Szymon");
        System.out.println(fixed);
        fixed.getTags().add("Test");
        System.out.println(fixed);

        final List<Integer> numbers = Stream.generate(() -> ThreadLocalRandom.current().nextInt(0, 11))
                .limit(10)
                .toList();

        final int[] sum = {0};
        for(int number : numbers) {
            sum[0] += number;
        }
        System.out.println(sum[0]);

        sum[0] = 0;
        numbers.forEach(number -> sum[0] += number);
        System.out.println(sum[0]);

        System.out.println(numbers.stream().mapToInt(value -> value).sum());
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static IntFunction<Integer> processWith2(BiFunction<Integer, Integer, Integer> function) {
        return (int a) -> function.apply(a, 2);
    }
}
