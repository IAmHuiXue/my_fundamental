package lambda_expression_and_functional_programming.declarative;

import lambda_expression_and_functional_programming.utils.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static lambda_expression_and_functional_programming.utils.Gender.FEMALE;
import static lambda_expression_and_functional_programming.utils.Gender.MALE;


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
            if (FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("-------------");

        // declarative approach
        people.stream()
                .filter(p -> FEMALE.equals(p.getGender()))
                .forEach(System.out::println);

        System.out.println("-------------");

        List<Person> females2 = people.stream()
                .filter(p -> FEMALE.equals(p.getGender()))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);

    }
}
