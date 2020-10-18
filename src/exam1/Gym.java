package exam1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Gym {
    final private String[] gym = new String[20];
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    LocalTime endTimeDailyMS = LocalTime.of(16, 0, 0);
    List<String> givenlist = Arrays.asList("OnetimeMS", "DailyMS", "FullMS");

    final public void passDay() {
        Fitness.open();
        boolean isAfter;
        for (int i = 0; i < gym.length; i++) {

            Random rand = new Random();
            boolean isEqual = true;
            if (gym != null) return;
            String randomMembership = givenlist.get(rand.nextInt(givenlist.size()));

            if ((randomMembership == "OnetimeMS") && (isEqual == currentDate.isEqual(Membership.registrationDate))) {
                gym[i] = randomMembership;
            } else if ((randomMembership == "OnetimeMS") && (isEqual != currentDate.isEqual(Membership.registrationDate))) {
                throw new IllegalArgumentException("абонемент просрочен");
            }
            if ((randomMembership == "FullMS") && (isAfter = Membership.closingDate.isAfter(currentDate))) {
                gym[i] = randomMembership;
            } else if ((randomMembership == "FullMS") && (isAfter = currentDate.isAfter(Membership.closingDate))) {
                throw new IllegalArgumentException("абонемент просрочен");
            }
            if ((randomMembership == "DailyMS") && (isAfter = currentTime.isAfter(endTimeDailyMS))) {
                gym[i] = randomMembership;
            } else if ((randomMembership == "DailyMS") && (isAfter = endTimeDailyMS.isAfter(currentTime))) {
                throw new IllegalArgumentException("абонемент не обслуживается в это время");
            }


        }
        Fitness.close();
    }


}
