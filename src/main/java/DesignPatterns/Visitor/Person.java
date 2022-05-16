package DesignPatterns.Visitor;

public class Person implements Transportable {

    private String name;
    private String lastName;
    private boolean isRegularCustomer;

    public Person(String name, String lastName, boolean isRegularCustomer) {
        this.name = name;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

}
