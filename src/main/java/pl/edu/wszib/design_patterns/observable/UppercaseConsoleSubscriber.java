package pl.edu.wszib.design_patterns.observable;

public class UppercaseConsoleSubscriber implements Subscriber<String> {

    @Override
    public void process(String data) {
        System.out.println("Event: " + data.toUpperCase());
    }
}
