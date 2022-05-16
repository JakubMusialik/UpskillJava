package DesignPatterns.State;

public class NoCoinState implements State {

    public void insertTheCoin(SlotMachine context) {
        System.out.println("Wrzucono monete.");
        context.state = new CoinInsertState();
    }

    public void pushTheLever(SlotMachine context) {
        System.out.println("Wrzuc monete by zagrac.");
    }

    public void collectTheWinnings(SlotMachine context) {
        System.out.println("Wrzuc monete by dac sobie szanse na wygrana.");
    }

    public void currentState(SlotMachine context) {
        System.out.println("Aktualny stan - BRAK MONETY");
    }
}
