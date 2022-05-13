package LambdaExpressionsPluralsight.Operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class CreatingComparators {
    public static void main(String[] args) {

//        2 lub więcej parametrów w lambdzie musi być w ()
        List<String> list = Arrays.asList("one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten");

//        sortowanie alfabetyczne
        Comparator<String> c1 = (s1, s2) -> s1.compareTo(s2);

        list.sort(c1);
        System.out.println(list);

//        sortowanie po długości stringa
        Comparator<String> c2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
//        lub
//        Function<String,Integer> getLength = s -> s.length();
//        Comparator<String> c3 = Comparator.comparing(getLength);
//        lub by uniknąć autoboxingu
//        ToIntFunction<String> stringLength = s -> s.length();
//        Comparator<String> c3 = Comparator.comparingInt(stringLength);

        list.sort(c2);
        System.out.println(list);


    }
}
