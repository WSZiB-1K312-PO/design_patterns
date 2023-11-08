package pl.edu.wszib.design_patterns.command;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandRunner commandRunner = new CommandRunner(
                List.of(
                        new EchoCommand()
                )
        );

        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            line = scanner.nextLine();

            String[] lineArgs = line.split("\\s+");

            commandRunner.run(lineArgs[0], Arrays.copyOfRange(lineArgs, 1, lineArgs.length));
        } while (!line.equals("exit"));
    }
}
