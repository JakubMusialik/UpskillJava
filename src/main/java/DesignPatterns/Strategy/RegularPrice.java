package DesignPatterns.Strategy;

public class RegularPrice implements PriceStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedForNewsletter) {
        if (!isSignedForNewsletter) {
            System.out.println("Cena wynosi: " + price + " użytkownik nie jest zapisany do newslettera");
        }else{
            System.out.println("Easter egg");
        }
    }
}
