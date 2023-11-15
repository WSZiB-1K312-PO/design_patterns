package pl.edu.wszib.design_patterns.chain_of_responsibility;

public interface Filter<T> {
    T filter(T object);
}
