package lambda_expression_and_functional_programming.optionals;

import lombok.Getter;

import java.util.Optional;

// The purpose of using Optional is to avoid NullPointerExceptions.
// Where to use it?
// It is intended to be used as a method RETURN type, not input parameter type.

public class Main {
//    public static void main(String[] args) {
//        Cat myCat = findCatByName("fred");
//        if (myCat != null) {
//            System.out.println(myCat.getAge());
//        } else {
//            System.out.println(0);
//        }
//    }

//    private static Cat findCatByName(String name) {
//        return new Cat(name, 3);
//    }

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("fred");
        if (optionalCat.isPresent()) {
            System.out.println(optionalCat.get().getAge());
        } else {
            System.out.println(0);
        }

        optionalCat.map(Cat::getAge)
                .orElse(0);

        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));
        myCat = optionalCat.orElseGet(() -> new Cat("UNKNOWN", 0));
        myCat = optionalCat.orElseThrow(() -> new RuntimeException("Cat not found"));



    }

    private static Optional<Cat> findCatByName(String name) {
        return Optional.ofNullable(new Cat(name, 3));
//        return Optional.ofNullable(null);
//        return Optional.empty();
    }

    @Getter
    static class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
