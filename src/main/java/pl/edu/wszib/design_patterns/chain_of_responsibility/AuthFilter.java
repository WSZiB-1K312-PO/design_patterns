package pl.edu.wszib.design_patterns.chain_of_responsibility;

import lombok.AllArgsConstructor;
import pl.edu.wszib.design_patterns.chain_of_responsibility.exception.AuthException;

import java.util.Optional;

@AllArgsConstructor
public class AuthFilter<T> implements Filter<Request<T>> {
    private final Filter<Request<T>> next;

    public AuthFilter() {
        this.next = null;
    }

    public static final String TOKEN = "TOKEN";
    @Override
    public Request<T> filter(final Request<T> request) {
        final Optional<String> token = request.getAttribute(TOKEN);

        if(token.isPresent() && "OK".equals(token.get().trim())) {
            if(next != null) {
                return next.filter(request);
            } else {
                return request;
            }
        }

        throw new AuthException();
    }
}
