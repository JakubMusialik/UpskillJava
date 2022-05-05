package PerformanceTests;

import HashMap.HashyMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HashyMapPerformanceTests {

    @Test
    void addNewRecordToMap() {
        //given
        HashyMap<Integer, String> map = new HashyMap<>();
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                map.add(1, "A");
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void getRecordFromMap() {
        //given
        double avg = 0;
        HashyMap<Integer, String> map = new HashyMap<>();
        //when
        for (int i = 0; i < 10; i++) {
            map.add(i,"1");
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                map.get(i);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRecordFromMap() {
        //when
        double avg = 0;
        HashyMap<Integer,String> map = new HashyMap<>();
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                map.add(1,"1");
                map.remove(i);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void checkIfMapContainsRecord() {
        //given
        HashyMap<Integer,String> map = new HashyMap<>();
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            map.add(i,"1");
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                map.containsKey(i);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }
}