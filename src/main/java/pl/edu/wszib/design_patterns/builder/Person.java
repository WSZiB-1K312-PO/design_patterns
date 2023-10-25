package pl.edu.wszib.design_patterns.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int height;
    private String street;
    private String streetNo;
    private String city;
    private String country;
    private Set<String> tags;

    public static PersonBuilder builder(String name, String surname, LocalDate dateOfBirth) {
        return new PersonBuilder(name, surname, dateOfBirth);
    }

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        tags = new HashSet<>();
    }

    public Person(String name, String surname, LocalDate dateOfBirth, int height, String street, String streetNo, String city, String country, Set<String> tags) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.street = street;
        this.streetNo = streetNo;
        this.city = city;
        this.country = country;
        this.tags = tags != null ? tags : new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", height=" + height +
                ", street='" + street + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", tags=" + tags +
                '}';
    }
}
