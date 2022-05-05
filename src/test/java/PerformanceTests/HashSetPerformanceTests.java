package PerformanceTests;

import HashSet.HashySet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;

@ExtendWith(MockitoExtension.class)
public class HashSetPerformanceTests {

    @Test
    void addNewRecordToSet() {
        //given
        HashSet<Integer> set = new HashSet<>();
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                set.add(1);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRecordFromSet() {
        //when
        double avg = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                set.add(1);
                set.remove(1);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void checkIfSetContainsRecord() {
        //given
        HashSet<Integer> set = new HashSet<>();
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            set.add(i);
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                set.contains(i);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }
}
