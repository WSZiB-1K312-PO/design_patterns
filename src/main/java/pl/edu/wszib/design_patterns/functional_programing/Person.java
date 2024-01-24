package pl.edu.wszib.design_patterns.functional_programing;

import java.util.ArrayList;
import java.util.List;

public final class Person {
    private final String name;
    private final String surname;
    private final List<String> tags;

    public Person(final String name, final String surname, final List<String> tags) {
        this.name = name;
        this.surname = surname;
        this.tags = new ArrayList<>(tags);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public List<String> getTags() {
        return new ArrayList<>(this.tags);
    }

    public Person withName(final String name) {
        return new Person(name, surname, new ArrayList<>(tags));
    }

    public Person withSurname(final String surname) {
        return new Person(name, surname, new ArrayList<>(tags));
    }

    public Person withTags(final List<String> tags) {
        return new Person(name, surname, new ArrayList<>(tags));
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        final Person other = (Person) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$surname = this.getSurname();
        final Object other$surname = other.getSurname();
        if (this$surname == null ? other$surname != null : !this$surname.equals(other$surname)) return false;
        final Object this$tags = this.getTags();
        final Object other$tags = other.getTags();
        if (this$tags == null ? other$tags != null : !this$tags.equals(other$tags)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Person;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $surname = this.getSurname();
        result = result * PRIME + ($surname == null ? 43 : $surname.hashCode());
        final Object $tags = this.getTags();
        result = result * PRIME + ($tags == null ? 43 : $tags.hashCode());
        return result;
    }

    public String toString() {
        return "Person(name=" + this.getName() + ", surname=" + this.getSurname() + ", tags=" + this.getTags() + ")";
    }
}
