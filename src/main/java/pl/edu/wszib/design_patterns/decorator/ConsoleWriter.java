package pl.edu.wszib.design_patterns.decorator;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String string) {
        System.out.print(string);
    }

    @Override
    public void writeLine(String line) {
        System.out.println(line);
    }
}
