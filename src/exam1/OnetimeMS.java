package exam1;

import java.time.LocalDate;
import java.time.LocalTime;

public class OnetimeMS extends Membership {
    public OnetimeMS(LocalDate registrationDate, LocalDate closingDate, Guest guestInf) {
        super(registrationDate, closingDate, guestInf);
        boolean isEqual = true;
        if (isEqual = registrationDate.isEqual(closingDate)) {
            this.registrationDate = registrationDate;
            this.closingDate = closingDate;
        } else throw new IllegalArgumentException("дата введена неверно");
    }
}
