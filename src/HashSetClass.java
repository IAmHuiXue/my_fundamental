
import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    // A HashSet is a collection of items where every item is unique
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // even though BMW is added twice it only appears once in the set
        // because every item in a set has to be unique.
        cars.add("Mazda");
        System.out.println(cars);

        // To check whether an item exists in a HashSet, use the contains() method
        System.out.println(cars.contains("\nMazda"));

        // To remove an item, use the remove() method
        cars.remove("Volvo");

        // To find out how many items there are, use the size method
        System.out.println("\n" + cars.size() + "\n");

        // Loop through the items of an HashSet with a for-each loop
        for (String i : cars) {
            System.out.println(i);
        }

        // Create a HashSet object called numbers
        Set<Integer> numbers = new HashSet<>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
