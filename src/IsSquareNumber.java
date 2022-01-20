
public class IsSquareNumber {
    /**
     * The perfect square or square number is a POSITIVE INTEGER that is square of an integer.
     *
     * In other words, when we multiply two SAME numbers together, then the product that we get is called the perfect square.
     *
     * In short, it is the product of two positive equal integers or product of an integer with itself.
     *
     * We can check by using sqrt() & floor() method
     *
     */

    public static boolean isSquareNum(int num) {
        if (num <= 0) {
            return false;
        }
        // calculates the square ROOT of the given number
        double sqrt = Math.sqrt(num * 1.0);
        // finds the floor value of the square root and compares it with zero
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
