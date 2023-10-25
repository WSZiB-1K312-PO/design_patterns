package pl.edu.wszib.design_patterns.lazy_initialization;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        fancyMethod(new RandomNumber());
    }

    public static void fancyMethod(RandomNumber number) {
        if(ThreadLocalRandom.current().nextBoolean()) {
            System.out.println("Number: " + number.getNumber());
        } else {
            System.out.println("Nothing!");
        }
    }
}
