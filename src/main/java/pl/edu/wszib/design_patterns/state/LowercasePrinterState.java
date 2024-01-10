package pl.edu.wszib.design_patterns.state;

public class LowercasePrinterState implements PrinterState {
    @Override
    public PrinterState print(String text) {
        System.out.println(text.toLowerCase());
        return new NormalPrinterState();
    }
}
