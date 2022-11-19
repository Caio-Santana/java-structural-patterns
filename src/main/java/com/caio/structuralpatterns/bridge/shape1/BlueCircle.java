package com.caio.structuralpatterns.bridge.shape1;

public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("applying blue color.");
    }
}
