
public class WrapperClasses {
    /** Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects. */

    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        /**
         * Since you're now working with objects, you can use certain methods to get information about the specific object.
         *
         * For example, the following methods are used to get the value associated with the corresponding wrapper object:
         * intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue()
         */
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        /** static method valueOf()
         *
         */
        System.out.println(Integer.valueOf("1")); // return Integer
        System.out.println(Integer.parseInt("1")); // return int

        /**
         * Another useful method is the toString() method, which is used to convert wrapper objects to string.
         *
         * In the following example, we convert an Integer to a String, and use the length() method of the String class
         * to output the length of the "string"
         */
        Integer yourInt = 100;
        String yourString = yourInt.toString();
        System.out.println(yourString.length());

    }
}
