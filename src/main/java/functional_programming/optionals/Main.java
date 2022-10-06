package functional_programming.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .orElseGet(() -> "default value");
    }
}
