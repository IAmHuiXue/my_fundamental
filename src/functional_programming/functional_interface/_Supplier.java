package functional_programming.functional_interface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlListSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    // Supplier normally does not contain any arguments and return a supplier of results
    static Supplier<String>  getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>>  getDBConnectionUrlListSupplier = ()
            -> List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/items");
}