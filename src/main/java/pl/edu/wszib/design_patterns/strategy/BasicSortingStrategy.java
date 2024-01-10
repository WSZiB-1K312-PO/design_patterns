package pl.edu.wszib.design_patterns.strategy;

import java.util.Arrays;

public class BasicSortingStrategy implements SortingStrategy {
    @Override
    public int[] sort(int[] numbers) {
        final int[] copy = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(copy);

        return copy;
    }
}
