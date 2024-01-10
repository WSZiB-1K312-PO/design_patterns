package pl.edu.wszib.design_patterns.strategy;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final PrintSorted printSorted = new PrintSorted(new BasicSortingStrategy());

        final ThreadLocalRandom random = ThreadLocalRandom.current();
        int[] tab = new int[20];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(-10, 11);
        }

        printSorted.print(tab);
    }
}
