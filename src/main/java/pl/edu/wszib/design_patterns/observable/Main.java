package pl.edu.wszib.design_patterns.observable;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        final StringGenerator generator = new StringGenerator(ThreadLocalRandom.current());

        generator.addSubscriber(new ConsoleSubscriber());
        generator.addSubscriber(new UppercaseConsoleSubscriber());

        final String string = generator.generateString(10);

        System.out.println("Random string: " + string);
    }
}
