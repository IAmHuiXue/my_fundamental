package functional_programming.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07128374618"));
        System.out.println(isPhoneNumberValid("071283746"));
        // Predicate takes 1 argument and produces 1 boolean result
        System.out.println(isPhoneNumberValidPredicate.test("07128374618"));
        System.out.println(
                "Is phone number valid AND does it contain number 3 = "
                        + isPhoneNumberValidPredicate.and(containsNumber3).test("07128474618"));
        System.out.println(
                "Is phone number valid OR does it contain number 3 = "
                        + isPhoneNumberValidPredicate.or(containsNumber3).test("07123474618"));
        System.out.println(
                "Is phone number valid AND does it contain the given number = "
                        + isPhoneNumberValidAndContainSuchNumberPredicate.test("07123474618", "6")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String, String> isPhoneNumberValidAndContainSuchNumberPredicate = (phoneNumber, numberContain) ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11 && phoneNumber.contains(numberContain);
}
