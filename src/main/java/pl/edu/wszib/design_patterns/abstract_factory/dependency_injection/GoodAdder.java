package pl.edu.wszib.design_patterns.abstract_factory.dependency_injection;

public class GoodAdder {
    private final Printer printer;

    public GoodAdder(Printer printer) {
        this.printer = printer;
    }

    public void add(int a, int b) {
        printer.print(a + " + " + b + " = " + (a + b));
    }
}
