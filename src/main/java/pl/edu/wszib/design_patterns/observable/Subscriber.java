package pl.edu.wszib.design_patterns.observable;

public interface Subscriber<T> {
    void process(T data);
}
