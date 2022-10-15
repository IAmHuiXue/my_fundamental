package lambda_expression_and_functional_programming.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    /**
     * Predicate<T> is a functional interface that takes a single argument and returns a boolean.
     */
    public static void main(String[] args) {
        Predicate<String> isLongerThanFive = str -> str.length() > 5;

        // how to use it -> test()
        System.out.println(isLongerThanFive.test("Sky"));

        // combine predicates

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace); // &&
        Predicate<String> hasLeftOrRightBraces = hasLeftBrace.or(hasRightBrace); // ||
        Predicate<String> opposite = hasLeftBrace.negate(); // !

        System.out.println(hasLeftAndRightBraces.test("{key:value}"));


    }
}
