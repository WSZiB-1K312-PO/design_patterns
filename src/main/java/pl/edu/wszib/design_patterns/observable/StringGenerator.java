package pl.edu.wszib.design_patterns.observable;

import lombok.AllArgsConstructor;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public class StringGenerator extends Observable<String> {
    public static final String CHARS = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

    private final ThreadLocalRandom random;

    public String generateString(int length) {
        final String string = Stream.generate(() -> random.nextInt(0, CHARS.length()))
                .limit(length)
                .map(CHARS::charAt)
                .map(character -> character + "")
                .collect(Collectors.joining());
        event(string);

        return string;
    }
}
