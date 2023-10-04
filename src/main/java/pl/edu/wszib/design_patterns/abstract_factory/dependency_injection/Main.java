package pl.edu.wszib.design_patterns.abstract_factory.dependency_injection;

public class Main {
    public static void main(String[] args) {
        WrongAdder wrongAdder = new WrongAdder();

        wrongAdder.add(3, 6);

        ConsolePrinter consolePrinter = new ConsolePrinter();
        GoodAdder goodAdder = new GoodAdder(consolePrinter);

        goodAdder.add(6, 1);
    }
}
