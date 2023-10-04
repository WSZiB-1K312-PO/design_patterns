package pl.edu.wszib.design_patterns.abstract_factory.singleton;

public class Singleton {
    private static Singleton INSTANCE = new Singleton("The Only One");

    public static final Singleton get() {
        return INSTANCE;
    }

    private final String name;

    private Singleton(String name) {
        if(INSTANCE != null) {
            throw new RuntimeException("Not this time!");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
