package exam1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GroupTraining {
    final private String[] groupTraining = new String[20];
    LocalDate currentDate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();
    LocalTime endTimeDailyMS = LocalTime.of(16, 0, 0);
    List<String> givenlist = Arrays.asList("OnetimeMS", "DailyMS", "FullMS");

    final public void passDay() {
        Fitness.open();
        boolean isAfter;
        for (int i = 0; i < groupTraining.length; i++) {

            Random rand = new Random();
            boolean isEqual = true;
            if (groupTraining != null) return;
            String randomMembership = givenlist.get(rand.nextInt(givenlist.size()));

            if (randomMembership == "OnetimeMS") {
                throw new IllegalArgumentException("абонемент не обслуживается");
            }
            if ((randomMembership == "FullMS") && (isAfter = Membership.closingDate.isAfter(currentDate))) {
                groupTraining[i] = randomMembership;
            } else if ((randomMembership == "FullMS") && (isAfter = currentDate.isAfter(Membership.closingDate))) {
                throw new IllegalArgumentException("абонемент просрочен");
            }
            if ((randomMembership == "DailyMS") && (isAfter = currentTime.isAfter(endTimeDailyMS))) {
                groupTraining[i] = randomMembership;
            } else if ((randomMembership == "DailyMS") && (isAfter = endTimeDailyMS.isAfter(currentTime))) {
                throw new IllegalArgumentException("абонемент не обслуживается в это время");
            }


        }
        Fitness.close();
    }


}
