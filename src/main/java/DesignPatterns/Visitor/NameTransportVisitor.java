package DesignPatterns.Visitor;

public class NameTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("Animal type: " + animal.getBreed());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Person name: " + person.getName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment destination: " + shipment.getPrefix() + "-" + shipment.getSerialNumber());
    }
}

