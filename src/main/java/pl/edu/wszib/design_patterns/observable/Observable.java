package pl.edu.wszib.design_patterns.observable;

import java.util.HashSet;
import java.util.Set;

public class Observable<T> {
    private final Set<Subscriber<T>> subscribers = new HashSet<>();

    public void addSubscriber(Subscriber<T> subscriber) {
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber<T> subscriber) {
        subscribers.remove(subscriber);
    }

    public void event(T data) {
        subscribers.forEach(subscriber -> subscriber.process(data));
    }
}
