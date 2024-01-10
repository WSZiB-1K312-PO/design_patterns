package pl.edu.wszib.design_patterns.state;

public class NormalPrinterState implements PrinterState {
    @Override
    public PrinterState print(String text) {
        System.out.println(text);
        return new UppercasePrinterState();
    }
}
