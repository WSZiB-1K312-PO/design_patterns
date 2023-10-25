package pl.edu.wszib.design_patterns.builder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PersonBuilder {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int height;
    private String street;
    private String streetNo;
    private String city;
    private String country;
    private Set<String> tags;

    public PersonBuilder(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        tags = new HashSet<>();
    }

    public PersonBuilder height(int height) {
        this.height = height;
        return this;
    }

    public PersonBuilder street(String street) {
        this.street = street;
        return this;
    }

    public PersonBuilder streetNo(String streetNo) {
        this.streetNo = streetNo;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder country(String country) {
        this.country = country;
        return this;
    }

    public PersonBuilder addTags(Set<String> tags) {
        this.tags.addAll(tags);
        return this;
    }

    public PersonBuilder addTag(String tag) {
        this.tags.add(tag);
        return this;
    }

    public PersonBuilder clearTags() {
        this.tags.clear();
        return this;
    }

    public Person build() {
        return new Person(name, surname, dateOfBirth, height, street, streetNo, city, country, tags);
    }
}
