package zadania;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static Collection<String> fizzbuzz(Collection<Integer> input) {

//        List<String> result = input.stream().map(i -> i % 3 == 0 ? "fizz" : i % 5 == 0 ? "buzz" : "fizzbuzz")
//                .collect(Collectors.toList());

        List<String> result = new ArrayList<>(input.size());


        for (Integer i : input) {
            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0) {
                sb.append("fizz");
            }

            if (i % 5 == 0) {
                sb.append("buzz");
            }

            if (sb.isEmpty()) {
                result.add(i.toString());
            } else {
                result.add(sb.toString());
            }
        }
        return result;

    }
}
//    Zaimplementuj metodę Collection<String> fizzbuzz(Collection<Integer> input)
//    Metoda powinna przekształcić input na kolekcję stringów bazując na poniższym algorytmie:
//        - jeżeli liczba jest podzielna przez 3 = fizz
//        - jeżeli liczba jest podzielna przez 5 = buzz
//        - jeżeli liczba jest podzielna przez 3 i 5 = fizzbuzz
//    w przeciwnym wypadku zwracamy wartość z input