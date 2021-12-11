
import java.util.Arrays;
import java.util.List;

public class ListOfVSArraysAsList {
    // List.of() vs Arrays.asList()
    public static void main(String[] args) {
        // Arrays.asList returns a MUTABLE list
        List<String> list = Arrays.asList("1", "2", null);
        list.set(1, "3"); // OK

        // while the list returned by List.of is IMMUTABLE
        List<Integer> list2 = List.of(1, 2, 3);
        list2.set(1, 10); // Fails with UnsupportedOperationException
    }
}
