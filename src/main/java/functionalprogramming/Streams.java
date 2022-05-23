package functionalprogramming;

import functionalprogramming.Main.Gender;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static functionalprogramming.Main.Gender.FEMALE;
import static functionalprogramming.Main.Gender.MALE;

public class Streams {

    public static void main(String[] args) {


        var list = List.of(
                new Person("John",MALE),
                new Person("Robert",MALE),
                new Person("Alex",MALE),
                new Person("Alice",FEMALE),
                new Person("Nat",FEMALE)
                );

        list.stream()
                .map(person -> person.gender)
                .distinct()
                .forEach(System.out::println);

        list.stream()
                .map(person -> person.name)
                .flatMapToInt(name -> IntStream.of(name.length()))
                .sorted()
                .forEach(System.out::println);

        boolean b = list.stream()
                .anyMatch(person -> person.gender == MALE);
        System.out.println(b);

    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
}
