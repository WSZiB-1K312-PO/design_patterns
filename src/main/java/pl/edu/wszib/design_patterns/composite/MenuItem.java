package pl.edu.wszib.design_patterns.composite;

public interface MenuItem {
    default void draw() {
        draw(0);
    }
    void draw(int indentation);
}
