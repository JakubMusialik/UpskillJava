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
                list.add(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
//        BigDecimal bigDecimal = new BigDecimal(elapsedTime);
            avg += elapsedTime;
        }
        System.out.println("Average execution time for add method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void getRecordFromArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < list.size(); j++) {
                list.get(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for get method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRecordFromArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < list.size(); j++) {
                list.remove(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for remove method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }



    @Test
    void removeMiddleRecordFromArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < list.size(); j++) {
                list.remove(list.size()/2);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for remove(in the middle) method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRandomRecordFromArrayList() {
        //given
        double avg = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < list.size(); j++) {
                int random = (int) (Math.random() * (list.size()));
                list.remove(random);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for remove(random index) method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void checkIfArrayListContainsRecord() {
        //given
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < list.size(); j++) {
                list.contains(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for contains method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }
}
