package zadania;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isNumAmstrong(371));
        System.out.println(isNumAmstrong(407));
        System.out.println(isNumAmstrong(153));

    }


    static String isNumAmstrong(int n) {

        char[] numbers = String.valueOf(n).toCharArray();

        int sum = sumNumberCubes(numbers);
        if (sum == n) {
            return "Armstrong";
        }
        return "Podrabianiec";
    }

    static int sumNumberCubes(char[] numbers) {
        int sumOfNumbers = 0;

        for (char number : numbers) {
            int numericValue = Character.getNumericValue(number);
            sumOfNumbers += Math.pow(numericValue, 3);
        }
        return sumOfNumbers;
    }
}
//
//        Write a Java program to check if a number is Armstrong or not ?
//        An Armstrong number of three digits is an integer such that the sum of the cubes of its digits
//        is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

