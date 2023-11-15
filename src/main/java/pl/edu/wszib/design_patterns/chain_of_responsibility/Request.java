package pl.edu.wszib.design_patterns.chain_of_responsibility;

import lombok.Builder;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Value
@Builder
public class Request<T> {
    Map<String, Object> attributes;
    T body;

    public Request(Map<String, Object> attributes, T body) {
        this.attributes = new HashMap<>(attributes);
        this.body = body;
    }

    public <T> Optional<T> getAttribute(final String name) {
        return Optional.ofNullable((T) attributes.get(name));
    }
}
