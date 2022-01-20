
public class JavaSwitch {
    // Use the switch statement to select one of many code blocks to be executed.
    /**
     * switch(expression) {
     *   case x:
     *     // code block
     *     break;
     *   case y:
     *     // code block
     *     break;
     *   default:
     *     // code block
     * }
     *
     * This is how it works:
     *
     * The switch expression is evaluated once.
     * The value of the expression is compared with the values of each case.
     * If there is a match, the associated block of code is executed.
     * The break and default keywords are optional, and will be described later in this chapter
     *
     */
    public static void main(String[] args) {
        dayCheck(7);
        dayCheck(2);
    }

    static void dayCheck(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:            // The default keyword specifies some code to run if there is no case match
                System.out.println("Weekends!");
        }
    }
}
