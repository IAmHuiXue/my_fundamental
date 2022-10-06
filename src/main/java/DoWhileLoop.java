
public class DoWhileLoop {
    /**
     * The do/while loop is a variant of the while loop.
     * This loop will execute the code block once, before checking if the condition is true,
     * then it will repeat the loop as long as the condition is true.
     * <p>
     * do {
     * // code block to be executed
     * }
     * while (condition);
     */
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 2);
    }
}
