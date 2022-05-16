package DesignPatterns.Memento;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Zapisano backup nr: " + operatingSystemMemento.getBackupNumber() +
                " z data: " + operatingSystemMemento.getBackupDate());

        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup nr: " + operatingSystemMemento.getBackupNumber() +
                " z data: " + operatingSystemMemento.getBackupDate());

        return operatingSystemMemento;
    }
}