package DesignPatterns.Visitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}
