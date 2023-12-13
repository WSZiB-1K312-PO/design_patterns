package pl.edu.wszib.design_patterns.iterator;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final Integer[] array = ThreadLocalRandom.current().ints(10, -10, 11).boxed().toArray(Integer[]::new);
        final ArrayIterator<Integer> iterator = new ArrayIterator<>(array);

        while (iterator.hasNext()) {
            System.out.println("Number: " + iterator.next());
        }
    }
}
