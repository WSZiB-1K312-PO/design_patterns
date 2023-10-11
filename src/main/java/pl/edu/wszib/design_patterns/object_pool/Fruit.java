package pl.edu.wszib.design_patterns.object_pool;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Fruit {
    private static Map<String, Fruit> FRUITS = new HashMap<>();

    String name;

    public static Fruit create(String name) {
        return FRUITS.computeIfAbsent(name, Fruit::new);
    }

    @Override
    public String toString() {
        return name;
    }
}
