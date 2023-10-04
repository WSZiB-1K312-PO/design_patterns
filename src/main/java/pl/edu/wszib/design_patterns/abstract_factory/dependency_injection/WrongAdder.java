package pl.edu.wszib.design_patterns.abstract_factory.dependency_injection;

public class WrongAdder {
    private final Printer printer = new ConsolePrinter();

    public void add(int a, int b) {
        printer.print(a + " + " + b + " = " + (a + b));
    }
}
