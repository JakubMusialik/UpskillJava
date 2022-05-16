package DesignPatterns.TemplateMethod;

public class MyDay extends WeekDay {

    protected void work() {
        System.out.println("Przerwa na kawke!");
    }

    public int goToWork(TypeOfTransport transport) {
        switch (transport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 18;
            default:
                return 20;
        }
    }
}