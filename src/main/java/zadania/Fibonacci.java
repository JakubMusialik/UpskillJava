package zadania;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(countFibonacciSum(14));
        System.out.println(countFibonacciSum(20));
        System.out.println(countFibonacciSum(100));
    }


    static int countFibonacciSum(int n) {

        int prevElement = 0; //1 wyraz ciągu
        int currentElement = 1; //2 wyraz ciągu

        int tempElement;
        int fibonacciSum = 0;
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2) {
            return fibonacciSum;
        }
        //n wyraz ciągu
        for (int i = 2; i < n; i++) {

            tempElement = currentElement; //1 -> 1 -> 2 -> 3 -> 5 -> 8 -> 13 -> 21 -> 34 -> 55

            currentElement = prevElement + currentElement; //1 -> 2 -> 3 -> 5 -> 8 -> 13 -> 21 -> 34 -> 55 -> 89

            prevElement = tempElement; //1 -> 1 -> 2 -> 3 -> 5 -> 8 -> 13 -> 21 -> 34 -> 55

            if (currentElement % 2 == 0) {

                fibonacciSum += currentElement; //1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89

            }
        }
        return fibonacciSum;
    }
}
