package exam1;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Guest(String name, String surname, LocalDate dateOfBirth) {
        if (name == null || name.trim().length() < 3) throw new IllegalArgumentException("name должен быть не меньше 3");
        else this.name = name;
        if (surname == null || surname.trim().length() < 3) throw new IllegalArgumentException("surname должен быть не меньше 3");
        else this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

}
