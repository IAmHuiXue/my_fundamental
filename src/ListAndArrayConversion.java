
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListAndArrayConversion {
    public static void main(String[] args) {
        List<String> listOfReferenceType = new ArrayList<>();
        listOfReferenceType.add("Hello");
        listOfReferenceType.add("World");
        listOfReferenceType.add("!");

        List<Integer> listOfPrimitiveTypes = new ArrayList<>();
        listOfPrimitiveTypes.add(1);
        listOfPrimitiveTypes.add(2);
        listOfPrimitiveTypes.add(3);

        List<int[]> listOfReferenceType2 = new ArrayList<>();
        listOfReferenceType2.add(new int[] {1, 2});
        listOfReferenceType2.add(new int[] {3});
        listOfReferenceType2.add(new int[] {4, 5, 6});

        /** convert a list to array of references */
        // method 1 -> recommended in modern java by passing in an empty array
        String[] array1 = listOfReferenceType.toArray(new String[0]);
        System.out.println(Arrays.toString(array1));

        // method 2 -> not recommended, by creating an empty array
//        String[] array = new String[listOfReferenceType.size()];
//        list.toArray(array);

        /** convert a list to array of primitives */
        // currently, there is no such API provided by Java
        int[] array2 = new int[listOfPrimitiveTypes.size()];
        for (int i = 0; i < listOfPrimitiveTypes.size(); i++) {
            array2[i] = listOfPrimitiveTypes.get(i);
        }
        System.out.println("\n" + Arrays.toString(array2));

        // the method below will not work for primitive type
//        int[] array = listOfPrimitiveTypes.toArray(new int[0]);

        /** convert an array of references to list */
        // fixed-size list
        List<String> list1 = Arrays.asList(array1);
        System.out.println("\n" + list1);
        // unfixed-size
        List<String> list1Unfixed = new ArrayList<>(Arrays.asList(array1));

        /** convert an array of primitives to list */
        List<Integer> list2 = new ArrayList<>();
        for (int value : array2) {
            list2.add(value);
        }
        System.out.println("\n" + list2);

        // the method below will not work for primitive type!
//        List<Integer> list2 = Arrays.asList(array2);

        /** NOTICE: int[] array itself is an object of array. So the case below still respects the rules */
        int[][] array3 = listOfReferenceType2.toArray(new int[0][]);
        System.out.println("\n" + Arrays.deepToString(array3));

         /** Since Java 8, we can use the Stream API. We can provide a one-line solution using a Stream */
        int[] input = {1, 2, 3, 4};
        List<Integer> output1 = Arrays.stream(input).boxed().collect(Collectors.toList());

        // Alternatively, we could use IntStream
        List<Integer> output2 = IntStream.of(input).boxed().collect(Collectors.toList());

        /** But there is still not a function to convert an array of primitives to list*/

    }
}
