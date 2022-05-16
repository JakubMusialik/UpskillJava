package DesignPatterns.State;

public class WinState implements State {

    public void insertTheCoin(SlotMachine context) {
        System.out.println("Przed ponowna gra zabierz swoja nagrode.");
    }

    public void pushTheLever(SlotMachine context) {
        System.out.println("rzed ponowna gra zabierz swoja nagrode.");
    }

    public void collectTheWinnings(SlotMachine context) {
        System.out.println("Zabrano monety. Gratulacje.");
        context.state = new NoCoinState();
    }

    public void currentState(SlotMachine context) {
        System.out.println("Aktualny stan - WYGRANA");
    }
}
