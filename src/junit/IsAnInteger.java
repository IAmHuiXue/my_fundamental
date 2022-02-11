package junit;

public class IsAnInteger {
    public static void main(String[] args) {
        System.out.println(IsAnInteger(1.0));
        System.out.println(IsAnInteger(1.3));
    }

    static boolean IsAnInteger(double b) {
        return b == (int) b;
    }
}
