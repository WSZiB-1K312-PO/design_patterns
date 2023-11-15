package pl.edu.wszib.design_patterns.chain_of_responsibility;

import org.junit.jupiter.api.Test;
import pl.edu.wszib.design_patterns.chain_of_responsibility.exception.AuthException;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AuthFilterTest {
    @Test
    void shouldDoFilter() {
        //given
        final String value = "VALUE";
        final Request<String> request = new Request<>(
                Map.of(
                        AuthFilter.TOKEN, "OK"
                ),
                value
        );
        final AuthFilter<String> authFilter = new AuthFilter<>();

        //when
        final Request<String> result = authFilter.filter(request);

        //then
        assertEquals(request, result);
    }

    @Test
    void shouldFailNoToken() {
        //given
        final String value = "VALUE";
        final Request<String> request = new Request<>(
                Map.of(),
                value
        );
        final AuthFilter<String> authFilter = new AuthFilter<>();

        //when
        assertThrows(AuthException.class, () -> authFilter.filter(request));
    }
}