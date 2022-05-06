package PerformanceTests;

import LinkedList.LinkyList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LinkyListPerformanceTests {

    @Test
    void addNewRecordToTheList() {
        //given
        double avg = 0;
        LinkyList<Integer> list = new LinkyList<>();
        //when
        for (int i = 0; i < 10; i++) {
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                list.add(1);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void getRecordFromList() {
        //given
        double avg = 0;
        LinkyList<Integer> list = new LinkyList<>();
        //when
        for (int i = 0; i < 10; i++) {
            list.add(i);
            double start = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                list.get(i);
            }
            double stop = System.nanoTime();
            //then
            double elapsedTime = stop - start;
            avg += elapsedTime;
        }
        System.out.println("Average execution time is: " + (avg / 10) / 1000000 + " miliseconds.");
    }

    @Test
    void removeRecordFromList() {
        //given
        double avg = 0;
        LinkyList<Integer> list = new LinkyList<>();
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
    void removeMiddleRecordFromList() {
        //given
        double avg = 0;
        LinkyList<Integer> list = new LinkyList<>();
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
    void removeRandomRecordFromList() {
        //given
        double avg = 0;
        LinkyList<Integer> list = new LinkyList<>();
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
    void checkIfListContainsRecord() {
        //given
        LinkyList<Integer> list = new LinkyList<>();
        double avg = 0;
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
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