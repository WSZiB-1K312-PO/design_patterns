package pl.edu.wszib.design_patterns.state;

public class UppercasePrinterState implements PrinterState {
    @Override
    public PrinterState print(String text) {
        System.out.println(text.toUpperCase());
        return new LowercasePrinterState();
    }
}
