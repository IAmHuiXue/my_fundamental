
import java.util.HashMap;

public class HashMapNullCases {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // when we instantiate a map, it contains an empty array
        // where each bucket in the array is null --> there is no pair at all

        // will return null because currently the map is empty
        System.out.println(map.get(1));
        // will both return false because there is no key or value -> no null key or null value either
        System.out.println(map.containsKey(null));
        System.out.println(map.containsValue(null));

        // when we put a pair <null, 1>, the map/array now has a pair
        // a null key, and a 1 value
        map.put(null, 1);
        System.out.println("\n" + map.containsKey(null));
        System.out.println(map.containsValue(null));

        // when we put a pair <2, null>, we have another pair with 2 key, null value
        map.put(2, null);
        System.out.println("\n" + map.containsValue(null));

        // in conclusion, a null key or a null value has nothing to do with discussing if a map is empty or not

        System.out.println("----------");

        System.out.println(map.containsKey(5)); // no, since does not have key 5
        map.put(5, 6); // new pair <5, 6> now exists
        System.out.println(map.get(5));
        System.out.println(map.containsKey(5));
        map.put(5, null); // pair becomes <5, null>

        System.out.println(map.containsKey(5)); // yes
        System.out.println(map.get(5)); // key 5 exists, but value is 'null'

        map.remove(5); // pair removed
        System.out.println(map.get(5)); // key 5 no longer exists, so no value --> null
        System.out.println(map.containsKey(5)); // no, since pair has been removed

        // NOTICE: although ln 41 & 38 both return null, they have different meaning!


    }
}
