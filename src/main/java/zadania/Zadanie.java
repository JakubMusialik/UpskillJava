package zadania;

import java.util.ArrayList;
import java.util.List;

public class Zadanie {


    static List<Integer> mergeSort(List<Integer> input) {
        return sort(input, 0, input.size() - 1);
    }


    static List<Integer> sort(List<Integer> input, int left, int right) {

        int size = right - left + 1;


        if (size <= 2) {
            Integer leftValue = input.get(left);
            Integer rightValue = input.get(right);

            if (leftValue > rightValue) {
                List<Integer> sorted = new ArrayList<>(size);
                sorted.add(rightValue);
                sorted.add(leftValue);
                return sorted;
            } else {
                List<Integer> sorted = new ArrayList<>(size);
                sorted.add(leftValue);
                sorted.add(rightValue);
                return sorted;
            }
        }

        int mid = (left + right) / 2;

        List<Integer> sortedLeft = sort(input, left, mid);

        List<Integer> sortedRight = sort(input, mid +1 , right);


        return merge(sortedLeft, sortedRight);
    }


    static List<Integer> merge(List<Integer> sortedLeft, List<Integer> sortedRight) {
        List<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < sortedLeft.size() && j < sortedRight.size()) {

            Integer left = sortedLeft.get(i);
            Integer right = sortedRight.get(j);

            if (left < right) {
                mergedList.add(left);
                i++;
            } else {
                mergedList.add(right);
                j++;
            }
        }
        if (i >= sortedLeft.size()) {
            for (int k = j; k < sortedRight.size(); k++) {
                mergedList.add(sortedRight.get(k));
            }
        } else {
            for (int k = i; k < sortedLeft.size(); k++) {
                mergedList.add(sortedLeft.get(k));
            }
        }

        return mergedList;
    }
}

// testy, + implementacja mergeSorta dla nieparzystej dł listy.
//sortowac listę w miejscu, (input) --> bez robienia dodatkowych arrayów
// testy ^
//metoda sortująca void