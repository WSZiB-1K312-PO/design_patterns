package pl.edu.wszib.design_patterns.composite;

public class Main {
    public static void main(String[] args) {
        final Menu menu = Menu.of(
                "MENU",
                Button.of("Button 1"),
                Menu.of(
                        "Submenu",
                        Button.of("Button 2"),
                        Button.of("Button 3")
                ),
                Button.of("Button 4")
        );

        menu.draw();
    }
}
