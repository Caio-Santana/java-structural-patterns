package com.caio.structuralpatterns.bridge.shape1;

public class GreenSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("applying green color.");
    }
}
