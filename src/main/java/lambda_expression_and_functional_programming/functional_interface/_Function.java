package lambda_expression_and_functional_programming.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    /**
     * Function<T, R> is a functional interface that takes a single argument and returns a result.
     */
    public static void main(String[] args) {
        Function<String, Integer> map = str -> str.length();

        // how to use it -> apply()
        System.out.println(map.apply("Sky"));

        // composing functions

        // "key:value"
        // first: "key=value"
        // second: "{key=value}"

        Function<String, String> replaceColon = str -> str.replace(':', '=');
        Function<String, String> addBracket = str -> "{" + str + "}";

        System.out.println(replaceColon
                .andThen(addBracket)
                .apply("hui:xue"));

        // reverse order -> compose()
        System.out.println(addBracket
                .compose(replaceColon)
                .apply("hui:xue"));

//        System.out.println(addBracket.apply(replaceColon.apply("hui:xue")));
    }
}
