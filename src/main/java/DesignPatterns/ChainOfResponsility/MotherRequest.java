package DesignPatterns.ChainOfResponsility;

import DesignPatterns.ChainOfResponsility.Children.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }

}