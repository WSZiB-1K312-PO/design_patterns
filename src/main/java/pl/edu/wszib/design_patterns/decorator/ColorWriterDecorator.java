package pl.edu.wszib.design_patterns.decorator;

public class ColorWriterDecorator implements Writer {
    private final Writer writer;
    private final Color foreground;
    private final Color background;

    public ColorWriterDecorator(Writer writer, Color foreground, Color background) {
        this.writer = writer;
        this.foreground = foreground;
        this.background = background;
    }

    @Override
    public void write(String string) {
        writer.write(foreground.getForeground());
        writer.write(background.getBackground());
        writer.write(string);
        writer.write(Color.BLACK.getForeground());
        writer.write(Color.WHITE.getBackground());
    }

    @Override
    public void writeLine(String line) {
        writer.write(foreground.getForeground());
        writer.write(background.getBackground());
        writer.writeLine(line);
        writer.write(Color.BLACK.getForeground());
        writer.write(Color.WHITE.getBackground());
    }
}
