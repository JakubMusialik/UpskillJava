package DesignPatterns.Strategy;

public class PriceCalculator {

    private PriceStrategy priceStrategy;

    public void calculate(int price, boolean isSignedToNewsletter) {
        this.priceStrategy.calculatePrice(price, isSignedToNewsletter);
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }
}
