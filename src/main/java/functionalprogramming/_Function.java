package functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //Function takes 1 argument and produces one result
        int increment = increment(1);
        System.out.println(increment);


        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(apply);

        int multiply =  multiplyByTen.apply(apply);
        System.out.println(multiply);

        Function<Integer, Integer> addOneandThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTen);

        System.out.println(addOneandThenMultiplyBy10.apply(1));

        //BiFunction takes 2 arguments and produces one result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne +1) * numberToMultiplyBy;

    static Function<Integer,Integer> multiplyByTen = number -> number * 10;
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int increment(int num) {
        return num + 1;
    }
}
