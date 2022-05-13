package LambdaExpressionsPluralsight.Operations.Chaining;

import LambdaExpressionsPluralsight.Interface.Consumer;
import LambdaExpressionsPluralsight.Interface.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {


        //Consumer + chaining

        Consumer<String> c1 = string -> System.out.println("c1 consumes: " + string);
        Consumer<String> c2 = string -> System.out.println("c2 consumes: " + string);

        c1.accept("Hello");
        c2.accept("Hello");

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };
//        lambda chaining for both consnumers being called in 3rd consumer
//        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("Hello");


        //Predicate + chaining
        Predicate<String> isNull = s -> s == null;

        System.out.println("For null = " + isNull.test(null));
        System.out.println("For Hello = " + isNull.test("Hello"));

        Predicate<String> isEmpty = s -> s.isEmpty();

        System.out.println("For empty = " + isEmpty.test(""));
        System.out.println("For Hello = " + isEmpty.test("Hello"));
//        lambda chaining for both predicates to check if string is not null and not empty
//        Predicate<String> p = isNull.negate().and(isEmpty);

    }
}
