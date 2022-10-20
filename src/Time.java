import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Time {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDT = LocalDateTime.now();
        System.out.println(myDT);
    }
}
