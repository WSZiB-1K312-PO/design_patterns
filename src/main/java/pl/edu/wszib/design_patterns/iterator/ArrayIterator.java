package pl.edu.wszib.design_patterns.iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int i = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return i < array.length;
    }

    @Override
    public T next() {
        return array[i++];
    }
}
