package PerformanceTests;

import HashMap.HashyMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

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
        System.out.println("Average execution time for add method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void getRecordFromMap() {
        //given
        double avg = 0;
        HashyMap<Integer, String> map = new HashyMap<>();
        for (int i = 0; i < 10000; i++) {
            map.add(i, "1");
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < map.size(); j++) {
                map.get(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for get method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRecordFromMap() {
        //given
        double avg = 0;
        HashyMap<Integer, String> map = new HashyMap<>();
        for (int i = 0; i < 10000; i++) {
            map.add(i, "1");
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < map.size(); j++) {

                map.remove(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for remove method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void checkIfMapContainsRecord() {
        //given
        HashyMap<Integer, String> map = new HashyMap<>();
        double avg = 0;
        for (int i = 0; i < 10000; i++) {
            map.add(i, "1");
        }
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < map.size(); j++) {
                map.containsKey(j);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time for containsKey method is: " + (avg / 10) / 1000000 + " miliseconds.");
    }
}