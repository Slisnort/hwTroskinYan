package exam1;

import java.time.LocalDate;

public class DailyMS extends Membership {
    public DailyMS(LocalDate registrationDate, LocalDate closingDate, Guest guestInf) {
        super(registrationDate, closingDate, guestInf);
    }
}
