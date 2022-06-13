package zadania;

import java.util.ArrayList;
import java.util.List;

public class Zad4 {

    public static List<Long> findSum(List<Integer> numbers,
                                     List<List<Integer>> queries) {
        List<Long> sum = new ArrayList<>(queries.size());

        for (List<Integer> query : queries) {
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
            sum.add(querySum);
        }
        return sum;
    }



}
