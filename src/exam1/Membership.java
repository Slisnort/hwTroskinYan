package exam1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract public class Membership {
    protected static LocalDate registrationDate;
    protected static LocalDate closingDate;
    private Guest guestInf;

    public Membership(LocalDate registrationDate, LocalDate closingDate, Guest guestInf) {
        boolean isAfter;
        boolean isEqual = true;
        if ((isAfter = closingDate.isAfter(registrationDate)) || (isEqual = registrationDate.isEqual(closingDate))) {
            this.registrationDate = registrationDate;
            this.closingDate = closingDate;
        } else throw new IllegalArgumentException("дата введена неверно");
        if (guestInf == null) throw new IllegalArgumentException("введите ФИО клиента");
        else this.guestInf = guestInf;
    }



}
