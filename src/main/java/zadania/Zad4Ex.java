package zadania;

import java.util.List;
import java.util.stream.Collectors;

public class Zad4Ex {

    public static List<Long> findSum(List<Integer> numbers,
                                     List<List<Integer>> queries) {

        return queries.stream()
                .map(query -> calculateSum(numbers, query))
                .collect(Collectors.toList());
    }

    private static long calculateSum(List<Integer> numbers, List<Integer> query) {
        long querySum = 0;
        int startIndex = query.get(0);
        int endIndex = query.get(1);
        int x = query.get(2);
        for (int i = startIndex; i <= endIndex; i++) {
            Integer integer = numbers.get(i);
            if (integer.equals(0)) {
                querySum += x;
            } else {
                querySum += integer;
            }
        }
        return querySum;
    }

//    static long countSum(List<Integer> query, List<Integer> numbers){
//        long querySum = 0;
//        int startIndex = query.get(0);
//        int endIndex = query.get(1);
//        int x = query.get(2);
//        for (int i = startIndex; i <= endIndex; i++) {
//            Integer integer = numbers.get(i);
//            if (integer.equals(0)) {
//                querySum += x;
//            } else {
//                querySum += integer;
//            }
//        }
//        return querySum;
//    }
}