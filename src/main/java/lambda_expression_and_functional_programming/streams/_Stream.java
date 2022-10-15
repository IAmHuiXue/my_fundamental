package lambda_expression_and_functional_programming.streams;

import lambda_expression_and_functional_programming.utils.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static lambda_expression_and_functional_programming.utils.Gender.FEMALE;
import static lambda_expression_and_functional_programming.utils.Gender.MALE;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("ALEX", MALE),
                new Person("ALICE", FEMALE)
        );

        people.stream()
                // method reference
                .map(Person::getGender)
                // same as
                // .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.getName();
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println; // System.out.println(x)

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.getGender()));
        System.out.println(containsOnlyFemales);

        boolean containsAnyFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.getGender()));
        System.out.println(containsAnyFemale);
    }
}
