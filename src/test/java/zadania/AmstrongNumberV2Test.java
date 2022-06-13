//import org.junit.jupiter.api.Test;
//import zadania.AmstrongNumberV2;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AmstrongNumberV2Test {
//
//    @Test
//    void shouldPrintArmstrong() {
//        //given
//        int amstrong = 371;
//        //when
//        String numAmstrong = AmstrongNumberV2.isNumAmstrong(amstrong);
//        //then
//        assertEquals("Armstrong",numAmstrong);
//    }
//
//
//    @Test
//    void shouldPrintPodrabianiec(){
//        //given
//        int notAmstrong = 163;
//        //when
//        String numAmstrong = AmstrongNumberV2.isNumAmstrong(notAmstrong);
//        //then
//        assertEquals("Podrabianiec",numAmstrong);
//    }
//
//    @Test
//    void shouldThrowExceptionWhenNumbersIsBiggerThan3Digits(){
//        //given
//        //when
//        //then
//        assertThrows(IllegalArgumentException.class,
//                () -> AmstrongNumberV2.isNumAmstrong(1234));
//    }
//}