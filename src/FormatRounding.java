import java.text.DecimalFormat;

public class FormatRounding {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        // .format() -> returns a string
        String res = formatter.format(1.1);
        Float resFloat = Float.valueOf(res);
        System.out.println(formatter.format(resFloat));

        System.out.println(formatter.format(1.11));
        System.out.println(Float.valueOf(formatter.format(1.121)));
    }
}
