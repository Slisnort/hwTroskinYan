package exam1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pool {
    final private String[] pool = new String[20];
    LocalDate currentDate = LocalDate.now();
    List<String> givenlist = Arrays.asList("OnetimeMS", "DailyMS", "FullMS");

    final public void passDay() {
        Fitness.open();
        boolean isAfter = true;
        for (int i = 0; i < pool.length; i++) {

            Random rand = new Random();
            boolean isEqual = true;
            if (pool != null) return;
            String randomMembership = givenlist.get(rand.nextInt(givenlist.size()));

            if ((randomMembership == "OnetimeMS") && (isEqual == currentDate.isEqual(Membership.registrationDate))) {
                pool[i] = randomMembership;
            } else if ((randomMembership == "OnetimeMS") && (isEqual != currentDate.isEqual(Membership.registrationDate))) {
                throw new IllegalArgumentException("абонемент просрочен");
            }
            if ((randomMembership == "FullMS") && (isAfter = Membership.closingDate.isAfter(currentDate))) {
                pool[i] = randomMembership;
            } else if ((randomMembership == "FullMS") && (isAfter = currentDate.isAfter(Membership.closingDate))) {
                throw new IllegalArgumentException("абонемент просрочен");
            }
            if (randomMembership == "DailyMS") {
                throw new IllegalArgumentException("абонемент не обслуживается");
            }


        }
        Fitness.close();
        }


    }
