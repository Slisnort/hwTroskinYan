package exam1;

import java.time.LocalDate;

public class FullMS extends Membership{
    public FullMS(LocalDate registrationDate, LocalDate closingDate, Guest guestInf) {
        super(registrationDate, closingDate, guestInf);
    }
}
