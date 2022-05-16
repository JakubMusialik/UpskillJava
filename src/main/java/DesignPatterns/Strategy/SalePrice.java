package DesignPatterns.Strategy;

public class SalePrice implements PriceStrategy{

    @Override
    public void calculatePrice(int price, boolean isSignedForNewsletter) {
        if(isSignedForNewsletter){
            System.out.println("Cena wynosi: " + (price/2) + " użytkownik jest zapisany do newslettera");
        }else{
            System.out.println("Easter egg");
        }
    }
}
