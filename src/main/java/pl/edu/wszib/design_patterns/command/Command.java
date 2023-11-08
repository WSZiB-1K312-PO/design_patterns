package pl.edu.wszib.design_patterns.command;

public interface Command {
    int run(String[] args);

    String getName();
}
