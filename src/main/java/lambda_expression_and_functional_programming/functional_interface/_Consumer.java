package lambda_expression_and_functional_programming.functional_interface;

import java.util.List;
import java.util.function.Consumer;

public class _Consumer {
    /**
     * Consumer<T> is a functional interface that takes a single argument and returns no result.
     */
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");

        // imperative programming (for, if/else, switch/case)
        for (String item : list) {
            System.out.println(item);
        }

        // declarative programming
        list.forEach(item -> System.out.println(item));
        // method reference
        list.forEach(System.out::println);

        // chaining
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        list.forEach(print.andThen(printUpperCase));

        // how to use it -> accept()
        print.accept("Hey");
    }
}
