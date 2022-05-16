package DesignPatterns.Visitor;

public class Animal implements Transportable{

    private String breed;
    private int weight;

    public Animal(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }
}
