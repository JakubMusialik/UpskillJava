package DesignPatterns.ChainOfResponsility.Children;

import DesignPatterns.ChainOfResponsility.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjela sloik z polki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }

}
