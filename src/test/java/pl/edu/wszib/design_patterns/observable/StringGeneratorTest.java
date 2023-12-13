package pl.edu.wszib.design_patterns.observable;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StringGeneratorTest {
    @Test
    void shouldGenerate() {
        final ThreadLocalRandom random = mock(ThreadLocalRandom.class);
        when(random.nextInt(0, 62))
                .thenReturn(StringGenerator.CHARS.indexOf("A"))
                .thenReturn(StringGenerator.CHARS.indexOf("t"))
                .thenReturn(StringGenerator.CHARS.indexOf("3"))
                .thenReturn(StringGenerator.CHARS.indexOf("k"))
                .thenReturn(StringGenerator.CHARS.indexOf("8"))
                .thenReturn(StringGenerator.CHARS.indexOf("b"))
                .thenReturn(StringGenerator.CHARS.indexOf("0"))
                .thenReturn(StringGenerator.CHARS.indexOf("R"))
                .thenReturn(StringGenerator.CHARS.indexOf("S"))
                .thenReturn(StringGenerator.CHARS.indexOf("q"));

        final StringGenerator generator = new StringGenerator(random);

        final String string = generator.generateString(10);

        assertEquals("At3k8b0RSq", string);
    }

}