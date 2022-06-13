package zadania;

import org.junit.jupiter.api.Test;
import zadania.Zad4;
import zadania.Zad4Ex;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Zad4Test {

    @Test
    void findSum() {
        //given
        List<Integer> nums = List.of(1,2,3,4,0,5,6,7);
        List<Integer> query1 = List.of(0, 2, 10);
        List<Integer> query2 = List.of(1, 5, 10);
        List<Integer> query3 = List.of(2, 4, 10);
        List<List<Integer>> queries = List.of(query1, query2, query3);
        List<Long> expected = List.of(6L,24L,17L);
        //when
        List<Long> sum = Zad4Ex.findSum(nums, queries);
        //then
        assertIterableEquals(expected,sum);
    }
}