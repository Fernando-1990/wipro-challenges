package challenges;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Question02 {
    public static void execute() {
        System.out.println("Executing question 02.");
        // Current date
        LocalDate currentDate = LocalDate.now();

        // Last day of the year
        LocalDate lastDayYear = LocalDate.of(currentDate.getYear(), 12, 31);

        // Calculates the difference in days between the dates
        long leftDays = ChronoUnit.DAYS.between(currentDate, lastDayYear);

        System.out.println("There are " + leftDays + " days left until the end of the year.");
    }
}
