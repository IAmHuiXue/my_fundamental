package functional_programming.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        System.out.println(incrementByOne(0));
        System.out.println(incrementByOneFunction.apply(0));
        System.out.println(incrementByOneFunction.andThen(multipleByTenFunction).apply(0));
        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 10));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 10));
    }

    static int incrementByOne(int number) {
        return number + 1;
    }
    // <input, result>
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multipleByTenFunction =
            number -> 10 * number;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    // <input1, input2, result>
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> numberToMultiplyBy * (numberToIncrementByOne + 1);
}
