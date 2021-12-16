
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class
JavaArrayList {
    /**
     * ArrayList is regarded as a resizable array.
     * E get(int index) --> like array[index]
     * size() --> size means the number of used cells, not the capacity
     * add(E element) --> append element to the end of the list
     * add(int index, E e) --> append specified element at the specified position in the list
     * remove(int index)
     * clear()
     */
    public static void main(String[] args) {
        // A String ArrayList
        List<String> cars = new ArrayList<>(); // Command to create an empty ArrayList
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("BMW");
        System.out.println(cars);
        /* for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
         */
        System.out.println(cars.size());
        System.out.println();
        System.out.println(cars.get(0));
        System.out.println();
        cars.remove(0);
        System.out.println(cars);
        System.out.println();
        
        // Sort an ArrayList
        // Collection class in java.util package which include sort() method
        // it can sort lists alphabetically or numerically
        Collections.sort(cars);  // Sort cars
        System.out.println(cars);
        System.out.println();
        cars.clear();
        System.out.println(cars);
        System.out.println();
        
        List<Integer> list = new ArrayList<>(); // Command to create an empty ArrayList
        /**
         * Elements in an ArrayList are actually objects.
         * To use primitive types, we must specify an equivalent wrapper class:
         *         // byte -> Byte
         *         // short -> Short
         *         // int -> Integer
         *         // long -> Long
         *         // float -> Float
         *         // double -> Double
         *         // char -> Character
         *         // boolean -> Boolean
         */
        System.out.println(list.size());
        list.add(1); //  add at tail
        System.out.println(list.size());
        list.add(9);
        list.add(8);
        System.out.println(list);
        System.out.println();
        System.out.println(list.get(0)); //  like array[0];
        Collections.sort(list);
        System.out.println(list);
    }
}
