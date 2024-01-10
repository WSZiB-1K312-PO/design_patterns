package pl.edu.wszib.design_patterns.strategy;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class PrintSorted {
    private final SortingStrategy strategy;

    public void print(int[] numbers) {
        final int[] sorted = strategy.sort(numbers);

        System.out.println(Arrays.toString(sorted));
    }
}
