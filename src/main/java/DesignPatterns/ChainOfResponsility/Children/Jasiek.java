package DesignPatterns.ChainOfResponsility.Children;


import DesignPatterns.ChainOfResponsility.MotherRequest;

public class Jasiek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Jasiek zdjal sloik z polki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }

}