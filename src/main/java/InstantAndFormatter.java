import java.sql.SQLOutput;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstantAndFormatter {
    /*
    According to the Java documentation, an instant is a measured timestamp from the Java epoch of 1970-01-01T00:00:00Z.
    Java 8 comes with a handy class called Instant to represent a specific instantaneous point on the timeline.
    Typically, we can use this class to record event timestamps in our applications.
     */
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant); // utc timestamp

        final String PATTERN_FORMAT = "dd.MM.yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_FORMAT)
                .withZone(ZoneId.systemDefault());
        System.out.println(formatter.format(instant));

        formatter = DateTimeFormatter.ofPattern(PATTERN_FORMAT)
                .withZone(ZoneId.of("UTC"));
        System.out.println(formatter.format(instant));

    }
}
