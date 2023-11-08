package pl.edu.wszib.design_patterns.command;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class CommandRunner {
    private final Map<String, Command> commands;

    public CommandRunner(Collection<Command> commands) {
        this.commands = commands.stream()
                .collect(toMap(Command::getName, Function.identity()));
    }


    public int run(String commandName, String[] args) {
        if(commandName.equals("exit")) {
            return 0;
        }

        Command command = commands.get(commandName);

        return command.run(args);
    }
}
