package zadania;

import java.util.Arrays;

public class Zad3 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50}; // 150
        int b = 98;

        System.out.println(calculatePrice(a, b)); // 150 --> 140
    }


    static int calculatePrice(int[] prices, int discount) {
        Arrays.sort(prices);
        int expensive = prices[prices.length - 1]; //50

        int afterDiscount = (int) (expensive * discount / 100.0); //10% z 50 = 5
        expensive -= afterDiscount; // 50 - 5 = 45
        prices[prices.length - 1] = expensive;

        int sum = 0;
        for (int i : prices) {
            sum += i;
        }
        return sum;
    }
}