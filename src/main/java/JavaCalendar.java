import java.util.Calendar;

public class JavaCalendar {
    // Date class is kind of deprecated
    // Calendar class was introduced in JDK 1.1, which almost replaced the Date class, also not quite user-friendly

    // Time class was introduced in java 8

    public static void main(String[] args) {
        // Calendar is an abstract class so in order to instantiate, we do
        Calendar c = Calendar.getInstance(); //

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));

        System.out.println(c.getTime());

        // set a calendar objet to a specific date
        c.set(2000, Calendar.JANUARY, 1);
        System.out.println(c.getTime());
        // add to a specified field, and other fields will also be automatically updated
        c.add(Calendar.DATE, 1);
        System.out.println(c.getTime());

    }

}
