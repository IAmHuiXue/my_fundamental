import java.text.DecimalFormat;

public class FormatRounding {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#0.00");

        System.out.println(formatter.format(1.1));
        System.out.println(formatter.format(1.11));
        System.out.println(Float.valueOf(formatter.format(1.121)));
    }
}
