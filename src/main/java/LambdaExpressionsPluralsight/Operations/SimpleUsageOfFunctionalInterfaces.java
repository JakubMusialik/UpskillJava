package LambdaExpressionsPluralsight.Operations;

import LambdaExpressionsPluralsight.Interface.Consumer;
import LambdaExpressionsPluralsight.Interface.Supplier;

import java.util.ArrayList;
import java.util.List;

public class SimpleUsageOfFunctionalInterfaces {
    public static void main(String[] args) {

        //Lambda - instancja funkcjonalnego intefejsu

        //Supplier <-- nie voidowa metoda, musi coś zwrócić
        Supplier<String> supplier = () -> {
            System.out.println("Inside supplier");
            return "Hello";
        };

        String s = supplier.get();
        System.out.println(s);

        //Consumer <-- metoda voidowa
        Consumer<String> consumer = (String x) -> {
            System.out.println("Inside consumer");
            System.out.println(x);
        };

        consumer.accept("Param");


        List<String> list = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

        //Predicate, test !startsWith("t") --> output : two, three
        list.removeIf(string -> !string.startsWith("t"));

        //Consumer, sout
        list.forEach(System.out::println);
    }
}
