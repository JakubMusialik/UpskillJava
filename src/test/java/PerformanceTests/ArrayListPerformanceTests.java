package PerformanceTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ArrayListPerformanceTests {
    //JVM musi się rozkręcić - różne czasy testów
    //JIT just in time compile <-- check
    @Test
    void addNewRecordToArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 100000; j++) {
                list.add(1);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
//        BigDecimal bigDecimal = new BigDecimal(elapsedTime);
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void getRecordFromArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        //when
        for (int i = 0; i < 10; i++) {
            list.add(i);
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                list.get(0);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRecordFromArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                list.add(1);
                list.remove(0);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void checkIfArrayListContainsRecord() {
        //given
        List<Integer> list = new ArrayList<>();
        list.add(1);
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                list.contains(1);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }
}
