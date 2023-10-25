package pl.edu.wszib.design_patterns.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", LocalDate.of(2023, 10, 25));
        person.setHeight(30);

        Person anna = new Person("Anna", "Nowak", LocalDate.of(1980, 7, 12), 160, null, null, null, null, null);

        Person janB = Person.builder("Jan", "Kowalski", LocalDate.of(2023, 10, 25))
                .height(30)
                .addTag("Test")
                .build();
    }
}
