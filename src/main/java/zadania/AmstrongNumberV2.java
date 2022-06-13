package zadania;

public class AmstrongNumberV2 {


    static String isNumAmstrong(int n) {

        char[] numbers = String.valueOf(n).toCharArray();
        int sumOfNumbers = 0;

        if(numbers.length > 3){
            throw new IllegalArgumentException();
        }

        for (char number : numbers) {
            int numericValue = Character.getNumericValue(number);
            sumOfNumbers += Math.pow(numericValue, 3);
        }
        if (sumOfNumbers == n) {
            return "Armstrong";
        }
        return "Podrabianiec";
    }
}
