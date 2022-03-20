package junit;

import java.util.*;

public class InitializeStaticField {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(KEYBOARD));
        System.out.println(LETTER_TO_PO);
        System.out.println(LETTER_TO_PO_2);
    }

    // this is to model a part of a keyboard
    // only including 26 letters
    // api: given a letter, return a list of its surrounding letters

    // for a letter, its neighbors are possibly left, right, up the same index, and + 1, down the same index, and - 1
    static final int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {-1, 1}, {1, 0}, {1, -1}};
    static final int R = 3;

    /** a 2-d grid builds a mapping from a position [r, c] to a letter */
    static final char[][] KEYBOARD = new char[R][];

    static {
        KEYBOARD[0] = "qwertyuiop".toCharArray();
        KEYBOARD[1] = "asdfghjkl".toCharArray();
        KEYBOARD[2] = "zxcvbnm".toCharArray();
    }

    /** a map builds a mapping from a letter to a position [r, c] */
    // this will not give you the actual [r, c] when printing
    static final Map<Character, int[]> LETTER_TO_PO = new HashMap<>();

    static {
        char[] array = "qwertyuiop".toCharArray();
        for (int i = 0; i < array.length; i++) {
            LETTER_TO_PO.put(array[i], new int[]{0, i});
        }
        array = "asdfghjkl".toCharArray();
        for (int i = 0; i < array.length; i++) {
            LETTER_TO_PO.put(array[i], new int[]{1, i});
        }
        array = "zxcvbnm".toCharArray();
        for (int i = 0; i < array.length; i++) {
            LETTER_TO_PO.put(array[i], new int[]{2, i});
        }
    }

//     or another way -> double {{..}}, do not dereference LETTER_TO_PO_2 when invoking put()
    static final Map<Character, Point> LETTER_TO_PO_2 = new HashMap<>() {
        {
            char[] array = "qwertyuiop".toCharArray();
            for (int i = 0; i < array.length; i++) {
                put(array[i], new Point(0, i));
            }
            array = "asdfghjkl".toCharArray();
            for (int i = 0; i < array.length; i++) {
                put(array[i], new Point(1, i));
            }
            array = "zxcvbnm".toCharArray();
            for (int i = 0; i < array.length; i++) {
                put(array[i], new Point(2, i));
            }
        }
    };

    static class Point {
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public String toString() {
            return "[" + r + ", " + c + "]";
        }
    }

    public static Set<Character> findSurroundingLetters(char ch) {
        Set<Character> res = new HashSet<>();
        ch = Character.toLowerCase(ch);
        if (ch < 'a' || ch > 'z') {
            return res;
        }
        int[] po = LETTER_TO_PO.get(ch);
        for (int[] dir : dirs) {
            int nr = po[0] + dir[0];
            int nc = po[1] + dir[1];
            if (isValid(nr, nc)) {
                res.add(KEYBOARD[nr][nc]);
            }
        }
        return res;
    }

    static boolean isValid(int r, int c) {
        return r >= 0 && c >= 0 && r < R && c < KEYBOARD[r].length;
    }
}
