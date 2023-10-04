package pl.edu.wszib.design_patterns.abstract_factory.singleton;

public enum TrueSingleton {
    INSTANCE("The One");
    private final String name;

    TrueSingleton(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
