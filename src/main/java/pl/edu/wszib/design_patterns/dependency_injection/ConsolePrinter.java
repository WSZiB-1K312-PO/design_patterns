package pl.edu.wszib.design_patterns.dependency_injection;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
