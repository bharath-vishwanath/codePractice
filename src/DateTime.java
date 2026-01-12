import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args){
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("unformatted Time right now is: " + currentTime);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
        String foramttedDateTime = currentTime.format(pattern);
        System.out.println("Formatted time right now: " + foramttedDateTime);
    }

}
