package pl.edu.wszib.design_patterns.command;

public class EchoCommand implements Command {
    @Override
    public int run(String[] args) {
        for (String arg: args) {
            System.out.println(arg);
        }
        return 0;
    }

    @Override
    public String getName() {
        return "echo";
    }
}
