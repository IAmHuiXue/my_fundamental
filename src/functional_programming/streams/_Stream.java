package functional_programming.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static functional_programming.streams._Stream.Gender.*;
import static functional_programming.streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("AISHA", PREFER_NOT_TO_SAY),
                new Person("ALEX", MALE),
                new Person("ALICE", FEMALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.name;
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
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);

        boolean containsAnyFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsAnyFemale);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE,
        PREFER_NOT_TO_SAY
    }
}
