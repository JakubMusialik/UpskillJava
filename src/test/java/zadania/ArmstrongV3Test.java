package zadania;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongV3Test {


    // sparametryzowany test do 2 pierwszych testow
    // sparametryzowany do 2 assertThrows
    @ParameterizedTest
    @CsvSource({"371,true","375,false"})
    void shouldReturnTrueOrFalseWhenCheckingNumbers(int n, boolean expected){
        //given
        //when
        boolean numberArmstrong = ArmstrongV3.isNumberArmstrong(n);
        //then
        assertEquals(expected,numberArmstrong);
    }

    @ParameterizedTest
    @ValueSource(ints = {99,1000})
    void shouldThrowExceptionWhenCheckingNumbers(int n){
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class,
                ()-> ArmstrongV3.isNumberArmstrong(n));

    }
    @Test
    void shouldReturnTrueIfNumberIsArmstrong() {
        //given
        int armstrong = 371;
        //when
        boolean numberArmstrong = ArmstrongV3.isNumberArmstrong(armstrong);
        //then
        assertTrue(numberArmstrong);
    }

    @Test
    void shouldReturnFalseIfNumberIsArmstrong() {
        //given
        int notArmstrong = 476;
        //when
        boolean numberArmstrong = ArmstrongV3.isNumberArmstrong(notArmstrong);
        //then
        assertFalse(numberArmstrong);
    }

    @Test
    void shouldThrowExceptionWhenNumberLengthIsLowerThan3(){
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class,
                () -> ArmstrongV3.isNumberArmstrong(99));
    }

    @Test
    void shouldThrowExceptionWhenNumberLengthIsHigherThan3(){
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class,
                () -> ArmstrongV3.isNumberArmstrong(1000));
    }
}
