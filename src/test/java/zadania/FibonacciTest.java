package zadania;

import org.junit.jupiter.api.Test;
import zadania.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void countFibonacciSum() {
        //given
        int n = 7;
        //when
        int result7 = Fibonacci.countFibonacciSum(n);
        //then
        assertEquals(10, result7);
    }

    @Test
    void shouldThrowExceptionWhenNisLessThanZero() {
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class, () ->
                Fibonacci.countFibonacciSum(-1));
    }

    @Test
    void shouldReturn0whenNisEqualOne() {
        //given
        int n = 1;
        //when
        int i = Fibonacci.countFibonacciSum(n);
        //then
        assertEquals(0,i);
    }

    @Test
    void shouldReturn0whenNisEqualTwo(){
        //given
        int n = 2;
        //when
        int i = Fibonacci.countFibonacciSum(n);
        //then
        assertEquals(0,i);
    }

    @Test
    void shouldThrowExceptionWhenNisEqualZero(){
        //given
        int n = 0;
        //when
        //then
        assertThrows(IllegalArgumentException.class, () ->
                Fibonacci.countFibonacciSum(n));
    }
}