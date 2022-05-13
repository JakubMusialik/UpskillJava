package LambdaExpressionsPluralsight.Operations;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {
    public static void main(String[] args) {

        //zwraca int jako prymityw bez wrappera
        IntSupplier intSupplier = () -> 10;
        int asInt = intSupplier.getAsInt();
        System.out.println("i: " + asInt);

        DoubleToIntFunction doubleToIntFunction = value -> (int)Math.floor(value);

        int i = doubleToIntFunction.applyAsInt(Math.PI);
        System.out.println("PI as int: " + i);
    }
}
