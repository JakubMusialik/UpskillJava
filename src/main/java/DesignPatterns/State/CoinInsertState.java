package DesignPatterns.State;

import java.util.Random;

public class CoinInsertState implements State {

    static final private Random random = new Random();

    public void insertTheCoin(SlotMachine context) {
        System.out.println("Moneta znajduje sie juz w automacie.");
    }

    public void pushTheLever(SlotMachine context) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if (result < 20) {
            System.out.println("Wygrana! Odbierz swoja nagrode");
            context.state = new WinState();
        } else {
            System.out.println("Przegrana. Moze nastepnym razem sie uda?");
            context.state = new NoCoinState();
        }
    }

    public void collectTheWinnings(SlotMachine context) {
        System.out.println("Pociagnij dzwignie by sprawdzic swoje szczescie.");
    }

    public void currentState(SlotMachine context) {
        System.out.println("Aktualny stan - WRZUCONO MONETE");
    }
}