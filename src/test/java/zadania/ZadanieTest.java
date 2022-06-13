package zadania;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZadanieTest {

    //nieparzyste
    @Test
    void mergeSortWith3Elements(){
        //given
        List<Integer> input = List.of(8,7,6);
        List<Integer> expected = List.of(6,7,8);
        //when
        List<Integer> sortedInput = Zadanie.mergeSort(input);
        //then
        assertIterableEquals(expected,sortedInput);
    }

    @Test
    void mergeSortWith8ElementsReversed(){
        //given
        List<Integer> input = List.of(8,7,6,5,4,3,2,1);
        List<Integer> expected = List.of(1,2,3,4,5,6,7,8);
        //when
        List<Integer> sortedInput = Zadanie.mergeSort(input);
        //then
        assertIterableEquals(expected,sortedInput);
    }

    @Test
    void mergeSortWith8Elements(){
        //given
        List<Integer> input = List.of(3,12,6,8,1,2,10,14);
        List<Integer> expected = List.of(1,2,3,6,8,10,12,14);
        //when
        List<Integer> sortedInput = Zadanie.mergeSort(input);
        //then
        assertIterableEquals(expected,sortedInput);
    }

    @Test
    void mergeSortWith4Elements(){
        //given
        List<Integer> input = List.of(3,6,1,2);
        List<Integer> expected = List.of(1,2,3,6);
        //when
        List<Integer> sortedInput = Zadanie.mergeSort(input);
        //then
        assertIterableEquals(expected,sortedInput);
    }

    @Test
    void mergeSort() {
        //given
        List<Integer> input = List.of(1,2,3,6,7,9,11,33);
        List<Integer> expected = List.of(1,2,3,6,7,9,11,33);
        //when
        List<Integer> sortedInput = Zadanie.mergeSort(input);
        //then
        assertIterableEquals(expected,sortedInput);
    }

    @Test
    void mergeSortWith2Elements(){
        //given
        List<Integer> input = List.of(6,3);
        List<Integer> expected = List.of(3,6);
        //when
        List<Integer> sortedInput = Zadanie.mergeSort(input);
        //then
        assertIterableEquals(expected,sortedInput);
    }
}