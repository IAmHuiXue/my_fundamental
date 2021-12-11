
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        // a map cannot contain duplicate keys
        // the types of key & value could be the same, or different
        Map<String, String> capitalCities = new HashMap<>();
        // to add items to it, use the put()

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // To access a value in the HashMap, use the get() method and refer to its key
        System.out.println(capitalCities.get("England"));

        // To remove an item, use the remove() method and refer to the key
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // To find out how many items there are, use the size() method
        System.out.println(capitalCities.size());

        // Loop through the items of a HashMap with a for-each loop.
        // Use the keySet() method if you only want the keys, and use the values() method if you only want the values
        for (String i : capitalCities.keySet()) { // Print keys
            System.out.println(i);
        }
        for (String i : capitalCities.values()) { // Print values
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) { // Print keys and values
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // To remove all items, use the clear() method
        capitalCities.clear();
        System.out.println(capitalCities);


        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }

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
        map.computeIfAbsent("key5", k -> 2000 * 34);

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
        wordCount.computeIfPresent("Geek", (key, val) -> val + 100);

        // print new mapping
        System.out.println("HashMap after operation :\n " + wordCount);

        // provide new value for keys which is present
        // using computeIfPresent method
        wordCount.computeIfPresent("Geeks", (key, val) -> val + 100);

        // print new mapping
        System.out.println("HashMap after operation :\n " + wordCount);

    }

}
