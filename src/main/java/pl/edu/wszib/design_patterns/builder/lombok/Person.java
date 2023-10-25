package pl.edu.wszib.design_patterns.builder.lombok;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @NonNull
    private LocalDate dateOfBirth;
    private int height;
    private String street;
    private String streetNo;
    private String city;
    private String country;
    @Singular
    private Set<String> tags;
}
