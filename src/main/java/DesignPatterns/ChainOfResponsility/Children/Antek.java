package DesignPatterns.ChainOfResponsility.Children;

import DesignPatterns.ChainOfResponsility.MotherRequest;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjal sloik z polki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }

}
