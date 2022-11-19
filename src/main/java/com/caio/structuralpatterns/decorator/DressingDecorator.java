package com.caio.structuralpatterns.decorator;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
