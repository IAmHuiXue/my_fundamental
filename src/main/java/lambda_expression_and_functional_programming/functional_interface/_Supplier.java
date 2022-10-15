package lambda_expression_and_functional_programming.functional_interface;

import java.util.function.Supplier;

public class _Supplier {
    /**
     * Supplier<T> is a functional interface that takes no arguments and returns a result.
     */
    public static void main(String[] args) {
        Supplier<Double> getRandom = () -> Math.random();
//        Supplier<Double> getRandom = Math::random;

        // how to use it -> get()
        double random = getRandom.get();
        System.out.println(random);
    }
}