package com.caio.structuralpatterns.bridge.shape1;

public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("applying red color.");
    }
}
