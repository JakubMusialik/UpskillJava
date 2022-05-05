package PerformanceTests;

import HashSet.HashySet;
import org.junit.jupiter.api.Test;

public class HashySetPerformanceTests {

    @Test
    void addNewRecordToSet() {
        //given
        HashySet<Integer> set = new HashySet<>();
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
        HashySet<Integer> set = new HashySet<>();
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
        HashySet<Integer> set = new HashySet<>();
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