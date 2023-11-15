package pl.edu.wszib.design_patterns.chain_of_responsibility;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final AddAttributeFilter<String> stringAddAttributeFilter = new AddAttributeFilter<>("Test", "TestValue", new AuthFilter<>());

        final Request<String> request = new Request<>(
                Map.of(AuthFilter.TOKEN, "OK"),
                "Value"
        );

        final Request<String> result = stringAddAttributeFilter.filter(request);

        System.out.println(result);
    }
}
