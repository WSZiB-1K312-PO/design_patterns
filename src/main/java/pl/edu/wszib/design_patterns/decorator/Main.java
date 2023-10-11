package pl.edu.wszib.design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        ConsoleWriter consoleWriter = new ConsoleWriter();

        writeSentence(new ColorWriterDecorator(consoleWriter, Color.RED, Color.BLACK));
        writeSentence(consoleWriter);
    }

    public static void writeSentence(Writer writer) {
        writer.writeLine("Fabulas reprehendunt potenti facilis odio");
    }
}
