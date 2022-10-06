
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaArraysAndCollections {
    /**
     * They are the placeholders of a set of utility methods** for manipulating arrays and collections objects
     *
     * - they are NOT the class for array and Collection
     * - Collection is an interface
     * - both Arrays and Collections are classes
     * - all the methods in Arrays and Collections are static methods
     *     - no need to create an Arrays/Collections object to utilize them
     */

    public static void main(String[] args) {
        // Arrays.sort(int[] array)
        int[] a = new int[] {3, 2, 1};
        Arrays.sort(a);
        // array = {1, 2, 3};

        // Arrays.sort(T[], Comparator<T> comparator)
        // use the order defined in the comparator to sort the array
        class Cell {
            int x;
            int y;
            int value;
            public Cell(int x, int y, int value) {
                this.x = x;
                this.y = y;
                this.value = value;
            }
        }
        class CellComparator implements Comparator<Cell> {
            @Override
            public int compare(Cell c1, Cell c2) {
                if (c1.value == c2.value) {
                    return 0;
                }
                return c1.value < c2.value ? -1 : 1;
            }
        }
        Cell[] cells = new Cell[] {new Cell(0, 0, 1), new Cell(1, 2, 0)};
        Arrays.sort(cells, new CellComparator());
        // cells = {(1, 2, 0), (0, 0, 1)}

        // Arrays.sort(int[] array) --> quickSort
            // avr time O(nlog(n)), space O(log(n))
            // worse time O(n^2), space O(n)
            // unstable
        // Arrays.sort(Integer[] array) --> mergeSort
            // guaranteed time O(nlog(n)), space O(n)
            // stable
        // heapSort
            // time O(nlog(n)), space O(1)
            // not preferred because of runtime overhead and poor locality (swap from first to last), hard to parallelize
        // stable sort: the order of entries with equal keys will be preserved
            // example: sort student on score first, then gender

        /** Arrays.asList(T... a) --> convert an array of references to a List */
        // return a fixed-size list backed by the specified array
        List<Integer> list = Arrays.asList(1, 2, 3);
        // list is a List of [1, 2, 3] (Integer[])
        list.set(0, 4);
        // list now is [4, 2, 3]
        list.add(5);
        // throw UnsupportedOperationException --> fixed-size

        // Arrays.copyOf(original, int newLength)
        int[] b = new int[] {1, 2, 3};
        int[] copy = Arrays.copyOf(b, 1);
        // copy = {1}
        copy = Arrays.copyOf(b, 5);
        // copy = {1, 2, 3, 0, 0}, padding default values at the end!

        // Arrays.copyOfRange(original, int indexFrom , int indexTo)
        // range is [indexFrom, indexTo)
        int[] c = new int[] {1, 2, 3};
        copy = Arrays.copyOfRange(c, 1, 2);
        // copy = {2}

        // Arrays.toString(int[] array) & Arrays.deepToString(int[][] matrix)
        int[] d = new int[] {1, 2, 3};
        String s = Arrays.toString(d);
        // s = "[1, 2, 3]"
        int[][] matrix = new int[][] {{1, 2}, {2, 3}};
        String t = Arrays.deepToString(matrix);
        // t = "[[1, 2], [2, 3]]"

        // Arrays.binarySearch(original, value)
        int[] e = new int[] {2, 3, 1};
        Arrays.sort(e);
        // the array must be guaranteed to be sorted before using BS
        int i = Arrays.binarySearch(e, 2);
        // i = 1


        // Collections.reverseOrder()-> returns a comparator reversing the natural order defined by a class implementing
        // Comparable interface
    }
}
