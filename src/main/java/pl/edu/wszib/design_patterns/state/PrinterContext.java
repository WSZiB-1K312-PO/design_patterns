package pl.edu.wszib.design_patterns.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrinterContext {
    private PrinterState state;

    public void print(String text) {
        state = state.print(text);
    }
}
