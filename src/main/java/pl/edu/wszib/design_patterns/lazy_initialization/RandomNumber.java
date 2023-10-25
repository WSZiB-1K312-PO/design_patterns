package pl.edu.wszib.design_patterns.lazy_initialization;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RandomNumber {
    private Integer number;

    public RandomNumber() {

    }

    private void init() {
        this.number = ThreadLocalRandom.current().nextInt();
        try {
            //Thread.sleep(10 * 1000);
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNumber() {
        if(number == null) {
            init();
        }

        return number;
    }
}
