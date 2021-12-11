
import java.util.ArrayList;
import java.util.List;

public class CornerCases {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(); // []
        System.out.println(list.size()); // 0
        list.add(null); // [null]
        System.out.println(list.size()); // 1

        List<String> list2 = new ArrayList<>(); // []
        list2.add(""); // [""]
        System.out.println(list2.size()); // 1

        List<List<String>> list3 = new ArrayList<>(); // []
        System.out.println(list3.size()); // 0
        list3.add(null); // [null]
        System.out.println(list3.size()); // 1

        List<List<String>> list4 = new ArrayList<>(); // []
        list4.add(new ArrayList<>()); // [[]]
        System.out.println(list4.size()); // 1

        System.out.println(list3.equals(list4)); // no! [null] != [[]]
        System.out.println(list3);
        System.out.println(list4);
    }
}
