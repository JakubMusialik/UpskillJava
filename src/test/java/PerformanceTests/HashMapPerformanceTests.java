package PerformanceTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

@ExtendWith(MockitoExtension.class)
public class HashMapPerformanceTests {

    @Test
    void addNewRecordToMap() {
        //given
        HashMap<Integer,String> map = new HashMap<>();
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                map.put(1, "A");
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
        HashMap<Integer,String> map = new HashMap<>();
        //when
        for (int i = 0; i < 10; i++) {
            map.put(i,"1");
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
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                map.put(1,"1");
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
        HashMap<Integer,String> map = new HashMap<>();
        double avg = 0;
        //when
        for (int i = 0; i < 10; i++) {
            map.put(i,"1");
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
