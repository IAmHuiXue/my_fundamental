
public class StringClass {
    public static void main(String[] args) {
        /**
         * A String in Java is actually an object,
         * which contain methods that can perform certain operations on strings.
         * For example, the length of a string can be found with the length() method:
         */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7 including whitespace

        // Special characters
        //  \' --> '    \" --> "    \\ --> \
        System.out.println("We are the so-called \"Vikings\" from the north.");
    }
}
