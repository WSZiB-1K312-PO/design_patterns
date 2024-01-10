package pl.edu.wszib.design_patterns.state;

public class Main {
    public static void main(String[] args) {
        final PrinterContext printerContext = new PrinterContext(new NormalPrinterState());

        printerContext.print("Ala ma kota!");
        printerContext.print("Ala ma kota!");
        printerContext.print("Ala ma kota!");
        printerContext.print("Ala ma kota!");
    }
}
