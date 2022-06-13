package zadania;

import org.junit.jupiter.api.Test;
import zadania.Main;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void fizzbuzz() {
        //given
        List<Integer> input = List.of(1,2,3,4,5,15);
        List<String> result = List.of("1","2","fizz","4","buzz","fizzbuzz");
        //when
        Collection<String> fizzbuzz = Main.fizzbuzz(input);
        //then
        assertIterableEquals(result,fizzbuzz);
    }
}