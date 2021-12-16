import java.util.HashMap;

public class MapAdvancedAPIs {
    public static void main(String[] args) {
        /** computeIfAbsent() & computeIfPresent() */
        // https://stackoverflow.com/questions/48183999/what-is-the-difference-between-putifabsent-and-computeifabsent-in-java-8-map

        // create a HashMap and add some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);

        // print map details
        System.out.println("HashMap:\n " + map);

        // provide value for new key which is absent
        // using computeIfAbsent method
        map.computeIfAbsent("key5", k -> 2000 + 33000);
        map.computeIfAbsent("key5", k -> 2000 * 34); // will not be executed

        // print new mapping
        System.out.println("New HashMap:\n " + map);

        // Create a HashMap and add some values
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("Geeks", 1);
        wordCount.put("for", 2);
        wordCount.put("geeks", 3);

        // print HashMap details
        System.out.println("Hashmap before operation :\n " + wordCount);

        // provide new value for keys which is present
        // using computeIfPresent method
        wordCount.computeIfPresent("Geek", (k, v) -> v + 100); // will not be executed

        // print new mapping
        System.out.println("HashMap after operation :\n " + wordCount);

        // provide new value for keys which is present
        // using computeIfPresent method
        wordCount.computeIfPresent("Geeks", (k, v) -> v + 100);

        // print new mapping
        System.out.println("HashMap after operation :\n " + wordCount);
    }

}
