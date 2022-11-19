package com.caio.structuralpatterns.bridge.shape2;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color.");
    }
}
