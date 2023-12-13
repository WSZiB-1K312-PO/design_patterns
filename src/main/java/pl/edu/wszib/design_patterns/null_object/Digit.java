package pl.edu.wszib.design_patterns.null_object;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class Digit {
    private static final Map<String, Digit> DIGITS = Stream.of(
            new Digit("Zero", 0),
            new Digit("One", 1),
            new Digit("Two", 2),
            new Digit("Three", 3),
            new Digit("Four", 4),
            new Digit("Five", 5),
            new Digit("Six", 6),
            new Digit("Seven", 7),
            new Digit("Eight", 8),
            new Digit("Nine", 9)
    ).collect(Collectors.toMap(digit1 -> digit1.getName().toLowerCase(), Function.identity()));

    private static final Digit NULL = new Digit("NaD", -1);

    private String name;
    private int digit;

    public static Digit of(String name) {
        return DIGITS.getOrDefault(name.toLowerCase(), NULL);
    }
}
