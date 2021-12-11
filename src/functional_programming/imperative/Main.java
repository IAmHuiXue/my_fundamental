package functional_programming.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functional_programming.imperative.Main.Gender.*;


public class Main {
    public static void main(String[] args) {
        // List.of() -> returns a fixed size list
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("AISHA", FEMALE),
                new Person("ALEX", MALE),
                new Person("ALICE", FEMALE)
        );

        // imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("-------------");

        // declarative approach
        people.stream()
                .filter(p -> FEMALE.equals(p.gender))
                .forEach(System.out::println);

        System.out.println("-------------");

        List<Person> females2 = people.stream()
                .filter(p -> FEMALE.equals(p.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);


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
        FEMALE
    }
}
