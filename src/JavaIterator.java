
import java.util.ArrayList;

import java.util.Iterator;

public class JavaIterator {
    /**
     * An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
     * It is called an "iterator" because "iterating" is the technical term for looping.
     */

    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get an iterator
        Iterator<String> iter = cars.iterator();

        // Print the first item
        System.out.println(iter.next());

        // To loop through a collection, use the hasNext() and next() methods of the Iterator
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Iterators are designed to easily change the collections that they loop through.
        // The remove() method can remove items from a collection while looping.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println("\n" + numbers);
        // Trying to remove items using a for loop or a for-each loop would not work correctly
        // because the collection is changing size at the same time that the code is trying to loop.
    }
}
