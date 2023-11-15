package pl.edu.wszib.design_patterns.chain_of_responsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddAttributeFilter<T> implements Filter<Request<T>> {
    private final String name;
    private final Object value;

    private final Filter<Request<T>> next;

    @Override
    public Request<T> filter(Request<T> object) {
        object.getAttributes().put(name, value);

        if(next != null) {
            return next.filter(object);
        }
        return object;
    }
}
