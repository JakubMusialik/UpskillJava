package zadania;

import java.util.stream.IntStream;

public class ArmstrongV3 {


    static boolean isNumberArmstrong(int number) {

//        char[] numberDigit = String.valueOf(number).toCharArray();

//        int sumOfDigits = 0;

//        if(numberDigit.length != 3){
//            throw new IllegalArgumentException();
//        }
        if(number < 100 || number > 999){
            throw new IllegalArgumentException();
        }

        int sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .map(ArmstrongV3::cubePower)
                .sum();

//        for (char c : numberDigit) {
//            int numericValue = Character.getNumericValue(c);
//            sumOfDigits += Math.pow(numericValue, 3);
//        }

        return sum == number;
    }

    static int cubePower(int n){
        return (int) Math.pow(n,3);
    }

}


//
//        Write a Java program to check if a number is Armstrong or not ?
//        An Armstrong number of three digits is an integer such that the sum of the cubes of its digits
//        is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.